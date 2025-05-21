package com.fungoussoup.ancienthorizons.worldgen.tree;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower WILLOW = new TreeGrower(AncientHorizons.MOD_ID + ":willow",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WILLOW_KEY), Optional.empty());
    public static final TreeGrower HORNBEAM = new TreeGrower(AncientHorizons.MOD_ID + ":hornbeam",
            Optional.empty(), Optional.of(ModConfiguredFeatures.HORNBEAM_KEY), Optional.empty());
    public static final TreeGrower LINDEN = new TreeGrower(AncientHorizons.MOD_ID + ":linden",
            Optional.empty(), Optional.of(ModConfiguredFeatures.LINDEN_KEY), Optional.empty());
}
