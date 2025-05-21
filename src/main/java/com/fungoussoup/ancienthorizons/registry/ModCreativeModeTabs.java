package com.fungoussoup.ancienthorizons.registry;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.fungoussoup.ancienthorizons.AncientHorizons.LOGGER;
import static com.fungoussoup.ancienthorizons.AncientHorizons.NAME;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientHorizons.MOD_ID);

    public static final Supplier<CreativeModeTab> ANCIENT_HORIZONS_TAB_MINERALS = CREATIVE_MODE_TAB.register("ancient_horizons_tab_minerals",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TIMESTONE_ORE.get()))
                    .title(Component.translatable("creativetab.ancienthorizons.ancient_horizons_minerals"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // ORES
                        output.accept(ModBlocks.TIMESTONE_ORE);
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.SILVER_ORE);
                        output.accept(ModBlocks.PLATINUM_ORE);
                        output.accept(ModBlocks.COBALT_ORE);
                        output.accept(ModBlocks.TUNGSTEN_ORE);
                        output.accept(ModBlocks.ZIRCON_ORE);

                        // DEEPSLATE ORES
                        output.accept(ModBlocks.DEEPSLATE_TIMESTONE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_COBALT_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE);

                        // RAW ORES
                        output.accept(ModItems.RAW_TIME_STONE);
                        output.accept(ModBlocks.RAW_TIMESTONE_BLOCK);

                        output.accept(ModItems.RAW_ALUMINIUM);
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK);

                        output.accept(ModItems.RAW_TIN);
                        output.accept(ModBlocks.RAW_TIN_BLOCK);

                        output.accept(ModItems.RAW_SILVER);
                        output.accept(ModBlocks.RAW_SILVER_BLOCK);

                        output.accept(ModItems.RAW_PLATINUM);
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK);

                        output.accept(ModItems.RAW_COBALT);
                        output.accept(ModBlocks.RAW_COBALT_BLOCK);

                        output.accept(ModItems.RAW_TUNGSTEN);
                        output.accept(ModBlocks.RAW_TUNGSTEN_BLOCK);


                        // PROCESSED ORES
                        output.accept(ModItems.TIME_STONE);
                        output.accept(ModBlocks.TIMESTONE_BLOCK);

                        output.accept(ModItems.ALUMINIUM_NUGGET);
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModBlocks.ALUMINIUM_BLOCK);

                        output.accept(ModItems.TIN_NUGGET);
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModBlocks.TIN_BLOCK);

                        output.accept(ModItems.BRONZE_NUGGET);
                        output.accept(ModItems.BRONZE_ALLOY);
                        output.accept(ModBlocks.BRONZE_BLOCK);

                        output.accept(ModItems.SILVER_NUGGET);
                        output.accept(ModItems.SILVER_INGOT);
                        output.accept(ModBlocks.SILVER_BLOCK);

                        output.accept(ModItems.PLATINUM_NUGGET);
                        output.accept(ModItems.PLATINUM_INGOT);
                        output.accept(ModBlocks.PLATINUM_BLOCK);

                        output.accept(ModItems.COBALT_NUGGET);
                        output.accept(ModItems.COBALT_INGOT);
                        output.accept(ModBlocks.COBALT_BLOCK);

                        output.accept(ModItems.TUNGSTEN_NUGGET);
                        output.accept(ModItems.TUNGSTEN_INGOT);
                        output.accept(ModBlocks.TUNGSTEN_BLOCK);

                        output.accept(ModItems.ZIRCON);
                        output.accept(ModBlocks.ZIRCON_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> ANCIENT_HORIZONS_TAB_BUILDING_BLOCKS = CREATIVE_MODE_TAB.register("ancient_horizons_tab_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CHISELED_TIN.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, "ancient_horizons_tab_minerals"))
                    .title(Component.translatable("creativetab.ancienthorizons.ancient_horizons_building_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CHISELED_TIN);
                        output.accept(ModBlocks.TIN_GRATE);
                        output.accept(ModBlocks.CUT_TIN);
                        output.accept(ModBlocks.CUT_TIN_STAIRS);
                        output.accept(ModBlocks.CUT_TIN_SLAB);
                        output.accept(ModBlocks.TIN_DOOR);
                        output.accept(ModBlocks.TIN_TRAPDOOR);

                        output.accept(ModBlocks.CHISELED_TUNGSTEN);
                        output.accept(ModBlocks.TUNGSTEN_GRATE);
                        output.accept(ModBlocks.CUT_TUNGSTEN);
                        output.accept(ModBlocks.CUT_TUNGSTEN_STAIRS);
                        output.accept(ModBlocks.CUT_TUNGSTEN_SLAB);
                        output.accept(ModBlocks.TUNGSTEN_DOOR);
                        output.accept(ModBlocks.TUNGSTEN_TRAPDOOR);

                        output.accept(ModBlocks.TIME_MATRIX);

                        // WILLOW
                        output.accept(ModBlocks.WILLOW_LOG);
                        output.accept(ModBlocks.WILLOW_WOOD);
                        output.accept(ModBlocks.STRIPPED_WILLOW_LOG);
                        output.accept(ModBlocks.STRIPPED_WILLOW_WOOD);
                        output.accept(ModBlocks.WILLOW_PLANKS);
                        output.accept(ModBlocks.WILLOW_LEAVES);
                        output.accept(ModBlocks.WILLOW_SAPLING);

                        output.accept(ModBlocks.WILLOW_STAIRS);
                        output.accept(ModBlocks.WILLOW_SLAB);
                        output.accept(ModBlocks.WILLOW_PRESSURE_PLATE);
                        output.accept(ModBlocks.WILLOW_BUTTON);
                        output.accept(ModBlocks.WILLOW_FENCE);
                        output.accept(ModBlocks.WILLOW_FENCE_GATE);
                        output.accept(ModBlocks.WILLOW_DOOR);
                        output.accept(ModBlocks.WILLOW_TRAPDOOR);

                        // HORNBEAM
                        output.accept(ModBlocks.HORNBEAM_LOG);
                        output.accept(ModBlocks.HORNBEAM_WOOD);
                        output.accept(ModBlocks.STRIPPED_HORNBEAM_LOG);
                        output.accept(ModBlocks.STRIPPED_HORNBEAM_WOOD);
                        output.accept(ModBlocks.HORNBEAM_PLANKS);
                        output.accept(ModBlocks.HORNBEAM_LEAVES);
                        output.accept(ModBlocks.HORNBEAM_SAPLING);

                        output.accept(ModBlocks.HORNBEAM_STAIRS);
                        output.accept(ModBlocks.HORNBEAM_SLAB);
                        output.accept(ModBlocks.HORNBEAM_PRESSURE_PLATE);
                        output.accept(ModBlocks.HORNBEAM_BUTTON);
                        output.accept(ModBlocks.HORNBEAM_FENCE);
                        output.accept(ModBlocks.HORNBEAM_FENCE_GATE);
                        output.accept(ModBlocks.HORNBEAM_DOOR);
                        output.accept(ModBlocks.HORNBEAM_TRAPDOOR);
                    }).build());

    public static final Supplier<CreativeModeTab> ANCIENT_HORIZONS_TAB_TOOLS_AND_ARMOUR = CREATIVE_MODE_TAB.register("ancient_horizons_tab_tools_and_armour",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_PICKAXE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, "ancient_horizons_tab_building_blocks"))
                    .title(Component.translatable("creativetab.ancienthorizons.ancient_horizons_tools_and_armour"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // ALUMINIUM
                        output.accept(ModItems.ALUMINIUM_SWORD);
                        output.accept(ModItems.ALUMINIUM_PICKAXE);
                        output.accept(ModItems.ALUMINIUM_AXE);
                        output.accept(ModItems.ALUMINIUM_SHOVEL);
                        output.accept(ModItems.ALUMINIUM_HOE);

                        output.accept(ModItems.ALUMINIUM_HELMET);
                        output.accept(ModItems.ALUMINIUM_CHESTPLATE);
                        output.accept(ModItems.ALUMINIUM_LEGGINGS);
                        output.accept(ModItems.ALUMINIUM_BOOTS);

                        // BRONZE
                        output.accept(ModItems.BRONZE_SWORD);
                        output.accept(ModItems.BRONZE_PICKAXE);
                        output.accept(ModItems.BRONZE_AXE);
                        output.accept(ModItems.BRONZE_SHOVEL);
                        output.accept(ModItems.BRONZE_HOE);

                        output.accept(ModItems.BRONZE_HELMET);
                        output.accept(ModItems.BRONZE_CHESTPLATE);
                        output.accept(ModItems.BRONZE_LEGGINGS);
                        output.accept(ModItems.BRONZE_BOOTS);

                        // SILVER
                        output.accept(ModItems.SILVER_SWORD);
                        output.accept(ModItems.SILVER_PICKAXE);
                        output.accept(ModItems.SILVER_AXE);
                        output.accept(ModItems.SILVER_SHOVEL);
                        output.accept(ModItems.SILVER_HOE);

                        output.accept(ModItems.SILVER_HELMET);
                        output.accept(ModItems.SILVER_CHESTPLATE);
                        output.accept(ModItems.SILVER_LEGGINGS);
                        output.accept(ModItems.SILVER_BOOTS);
                        
                        // PLATINUM
                        output.accept(ModItems.PLATINUM_SWORD);
                        output.accept(ModItems.PLATINUM_PICKAXE);
                        output.accept(ModItems.PLATINUM_AXE);
                        output.accept(ModItems.PLATINUM_SHOVEL);
                        output.accept(ModItems.PLATINUM_HOE);

                        output.accept(ModItems.PLATINUM_HELMET);
                        output.accept(ModItems.PLATINUM_CHESTPLATE);
                        output.accept(ModItems.PLATINUM_LEGGINGS);
                        output.accept(ModItems.PLATINUM_BOOTS);
                        
                        // COBALT
                        output.accept(ModItems.COBALT_SWORD);
                        output.accept(ModItems.COBALT_PICKAXE);
                        output.accept(ModItems.COBALT_AXE);
                        output.accept(ModItems.COBALT_SHOVEL);
                        output.accept(ModItems.COBALT_HOE);

                        output.accept(ModItems.COBALT_HELMET);
                        output.accept(ModItems.COBALT_CHESTPLATE);
                        output.accept(ModItems.COBALT_LEGGINGS);
                        output.accept(ModItems.COBALT_BOOTS);
                        
                        // TUNGSTEN
                        output.accept(ModItems.TUNGSTEN_SWORD);
                        output.accept(ModItems.TUNGSTEN_PICKAXE);
                        output.accept(ModItems.TUNGSTEN_AXE);
                        output.accept(ModItems.TUNGSTEN_SHOVEL);
                        output.accept(ModItems.TUNGSTEN_HOE);

                        output.accept(ModItems.TUNGSTEN_HELMET);
                        output.accept(ModItems.TUNGSTEN_CHESTPLATE);
                        output.accept(ModItems.TUNGSTEN_LEGGINGS);
                        output.accept(ModItems.TUNGSTEN_BOOTS);

                        // SPECIAL
                        output.accept(ModItems.ALUMINIUM_HAMMER);
                        output.accept(ModItems.SILVER_KATANA);
                        output.accept(ModItems.TUNGSTEN_FLAIL);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
        LOGGER.info("Loaded {} mod tabs", NAME);
    }
}
