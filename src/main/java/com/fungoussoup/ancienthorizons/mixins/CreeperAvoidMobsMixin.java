package com.fungoussoup.ancienthorizons.mixins;

import net.minecraft.world.entity.monster.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import com.fungoussoup.ancienthorizons.entity.custom.SnowLeopardEntity;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;

public class CreeperAvoidMobsMixin {
    @Mixin(Creeper.class)
        public class CreeperAvoidMobsMixin {
            
            @Inject(method = "registerGoals", at = @At("TAIL"))
            private void addAvoidanceGoals(CallbackInfo ci) {
                Creeper creeper = (Creeper) (Object) this;
                
                // Add avoidance for snow leopards and tigers
                creeper.goalSelector.addGoal(3, new AvoidEntityGoal<>(
                    creeper, 
                    SnowLeopardEntity.class, 
                    6.0F,  // detection range
                    1.0D,  // slow speed multiplier
                    1.2D   // fast speed multiplier
                ));
                
                creeper.goalSelector.addGoal(3, new AvoidEntityGoal<>(
                    creeper, 
                    TigerEntity.class, 
                    6.0F, 
                    1.0D, 
                    1.2D
                ));
            }
        }
}