package com.fungoussoup.ancienthorizons.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModStrippables {
    public static final Map<Block, Supplier<Block>> STRIPPABLES = new HashMap<>();

    public static void register() {
        STRIPPABLES.put(ModBlocks.WILLOW_LOG.get(), ModBlocks.STRIPPED_WILLOW_LOG);
        STRIPPABLES.put(ModBlocks.WILLOW_WOOD.get(), ModBlocks.STRIPPED_WILLOW_WOOD);

        STRIPPABLES.put(ModBlocks.HORNBEAM_LOG.get(), ModBlocks.STRIPPED_HORNBEAM_LOG);
        STRIPPABLES.put(ModBlocks.HORNBEAM_WOOD.get(), ModBlocks.STRIPPED_HORNBEAM_WOOD);

        STRIPPABLES.put(ModBlocks.LINDEN_LOG.get(), ModBlocks.STRIPPED_LINDEN_LOG);
        STRIPPABLES.put(ModBlocks.LINDEN_WOOD.get(), ModBlocks.STRIPPED_LINDEN_WOOD);
        
        STRIPPABLES.put(ModBlocks.GINKGO_LOG.get(), ModBlocks.STRIPPED_GINKGO_LOG);
        STRIPPABLES.put(ModBlocks.GINKGO_WOOD.get(), ModBlocks.STRIPPED_GINKGO_WOOD);
        
        STRIPPABLES.put(ModBlocks.POPLAR_LOG.get(), ModBlocks.STRIPPED_POPLAR_LOG);
        STRIPPABLES.put(ModBlocks.POPLAR_WOOD.get(), ModBlocks.STRIPPED_POPLAR_WOOD);
        
        STRIPPABLES.put(ModBlocks.MAPLE_LOG.get(), ModBlocks.STRIPPED_MAPLE_LOG);
        STRIPPABLES.put(ModBlocks.MAPLE_WOOD.get(), ModBlocks.STRIPPED_MAPLE_WOOD);
        
        STRIPPABLES.put(ModBlocks.BAOBAB_LOG.get(), ModBlocks.STRIPPED_BAOBAB_LOG);
        STRIPPABLES.put(ModBlocks.BAOBAB_WOOD.get(), ModBlocks.STRIPPED_BAOBAB_WOOD);
        
        STRIPPABLES.put(ModBlocks.PALM_LOG.get(), ModBlocks.STRIPPED_PALM_LOG);
        STRIPPABLES.put(ModBlocks.PALM_WOOD.get(), ModBlocks.STRIPPED_PALM_WOOD);

        STRIPPABLES.put(ModBlocks.ASPEN_LOG.get(), ModBlocks.STRIPPED_ASPEN_LOG);
        STRIPPABLES.put(ModBlocks.ASPEN_WOOD.get(), ModBlocks.STRIPPED_ASPEN_WOOD);
        
        STRIPPABLES.put(ModBlocks.ASH_LOG.get(), ModBlocks.STRIPPED_ASH_LOG);
        STRIPPABLES.put(ModBlocks.ASH_WOOD.get(), ModBlocks.STRIPPED_ASH_WOOD);
        
        STRIPPABLES.put(ModBlocks.BEECH_LOG.get(), ModBlocks.STRIPPED_BEECH_LOG);
        STRIPPABLES.put(ModBlocks.BEECH_WOOD.get(), ModBlocks.STRIPPED_BEECH_WOOD);

        STRIPPABLES.put(ModBlocks.EUCALYPTUS_LOG.get(), ModBlocks.STRIPPED_EUCALYPTUS_LOG);
        STRIPPABLES.put(ModBlocks.EUCALYPTUS_WOOD.get(), ModBlocks.STRIPPED_EUCALYPTUS_WOOD);

        STRIPPABLES.put(ModBlocks.SYCAMORE_LOG.get(), ModBlocks.STRIPPED_SYCAMORE_LOG);
        STRIPPABLES.put(ModBlocks.SYCAMORE_WOOD.get(), ModBlocks.STRIPPED_SYCAMORE_WOOD);

        STRIPPABLES.put(ModBlocks.REDWOOD_LOG.get(), ModBlocks.STRIPPED_REDWOOD_LOG);
        STRIPPABLES.put(ModBlocks.REDWOOD_WOOD.get(), ModBlocks.STRIPPED_REDWOOD_WOOD);

        STRIPPABLES.put(ModBlocks.MONKEY_PUZZLE_LOG.get(), ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG);
        STRIPPABLES.put(ModBlocks.MONKEY_PUZZLE_WOOD.get(), ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD);

        STRIPPABLES.put(ModBlocks.YEW_LOG.get(), ModBlocks.STRIPPED_YEW_LOG);
        STRIPPABLES.put(ModBlocks.YEW_WOOD.get(), ModBlocks.STRIPPED_YEW_WOOD);
        // Add more trees here
    }
}