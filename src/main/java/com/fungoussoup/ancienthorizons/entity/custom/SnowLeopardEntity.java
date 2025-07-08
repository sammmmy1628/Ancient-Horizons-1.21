package com.fungoussoup.ancienthorizons.entity.custom;

import com.fungoussoup.ancienthorizons.entity.ModEntities;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;

import net.minecraft.server.level.ServerLevel;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.TamableAnimal;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.tags.ItemTags;

import com.fungoussoup.ancienthorizons.registry.ModTags;

import javax.annotation.Nullable;
import java.util.UUID;

public class SnowLeopardEntity extends TamableAnimal {

    private static final EntityDataAccessor<Boolean> DATA_TAMED_ID = SynchedEntityData.defineId(SnowLeopardEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> DATA_SITTING_ID = SynchedEntityData.defineId(SnowLeopardEntity.class, EntityDataSerializers.BOOLEAN);

    public SnowLeopardEntity(EntityType<? extends SnowLeopardEntity> entityType, Level level) {
        super(entityType, level);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(2, new PanicGoal(this, 2.0));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.25, 10.0F, 2.0F));
        this.goalSelector.addGoal(6, new FollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0, 1.0000001E-5F));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new NonTameRandomTargetGoal<>(this, LivingEntity.class, false, entity -> entity.getType().is(ModTags.EntityTypes.SNOW_LEOPARD_PREY)));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 18.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 6.0D);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ItemTags.MEAT);
    }


    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public boolean isTame() {
        return this.entityData.get(DATA_TAMED_ID) != null && this.entityData.get(DATA_TAMED_ID);
    }

    public void setTame(boolean tamed) {
        this.entityData.set(DATA_TAMED_ID, tamed);
    }

    @Override
    public boolean isInSittingPose() {
        return this.entityData.get(DATA_SITTING_ID) != null && this.entityData.get(DATA_SITTING_ID);
    }

    @Override
    public void setInSittingPose(boolean sitting) {
        this.entityData.set(DATA_SITTING_ID, sitting);
    }

    public void setOwnerUUID(@Nullable UUID ownerUUID) {
        super.setOwnerUUID(ownerUUID);
        this.setTame(ownerUUID != null);
    }

    @Override
    public UUID getOwnerUUID() {
        return super.getOwnerUUID();
    }

    @Override
    public SnowLeopardEntity getBreedOffspring(ServerLevel level, AgeableMob ageable) {
        EntityType<? extends SnowLeopardEntity> type = (EntityType<? extends SnowLeopardEntity>) this.getType();
        SnowLeopardEntity offspring = type.create(level);
        if (offspring != null) {
            if (this.isTame() && this.getOwnerUUID() != null) {
                offspring.setOwnerUUID(this.getOwnerUUID());
                offspring.setTame(true);
            } else {
                offspring.setTame(false);
            }
            offspring.setAge(-24000); // Set to baby
        }
        return offspring;
    }
}
