package com.fungoussoup.ancienthorizons.worldgen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> TIMESTONE_ORE_PLACED_KEY = registerKey("timestone_ore_placed");
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
    public static final ResourceKey<PlacedFeature> ZIRCON_ORE_PLACED_KEY = registerKey("zircon_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, TIMESTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIMESTONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(15, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-15))));
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(50, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(120))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(50, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(120))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(50))));
        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(50))));
        register(context, COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(50))));
        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(10))));
        register(context, ZIRCON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZIRCON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(10))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

