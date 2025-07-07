package com.fungoussoup.ancienthorizons.entity.custom;

import com.fungoussoup.ancienthorizons.entity.ModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;

import net.minecraft.server.level.ServerLevel;

import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.util.TimeUtil;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.animal.*;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import com.fungoussoup.ancienthorizons.registry.ModTags;

import javax.annotation.Nullable;
import java.util.UUID;

public class TigerEntity extends Animal implements NeutralMob {

    private float clientSideStandAnimationO;
    private float clientSideStandAnimation;
    private int warningSoundTicks;
    private static final UniformInt PERSISTENT_ANGER_TIME = TimeUtil.rangeOfSeconds(20, 39);
    private int remainingPersistentAngerTime;
    @Nullable
    private UUID persistentAngerTarget;

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState angryAnimationState = new AnimationState();


    public TigerEntity(EntityType<? extends TigerEntity> entityType, Level level) {
        super(entityType, level);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on the animal type)
     */
    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.PORKCHOP);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0, p_350292_ -> p_350292_.isBaby() ? DamageTypeTags.PANIC_CAUSES : DamageTypeTags.PANIC_ENVIRONMENTAL_CAUSES));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new TigerHurtByTargetGoal());
        this.targetSelector.addGoal(2, new TigerAttackPlayersGoal());
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, this::isAngryAt));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, ModTags.TIGER_PREY, 10, false, false, null));
        this.targetSelector.addGoal(5, new ResetUniversalAngerTargetGoal<>(this, false));

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.FOLLOW_RANGE, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.3)
                .add(Attributes.ATTACK_DAMAGE, 5.0);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.readPersistentAngerSaveData(this.level(), compound);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        this.addPersistentAngerSaveData(compound);
    }

    @Override
    public void startPersistentAngerTimer() {
        this.setRemainingPersistentAngerTime(PERSISTENT_ANGER_TIME.sample(this.random));
    }

    @Override
    public void setRemainingPersistentAngerTime(int time) {
        this.remainingPersistentAngerTime = time;
    }

    @Override
    public int getRemainingPersistentAngerTime() {
        return this.remainingPersistentAngerTime;
    }

    @Override
    public void setPersistentAngerTarget(@Nullable UUID target) {
        this.persistentAngerTarget = target;
        System.out.println("Tiger is now targeting: " + target);
    }

    @Nullable
    @Override
    public UUID getPersistentAngerTarget() {
        return this.persistentAngerTarget;
    }

//    @Override
//    protected SoundEvent getAmbientSound() {
//        return this.isBaby() ? SoundEvents.POLAR_BEAR_AMBIENT_BABY : SoundEvents.POLAR_BEAR_AMBIENT;
//    }
//
//    @Override
//    protected SoundEvent getHurtSound(DamageSource damageSource) {
//        return SoundEvents.POLAR_BEAR_HURT;
//    }
//
//    @Override
//    protected SoundEvent getDeathSound() {
//        return SoundEvents.POLAR_BEAR_DEATH;
//    }
//
//    @Override
//    protected void playStepSound(BlockPos pos, BlockState block) {
//        this.playSound(SoundEvents.POLAR_BEAR_STEP, 0.15F, 1.0F);
//    }
//
//    protected void playWarningSound() {
//        if (this.warningSoundTicks <= 0) {
//            this.makeSound(SoundEvents.POLAR_BEAR_WARNING);
//            this.warningSoundTicks = 40;
//        }
//    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
    }

    public boolean isAngry() {
        return this.persistentAngerTarget != null;
    }

    private void setupAnimationStates() {
        if (this.isAngry()) {

            angryAnimationState.start(this.tickCount);

        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            if (this.clientSideStandAnimation != this.clientSideStandAnimationO) {
                this.refreshDimensions();
            }
            this.setupAnimationStates();

            this.clientSideStandAnimationO = this.clientSideStandAnimation;
            if (this.isAngry()) {
                this.angryAnimationState.start(this.tickCount);
            }
        }

        if (this.warningSoundTicks > 0) {
            this.warningSoundTicks--;
        }

        if (!this.level().isClientSide) {
            this.updatePersistentAnger((ServerLevel)this.level(), true);
        }
    }

    @Override
    public EntityDimensions getDefaultDimensions(Pose pose) {
        if (this.clientSideStandAnimation > 0.0F) {
            float f = this.clientSideStandAnimation / 6.0F;
            float f1 = 1.0F + f;
            return super.getDefaultDimensions(pose).scale(1.0F, f1);
        } else {
            return super.getDefaultDimensions(pose);
        }
    }


    @Override
    protected float getWaterSlowDown() {
        return 0.98F;
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        if (spawnGroupData == null) {
            spawnGroupData = new AgeableMobGroupData(1.0F);
        }

        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.TIGER.get().create(level);
    }

    class TigerAttackPlayersGoal extends NearestAttackableTargetGoal<Player> {
        public TigerAttackPlayersGoal() {
            super(TigerEntity.this, Player.class, 20, true, true, null);
        }

        @Override
        public boolean canUse() {
            if (TigerEntity.this.isBaby()) {
                return false;
            } else {
                if (super.canUse()) {
                    for (TigerEntity tigerEntity : TigerEntity.this.level()
                            .getEntitiesOfClass(TigerEntity.class, TigerEntity.this.getBoundingBox().inflate(8.0, 4.0, 8.0))) {
                        if (tigerEntity.isBaby()) {
                            return true;
                        }
                    }
                }

                return false;
            }
        }

        @Override
        protected double getFollowDistance() {
            return super.getFollowDistance() * 0.5;
        }
    }

    class TigerHurtByTargetGoal extends HurtByTargetGoal {
        public TigerHurtByTargetGoal() {
            super(TigerEntity.this);
        }

        @Override
        public void start() {
            super.start();
            if (TigerEntity.this.isBaby()) {
                this.alertOthers();
                this.stop();
            }
        }

        @Override
        protected void alertOther(Mob mob, LivingEntity target) {
            if (mob instanceof TigerEntity && !mob.isBaby()) {
                super.alertOther(mob, target);
            }
        }
    }
}



