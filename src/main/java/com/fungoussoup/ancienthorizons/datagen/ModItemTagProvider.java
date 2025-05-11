package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.ModBlocks;
import com.fungoussoup.ancienthorizons.item.ModItems;
import com.fungoussoup.ancienthorizons.util.ModTags;
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
                .add(ModItems.ALUMINIUM_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ALUMINIUM_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ALUMINIUM_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ALUMINIUM_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ALUMINIUM_HOE.get());
    }
}
