package com.fungoussoup.ancienthorizons.item;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientHorizons.MOD_ID);

    public static final DeferredItem<Item> TIME_STONE = ITEMS.register("time_stone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIME_STONE = ITEMS.register("raw_time_stone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
