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

                        // LINDEN
                        output.accept(ModBlocks.LINDEN_LOG);
                        output.accept(ModBlocks.LINDEN_WOOD);
                        output.accept(ModBlocks.STRIPPED_LINDEN_LOG);
                        output.accept(ModBlocks.STRIPPED_LINDEN_WOOD);
                        output.accept(ModBlocks.LINDEN_PLANKS);
                        output.accept(ModBlocks.LINDEN_LEAVES);
                        output.accept(ModBlocks.LINDEN_SAPLING);

                        output.accept(ModBlocks.LINDEN_STAIRS);
                        output.accept(ModBlocks.LINDEN_SLAB);
                        output.accept(ModBlocks.LINDEN_PRESSURE_PLATE);
                        output.accept(ModBlocks.LINDEN_BUTTON);
                        output.accept(ModBlocks.LINDEN_FENCE);
                        output.accept(ModBlocks.LINDEN_FENCE_GATE);
                        output.accept(ModBlocks.LINDEN_DOOR);
                        output.accept(ModBlocks.LINDEN_TRAPDOOR);

                        // GINKGO
                        output.accept(ModBlocks.GINKGO_LOG);
                        output.accept(ModBlocks.GINKGO_WOOD);
                        output.accept(ModBlocks.STRIPPED_GINKGO_LOG);
                        output.accept(ModBlocks.STRIPPED_GINKGO_WOOD);
                        output.accept(ModBlocks.GINKGO_PLANKS);
                        output.accept(ModBlocks.GINKGO_LEAVES);
                        output.accept(ModBlocks.GINKGO_SAPLING);

                        output.accept(ModBlocks.GINKGO_STAIRS);
                        output.accept(ModBlocks.GINKGO_SLAB);
                        output.accept(ModBlocks.GINKGO_PRESSURE_PLATE);
                        output.accept(ModBlocks.GINKGO_BUTTON);
                        output.accept(ModBlocks.GINKGO_FENCE);
                        output.accept(ModBlocks.GINKGO_FENCE_GATE);
                        output.accept(ModBlocks.GINKGO_DOOR);
                        output.accept(ModBlocks.GINKGO_TRAPDOOR);
                        
                        // POPLAR
                        output.accept(ModBlocks.POPLAR_LOG);
                        output.accept(ModBlocks.POPLAR_WOOD);
                        output.accept(ModBlocks.STRIPPED_POPLAR_LOG);
                        output.accept(ModBlocks.STRIPPED_POPLAR_WOOD);
                        output.accept(ModBlocks.POPLAR_PLANKS);
                        output.accept(ModBlocks.POPLAR_LEAVES);
                        output.accept(ModBlocks.POPLAR_SAPLING);

                        output.accept(ModBlocks.POPLAR_STAIRS);
                        output.accept(ModBlocks.POPLAR_SLAB);
                        output.accept(ModBlocks.POPLAR_PRESSURE_PLATE);
                        output.accept(ModBlocks.POPLAR_BUTTON);
                        output.accept(ModBlocks.POPLAR_FENCE);
                        output.accept(ModBlocks.POPLAR_FENCE_GATE);
                        output.accept(ModBlocks.POPLAR_DOOR);
                        output.accept(ModBlocks.POPLAR_TRAPDOOR);                        
                        
                        // MAPLE
                        output.accept(ModBlocks.MAPLE_LOG);
                        output.accept(ModBlocks.MAPLE_WOOD);
                        output.accept(ModBlocks.STRIPPED_MAPLE_LOG);
                        output.accept(ModBlocks.STRIPPED_MAPLE_WOOD);
                        output.accept(ModBlocks.MAPLE_PLANKS);
                        output.accept(ModBlocks.MAPLE_LEAVES);
                        output.accept(ModBlocks.MAPLE_SAPLING);

                        output.accept(ModBlocks.MAPLE_STAIRS);
                        output.accept(ModBlocks.MAPLE_SLAB);
                        output.accept(ModBlocks.MAPLE_PRESSURE_PLATE);
                        output.accept(ModBlocks.MAPLE_BUTTON);
                        output.accept(ModBlocks.MAPLE_FENCE);
                        output.accept(ModBlocks.MAPLE_FENCE_GATE);
                        output.accept(ModBlocks.MAPLE_DOOR);
                        output.accept(ModBlocks.MAPLE_TRAPDOOR);

                        // BAOBAB
                        output.accept(ModBlocks.BAOBAB_LOG);
                        output.accept(ModBlocks.BAOBAB_WOOD);
                        output.accept(ModBlocks.STRIPPED_BAOBAB_LOG);
                        output.accept(ModBlocks.STRIPPED_BAOBAB_WOOD);
                        output.accept(ModBlocks.BAOBAB_PLANKS);
                        output.accept(ModBlocks.BAOBAB_LEAVES);
                        output.accept(ModBlocks.BAOBAB_SAPLING);

                        output.accept(ModBlocks.BAOBAB_STAIRS);
                        output.accept(ModBlocks.BAOBAB_SLAB);
                        output.accept(ModBlocks.BAOBAB_PRESSURE_PLATE);
                        output.accept(ModBlocks.BAOBAB_BUTTON);
                        output.accept(ModBlocks.BAOBAB_FENCE);
                        output.accept(ModBlocks.BAOBAB_FENCE_GATE);
                        output.accept(ModBlocks.BAOBAB_DOOR);
                        output.accept(ModBlocks.BAOBAB_TRAPDOOR);
                        
                        // PALM
                        output.accept(ModBlocks.PALM_LOG);
                        output.accept(ModBlocks.PALM_WOOD);
                        output.accept(ModBlocks.STRIPPED_PALM_LOG);
                        output.accept(ModBlocks.STRIPPED_PALM_WOOD);
                        output.accept(ModBlocks.PALM_PLANKS);
                        output.accept(ModBlocks.PALM_LEAVES);
                        output.accept(ModBlocks.PALM_SAPLING);

                        output.accept(ModBlocks.PALM_STAIRS);
                        output.accept(ModBlocks.PALM_SLAB);
                        output.accept(ModBlocks.PALM_PRESSURE_PLATE);
                        output.accept(ModBlocks.PALM_BUTTON);
                        output.accept(ModBlocks.PALM_FENCE);
                        output.accept(ModBlocks.PALM_FENCE_GATE);
                        output.accept(ModBlocks.PALM_DOOR);
                        output.accept(ModBlocks.PALM_TRAPDOOR);
                        
                        // ASPEN
                        output.accept(ModBlocks.ASPEN_LOG);
                        output.accept(ModBlocks.ASPEN_WOOD);
                        output.accept(ModBlocks.STRIPPED_ASPEN_LOG);
                        output.accept(ModBlocks.STRIPPED_ASPEN_WOOD);
                        output.accept(ModBlocks.ASPEN_PLANKS);
                        output.accept(ModBlocks.ASPEN_LEAVES);
                        output.accept(ModBlocks.ASPEN_SAPLING);

                        output.accept(ModBlocks.ASPEN_STAIRS);
                        output.accept(ModBlocks.ASPEN_SLAB);
                        output.accept(ModBlocks.ASPEN_PRESSURE_PLATE);
                        output.accept(ModBlocks.ASPEN_BUTTON);
                        output.accept(ModBlocks.ASPEN_FENCE);
                        output.accept(ModBlocks.ASPEN_FENCE_GATE);
                        output.accept(ModBlocks.ASPEN_DOOR);
                        output.accept(ModBlocks.ASPEN_TRAPDOOR);

                        // ASH
                        output.accept(ModBlocks.ASH_LOG);
                        output.accept(ModBlocks.ASH_WOOD);
                        output.accept(ModBlocks.STRIPPED_ASH_LOG);
                        output.accept(ModBlocks.STRIPPED_ASH_WOOD);
                        output.accept(ModBlocks.ASH_PLANKS);
                        output.accept(ModBlocks.ASH_LEAVES);
                        output.accept(ModBlocks.ASH_SAPLING);

                        output.accept(ModBlocks.ASH_STAIRS);
                        output.accept(ModBlocks.ASH_SLAB);
                        output.accept(ModBlocks.ASH_PRESSURE_PLATE);
                        output.accept(ModBlocks.ASH_BUTTON);
                        output.accept(ModBlocks.ASH_FENCE);
                        output.accept(ModBlocks.ASH_FENCE_GATE);
                        output.accept(ModBlocks.ASH_DOOR);
                        output.accept(ModBlocks.ASH_TRAPDOOR);

                        // BEECH
                        output.accept(ModBlocks.BEECH_LOG);
                        output.accept(ModBlocks.BEECH_WOOD);
                        output.accept(ModBlocks.STRIPPED_BEECH_LOG);
                        output.accept(ModBlocks.STRIPPED_BEECH_WOOD);
                        output.accept(ModBlocks.BEECH_PLANKS);
                        output.accept(ModBlocks.BEECH_LEAVES);
                        output.accept(ModBlocks.BEECH_SAPLING);

                        output.accept(ModBlocks.BEECH_STAIRS);
                        output.accept(ModBlocks.BEECH_SLAB);
                        output.accept(ModBlocks.BEECH_PRESSURE_PLATE);
                        output.accept(ModBlocks.BEECH_BUTTON);
                        output.accept(ModBlocks.BEECH_FENCE);
                        output.accept(ModBlocks.BEECH_FENCE_GATE);
                        output.accept(ModBlocks.BEECH_DOOR);
                        output.accept(ModBlocks.BEECH_TRAPDOOR);

                        // EUCALYPTUS
                        output.accept(ModBlocks.EUCALYPTUS_LOG);
                        output.accept(ModBlocks.EUCALYPTUS_WOOD);
                        output.accept(ModBlocks.STRIPPED_EUCALYPTUS_LOG);
                        output.accept(ModBlocks.STRIPPED_EUCALYPTUS_WOOD);
                        output.accept(ModBlocks.EUCALYPTUS_PLANKS);
                        output.accept(ModBlocks.EUCALYPTUS_LEAVES);
                        output.accept(ModBlocks.EUCALYPTUS_SAPLING);

                        output.accept(ModBlocks.EUCALYPTUS_STAIRS);
                        output.accept(ModBlocks.EUCALYPTUS_SLAB);
                        output.accept(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
                        output.accept(ModBlocks.EUCALYPTUS_BUTTON);
                        output.accept(ModBlocks.EUCALYPTUS_FENCE);
                        output.accept(ModBlocks.EUCALYPTUS_FENCE_GATE);
                        output.accept(ModBlocks.EUCALYPTUS_DOOR);
                        output.accept(ModBlocks.EUCALYPTUS_TRAPDOOR);

                        // SYCAMORE
                        output.accept(ModBlocks.SYCAMORE_LOG);
                        output.accept(ModBlocks.SYCAMORE_WOOD);
                        output.accept(ModBlocks.STRIPPED_SYCAMORE_LOG);
                        output.accept(ModBlocks.STRIPPED_SYCAMORE_WOOD);
                        output.accept(ModBlocks.SYCAMORE_PLANKS);
                        output.accept(ModBlocks.SYCAMORE_LEAVES);
                        output.accept(ModBlocks.SYCAMORE_SAPLING);

                        output.accept(ModBlocks.SYCAMORE_STAIRS);
                        output.accept(ModBlocks.SYCAMORE_SLAB);
                        output.accept(ModBlocks.SYCAMORE_PRESSURE_PLATE);
                        output.accept(ModBlocks.SYCAMORE_BUTTON);
                        output.accept(ModBlocks.SYCAMORE_FENCE);
                        output.accept(ModBlocks.SYCAMORE_FENCE_GATE);
                        output.accept(ModBlocks.SYCAMORE_DOOR);
                        output.accept(ModBlocks.SYCAMORE_TRAPDOOR);

                        // REDWOOD
                        output.accept(ModBlocks.REDWOOD_LOG);
                        output.accept(ModBlocks.REDWOOD_WOOD);
                        output.accept(ModBlocks.STRIPPED_REDWOOD_LOG);
                        output.accept(ModBlocks.STRIPPED_REDWOOD_WOOD);
                        output.accept(ModBlocks.REDWOOD_PLANKS);
                        output.accept(ModBlocks.REDWOOD_LEAVES);
                        output.accept(ModBlocks.REDWOOD_SAPLING);

                        output.accept(ModBlocks.REDWOOD_STAIRS);
                        output.accept(ModBlocks.REDWOOD_SLAB);
                        output.accept(ModBlocks.REDWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.REDWOOD_BUTTON);
                        output.accept(ModBlocks.REDWOOD_FENCE);
                        output.accept(ModBlocks.REDWOOD_FENCE_GATE);
                        output.accept(ModBlocks.REDWOOD_DOOR);
                        output.accept(ModBlocks.REDWOOD_TRAPDOOR);

                        // MONKEY PUZZLE
                        output.accept(ModBlocks.MONKEY_PUZZLE_LOG);
                        output.accept(ModBlocks.MONKEY_PUZZLE_WOOD);
                        output.accept(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG);
                        output.accept(ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD);
                        output.accept(ModBlocks.MONKEY_PUZZLE_PLANKS);
                        output.accept(ModBlocks.MONKEY_PUZZLE_LEAVES);
                        output.accept(ModBlocks.MONKEY_PUZZLE_SAPLING);

                        output.accept(ModBlocks.MONKEY_PUZZLE_STAIRS);
                        output.accept(ModBlocks.MONKEY_PUZZLE_SLAB);
                        output.accept(ModBlocks.MONKEY_PUZZLE_PRESSURE_PLATE);
                        output.accept(ModBlocks.MONKEY_PUZZLE_BUTTON);
                        output.accept(ModBlocks.MONKEY_PUZZLE_FENCE);
                        output.accept(ModBlocks.MONKEY_PUZZLE_FENCE_GATE);
                        output.accept(ModBlocks.MONKEY_PUZZLE_DOOR);
                        output.accept(ModBlocks.MONKEY_PUZZLE_TRAPDOOR);

                        // YEW
                        output.accept(ModBlocks.YEW_LOG);
                        output.accept(ModBlocks.YEW_WOOD);
                        output.accept(ModBlocks.STRIPPED_YEW_LOG);
                        output.accept(ModBlocks.STRIPPED_YEW_WOOD);
                        output.accept(ModBlocks.YEW_PLANKS);
                        output.accept(ModBlocks.YEW_LEAVES);
                        output.accept(ModBlocks.YEW_SAPLING);

                        output.accept(ModBlocks.YEW_STAIRS);
                        output.accept(ModBlocks.YEW_SLAB);
                        output.accept(ModBlocks.YEW_PRESSURE_PLATE);
                        output.accept(ModBlocks.YEW_BUTTON);
                        output.accept(ModBlocks.YEW_FENCE);
                        output.accept(ModBlocks.YEW_FENCE_GATE);
                        output.accept(ModBlocks.YEW_DOOR);
                        output.accept(ModBlocks.YEW_TRAPDOOR);

                        
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
