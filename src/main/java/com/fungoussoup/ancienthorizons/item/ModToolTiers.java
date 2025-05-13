package com.fungoussoup.ancienthorizons.item;

import com.fungoussoup.ancienthorizons.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ALUMINIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ALUMINIUM_TOOL,
            500, 3f, 2f, 20, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT));

    public static final Tier SILVER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL,
            890, 4.5f, 2.6f, 20, () -> Ingredient.of(ModItems.SILVER_INGOT));
}
