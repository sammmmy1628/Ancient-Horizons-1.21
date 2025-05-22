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
    public static final TreeGrower GINKGO = new TreeGrower(AncientHorizons.MOD_ID + ":ginkgo",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GINKGO_KEY), Optional.empty());
    public static final TreeGrower POPLAR = new TreeGrower(AncientHorizons.MOD_ID + ":poplar",
            Optional.empty(), Optional.of(ModConfiguredFeatures.POPLAR_KEY), Optional.empty());
    public static final TreeGrower MAPLE = new TreeGrower(AncientHorizons.MOD_ID + ":maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_KEY), Optional.empty());
    public static final TreeGrower BAOBAB = new TreeGrower(AncientHorizons.MOD_ID + ":baobab",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BAOBAB_KEY), Optional.empty());
    public static final TreeGrower PALM = new TreeGrower(AncientHorizons.MOD_ID + ":palm",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_KEY), Optional.empty());
}
