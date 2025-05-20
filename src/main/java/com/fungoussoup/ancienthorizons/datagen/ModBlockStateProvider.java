package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.custom.ModFlammableRotatedPillarBlock;
import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AncientHorizons.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // TIMESTONE
        blockWithItem(ModBlocks.DEEPSLATE_TIMESTONE_ORE);
        blockWithItem(ModBlocks.RAW_TIMESTONE_BLOCK);
        blockWithItem(ModBlocks.TIMESTONE_ORE);
        blockWithItem(ModBlocks.TIMESTONE_BLOCK);
        blockWithItem(ModBlocks.TIME_MATRIX);

        // ALUMINIUM
        blockWithItem(ModBlocks.ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.ALUMINIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

        // TIN
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);

        blockWithItem(ModBlocks.CHISELED_TIN);
        blockWithItem(ModBlocks.TIN_GRATE);
        blockWithItem(ModBlocks.CUT_TIN);

        stairsBlock(ModBlocks.CUT_TIN_STAIRS.get(), blockTexture(ModBlocks.CUT_TIN.get()));
        slabBlock(ModBlocks.CUT_TIN_SLAB.get(), blockTexture(ModBlocks.CUT_TIN.get()), blockTexture(ModBlocks.CUT_TIN.get()));

        doorBlockWithRenderType(ModBlocks.TIN_DOOR.get(), modLoc("block/tin_door_bottom"), modLoc("block/tin_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.TIN_TRAPDOOR.get(), modLoc("block/tin_trapdoor"), true, "cutout");


        blockItem(ModBlocks.CUT_TIN_STAIRS);
        blockItem(ModBlocks.CUT_TIN_SLAB);
        blockItem(ModBlocks.TIN_TRAPDOOR, "_bottom");


        // BRONZE
        blockWithItem(ModBlocks.BRONZE_BLOCK);


        // SILVER
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);

        // PLATINUM
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);

        // COBALT
        blockWithItem(ModBlocks.RAW_COBALT_BLOCK);
        blockWithItem(ModBlocks.COBALT_BLOCK);
        blockWithItem(ModBlocks.COBALT_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_COBALT_ORE);

        // TUNGSTEN
        blockWithItem(ModBlocks.RAW_TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.TUNGSTEN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

        blockWithItem(ModBlocks.CHISELED_TUNGSTEN);
        blockWithItem(ModBlocks.TUNGSTEN_GRATE);
        blockWithItem(ModBlocks.CUT_TUNGSTEN);

        stairsBlock(ModBlocks.CUT_TUNGSTEN_STAIRS.get(), blockTexture(ModBlocks.CUT_TUNGSTEN.get()));
        slabBlock(ModBlocks.CUT_TUNGSTEN_SLAB.get(), blockTexture(ModBlocks.CUT_TUNGSTEN.get()), blockTexture(ModBlocks.CUT_TUNGSTEN.get()));

        doorBlockWithRenderType(ModBlocks.TUNGSTEN_DOOR.get(), modLoc("block/tungsten_door_bottom"), modLoc("block/tungsten_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.TUNGSTEN_TRAPDOOR.get(), modLoc("block/tungsten_trapdoor"), true, "cutout");


        blockItem(ModBlocks.CUT_TUNGSTEN_STAIRS);
        blockItem(ModBlocks.CUT_TUNGSTEN_SLAB);
        blockItem(ModBlocks.TUNGSTEN_TRAPDOOR, "_bottom");

        // ZIRCON
        blockWithItem(ModBlocks.ZIRCON_BLOCK);
        blockWithItem(ModBlocks.ZIRCON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZIRCON_ORE);

        // WILLOW
        logBlock(((RotatedPillarBlock) ModBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WILLOW_WOOD.get()), blockTexture(ModBlocks.WILLOW_LOG.get()), blockTexture(ModBlocks.WILLOW_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()));

        blockItem(ModBlocks.WILLOW_LOG);
        blockItem(ModBlocks.STRIPPED_WILLOW_LOG);
        blockItem(ModBlocks.WILLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_WILLOW_WOOD);

        blockWithItem(ModBlocks.WILLOW_PLANKS);

        leavesBlock(ModBlocks.WILLOW_LEAVES);
        saplingBlock(ModBlocks.WILLOW_SAPLING);
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ancienthorizons:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ancienthorizons:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
