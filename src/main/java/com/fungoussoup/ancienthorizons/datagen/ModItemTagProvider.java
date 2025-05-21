package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import com.fungoussoup.ancienthorizons.registry.ModItems;
import com.fungoussoup.ancienthorizons.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AncientHorizons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.ALUMINIUM)
                .add(ModItems.ALUMINIUM_INGOT.get())
                .add(ModItems.ALUMINIUM_NUGGET.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.ALUMINIUM_SWORD.get())
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.SILVER_SWORD.get())
                .add(ModItems.PLATINUM_SWORD.get())
                .add(ModItems.COBALT_SWORD.get())
                .add(ModItems.TUNGSTEN_SWORD.get())

                .add(ModItems.TUNGSTEN_FLAIL.get())
                .add(ModItems.SILVER_KATANA.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ALUMINIUM_PICKAXE.get())
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.SILVER_PICKAXE.get())
                .add(ModItems.PLATINUM_PICKAXE.get())
                .add(ModItems.COBALT_PICKAXE.get())
                .add(ModItems.TUNGSTEN_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ALUMINIUM_AXE.get())
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.SILVER_AXE.get())
                .add(ModItems.PLATINUM_AXE.get())
                .add(ModItems.COBALT_AXE.get())
                .add(ModItems.TUNGSTEN_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ALUMINIUM_SHOVEL.get())
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.SILVER_SHOVEL.get())
                .add(ModItems.PLATINUM_SHOVEL.get())
                .add(ModItems.COBALT_SHOVEL.get())
                .add(ModItems.TUNGSTEN_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ALUMINIUM_HOE.get())
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.SILVER_HOE.get())
                .add(ModItems.PLATINUM_HOE.get())
                .add(ModItems.COBALT_HOE.get())
                .add(ModItems.TUNGSTEN_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALUMINIUM_HELMET.get())
                .add(ModItems.ALUMINIUM_CHESTPLATE.get())
                .add(ModItems.ALUMINIUM_LEGGINGS.get())
                .add(ModItems.ALUMINIUM_BOOTS.get())

                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())

                .add(ModItems.SILVER_HELMET.get())
                .add(ModItems.SILVER_CHESTPLATE.get())
                .add(ModItems.SILVER_LEGGINGS.get())
                .add(ModItems.SILVER_BOOTS.get())

                .add(ModItems.PLATINUM_HELMET.get())
                .add(ModItems.PLATINUM_CHESTPLATE.get())
                .add(ModItems.PLATINUM_LEGGINGS.get())
                .add(ModItems.PLATINUM_BOOTS.get())

                .add(ModItems.COBALT_HELMET.get())
                .add(ModItems.COBALT_CHESTPLATE.get())
                .add(ModItems.COBALT_LEGGINGS.get())
                .add(ModItems.COBALT_BOOTS.get())

                .add(ModItems.TUNGSTEN_HELMET.get())
                .add(ModItems.TUNGSTEN_CHESTPLATE.get())
                .add(ModItems.TUNGSTEN_LEGGINGS.get())
                .add(ModItems.TUNGSTEN_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get().asItem())
                .add(ModBlocks.WILLOW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WILLOW_PLANKS.asItem())
                .add(ModBlocks.HORNBEAM_PLANKS.asItem())
                .add(ModBlocks.LINDEN_PLANKS.asItem());
    }
}
