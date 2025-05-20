package com.fungoussoup.ancienthorizons.worldgen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> TIMESTONE_ORE_KEY = registerKey("timestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZIRCON_ORE_KEY = registerKey("zircon_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> timestoneOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIMESTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIMESTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> aluminiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tinOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> silverOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> platinumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> cobaltOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.COBALT_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tungstenOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> zirconOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ZIRCON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ZIRCON_ORE.get().defaultBlockState()));

        register(context, TIMESTONE_ORE_KEY, Feature.ORE, new OreConfiguration(timestoneOres, 2));
        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(aluminiumOres, 5));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(tinOres, 5));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(silverOres, 5));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(platinumOres, 5));
        register(context, COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(cobaltOres, 5));
        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(tungstenOres, 3));
        register(context, ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(zirconOres, 3));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
