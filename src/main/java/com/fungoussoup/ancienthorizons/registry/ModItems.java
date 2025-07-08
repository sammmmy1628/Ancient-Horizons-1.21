package com.fungoussoup.ancienthorizons.registry;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.ModEntities;
import com.fungoussoup.ancienthorizons.item.*;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.fungoussoup.ancienthorizons.AncientHorizons.LOGGER;
import static com.fungoussoup.ancienthorizons.AncientHorizons.NAME;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientHorizons.MOD_ID);


    // TIMESTONE
    public static final DeferredItem<Item> TIME_STONE = ITEMS.register("time_stone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIME_STONE = ITEMS.register("raw_time_stone",
            () -> new Item(new Item.Properties()));


    // ALUMINIUM
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
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM,1.4f,-2.4f))));
    public static final DeferredItem<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
            () -> new ShovelItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ALUMINIUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
            () -> new AxeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ALUMINIUM,6.0f,-3.2f))));
    public static final DeferredItem<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
            () -> new HoeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ALUMINIUM,0f,-3.0f))));
    public static final DeferredItem<HammerItem> ALUMINIUM_HAMMER = ITEMS.register("aluminium_hammer",
            () -> new HammerItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM,2.8f,-2.8f))));

    public static final DeferredItem<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));


    // TIN
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));


    // BRONZE
    public static final DeferredItem<Item> BRONZE_ALLOY = ITEMS.register("bronze_alloy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ALUMINIUM,3f,-2.4f))));
    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM,1.5f,-3.0f))));
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ALUMINIUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ALUMINIUM,6.0f,-3.1f))));
    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ALUMINIUM,-2.0f,-1.0f))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(17))));
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(17))));
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(17))));

    // SILVER
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SILVER,3.0f,-2.4f))));
    public static final DeferredItem<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SILVER,1.0f,-2.8f))));
    public static final DeferredItem<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SILVER,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SILVER,5.0f,-3f))));
    public static final DeferredItem<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SILVER,-3f,-0f))));
    public static final DeferredItem<SwordItem> SILVER_KATANA = ITEMS.register("silver_katana",
            () -> new SwordItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SILVER,2.3f,-4f))));

    public static final DeferredItem<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));


    // PLATINUM
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM,3.0f,-2.4f))));
    public static final DeferredItem<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PLATINUM,1.0f,-2.8f))));
    public static final DeferredItem<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PLATINUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PLATINUM,5.0f,-3f))));
    public static final DeferredItem<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PLATINUM,-3f,-0f))));

    public static final DeferredItem<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));


    // COBALT
    public static final DeferredItem<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM,3.0f,-2.4f))));
    public static final DeferredItem<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PLATINUM,1.0f,-2.8f))));
    public static final DeferredItem<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PLATINUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PLATINUM,5.0f,-3f))));
    public static final DeferredItem<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PLATINUM,-3f,-0f))));

    public static final DeferredItem<ArmorItem> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<ArmorItem> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<ArmorItem> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<ArmorItem> COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));



    // TUNGSTEN
    public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM,3.0f,-2.4f))));
    public static final DeferredItem<PickaxeItem> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PLATINUM,1.0f,-2.8f))));
    public static final DeferredItem<ShovelItem> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PLATINUM,1.5f,-3.0f))));
    public static final DeferredItem<AxeItem> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PLATINUM,5.0f,-3f))));
    public static final DeferredItem<HoeItem> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PLATINUM,-3f,-0f))));
    public static final DeferredItem<SwordItem> TUNGSTEN_FLAIL = ITEMS.register("tungsten_flail",
            () -> new SwordItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM,8.5f,-7f))));

    public static final DeferredItem<ArmorItem> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<ArmorItem> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<ArmorItem> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<ArmorItem> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    // ZIRCON
    public static final DeferredItem<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));

    // TIGER
    public static final DeferredItem<Item> TIGER_SPAWN_EGG = ITEMS.register("tiger_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.TIGER, 0xed7211,0x000000,
                    new Item.Properties()));

    // MISC
    public static final DeferredItem<Item> SPIKED_HEAVY_CORE = ITEMS.register("spiked_heavy_core",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));

    //SNOW LEOPARD
    public static final DeferredItem<Item> SNOW_LEOPARD_SPAWN_EGG = ITEMS.register("snow_leopard_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.SNOW_LEOPARD, 0xffffff,0x000000,
                    new Item.Properties()));











    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        LOGGER.info("Loaded {} mod items", NAME);
    }
}
