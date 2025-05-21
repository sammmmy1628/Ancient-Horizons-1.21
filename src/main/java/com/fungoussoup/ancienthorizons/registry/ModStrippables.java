package com.fungoussoup.ancienthorizons.registry;

import net.minecraft.world.level.block.Block;

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
        // Add more trees here
    }
}