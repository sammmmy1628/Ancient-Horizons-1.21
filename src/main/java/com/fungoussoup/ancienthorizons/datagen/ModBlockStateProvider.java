package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AncientHorizons.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.ALUMINIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIMESTONE_ORE);
        blockWithItem(ModBlocks.TIMESTONE_ORE);
        blockWithItem(ModBlocks.TIMESTONE_BLOCK);
        blockWithItem(ModBlocks.TIME_MATRIX);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
