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
    public static final TreeGrower ASPEN = new TreeGrower(AncientHorizons.MOD_ID + ":aspen",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASPEN_KEY), Optional.empty());
    public static final TreeGrower ASH = new TreeGrower(AncientHorizons.MOD_ID + ":ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASH_KEY), Optional.empty());
    public static final TreeGrower BEECH = new TreeGrower(AncientHorizons.MOD_ID + ":beech",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BEECH_KEY), Optional.empty());
    public static final TreeGrower EUCALYPTUS = new TreeGrower(AncientHorizons.MOD_ID + ":eucalyptus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EUCALYPTUS_KEY), Optional.empty());
    public static final TreeGrower SYCAMORE = new TreeGrower(AncientHorizons.MOD_ID + ":sycamore",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SYCAMORE_KEY), Optional.empty());
    public static final TreeGrower REDWOOD = new TreeGrower(AncientHorizons.MOD_ID + ":redwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.REDWOOD_KEY), Optional.empty());
    public static final TreeGrower MONKEY_PUZZLE = new TreeGrower(AncientHorizons.MOD_ID + ":monkey_puzzle",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MONKEY_PUZZLE_KEY), Optional.empty());
    public static final TreeGrower YEW = new TreeGrower(AncientHorizons.MOD_ID + ":yew",
            Optional.empty(), Optional.of(ModConfiguredFeatures.YEW_KEY), Optional.empty());
}
