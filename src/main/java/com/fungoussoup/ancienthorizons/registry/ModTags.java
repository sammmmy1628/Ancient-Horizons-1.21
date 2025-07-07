package com.fungoussoup.ancienthorizons.registry;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.EntityType;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ALUMINIUM_TOOL = createTag("needs_aluminium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ALUMINIUM_TOOL = createTag("incorrect_for_aluminium_tool");

        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");

        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = createTag("needs_platinum_tool");
        public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = createTag("incorrect_for_platinum_tool");


        public static final TagKey<Block> ALUMINIUM_ORES = createTag("aluminium_ores");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ALUMINIUM = createTag("aluminium");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, name));
        }
    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> TIGER_PREY = createTag("tiger_prey");

        private static TagKey<EntityType<?>> createTag(String name) {
            return EntityTypeTags.create(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, name));
        }
    }
}
