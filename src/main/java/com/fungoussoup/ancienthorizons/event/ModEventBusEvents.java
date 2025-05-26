package com.fungoussoup.ancienthorizons.event;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.ModEntities;
import com.fungoussoup.ancienthorizons.entity.client.TigerModel;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = AncientHorizons.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TigerModel.LAYER_LOCATION, TigerModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TIGER.get(), TigerEntity.createAttributes().build());
    }
}
