package com.fungoussoup.ancienthorizons.item;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientHorizons.MOD_ID);

    public static final DeferredItem<Item> TIME_STONE = ITEMS.register("time_stone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIME_STONE = ITEMS.register("raw_time_stone",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword",
            () -> new SwordItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ALUMINIUM,5.0f,-2.4f))));
    public static final DeferredItem<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM,1.4f,-2.8f))));
    public static final DeferredItem<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
            () -> new ShovelItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ALUMINIUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
            () -> new AxeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ALUMINIUM,6.0f,-3.2f))));
    public static final DeferredItem<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
            () -> new HoeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ALUMINIUM,0f,-3.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
