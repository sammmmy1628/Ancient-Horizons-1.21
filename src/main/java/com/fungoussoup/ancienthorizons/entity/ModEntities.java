package com.fungoussoup.ancienthorizons.entity;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, AncientHorizons.MOD_ID);

    public static final Supplier<EntityType<TigerEntity>> TIGER =
            ENTITY_TYPES.register("tiger", () -> EntityType.Builder.of(TigerEntity::new, MobCategory.CREATURE)
                    .sized(2f,1.5f).build("tiger"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
