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

        stairsBlock(ModBlocks.WILLOW_STAIRS.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        slabBlock(ModBlocks.WILLOW_SLAB.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        buttonBlock(ModBlocks.WILLOW_BUTTON.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock(ModBlocks.WILLOW_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        fenceBlock(ModBlocks.WILLOW_FENCE.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock(ModBlocks.WILLOW_FENCE_GATE.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.WILLOW_DOOR.get(), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.WILLOW_TRAPDOOR.get(), modLoc("block/willow_trapdoor"), true,"cutout");

        blockItem(ModBlocks.WILLOW_STAIRS);
        blockItem(ModBlocks.WILLOW_SLAB);
        blockItem(ModBlocks.WILLOW_PRESSURE_PLATE);
        blockItem(ModBlocks.WILLOW_FENCE_GATE);
        blockItem(ModBlocks.WILLOW_TRAPDOOR,"_bottom");

        // HORNBEAM
        logBlock(((RotatedPillarBlock) ModBlocks.HORNBEAM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HORNBEAM_WOOD.get()), blockTexture(ModBlocks.HORNBEAM_LOG.get()), blockTexture(ModBlocks.HORNBEAM_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HORNBEAM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HORNBEAM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_HORNBEAM_LOG.get()), blockTexture(ModBlocks.STRIPPED_HORNBEAM_LOG.get()));

        blockItem(ModBlocks.HORNBEAM_LOG);
        blockItem(ModBlocks.STRIPPED_HORNBEAM_LOG);
        blockItem(ModBlocks.HORNBEAM_WOOD);
        blockItem(ModBlocks.STRIPPED_HORNBEAM_WOOD);

        blockWithItem(ModBlocks.HORNBEAM_PLANKS);

        leavesBlock(ModBlocks.HORNBEAM_LEAVES);
        saplingBlock(ModBlocks.HORNBEAM_SAPLING);

        stairsBlock(ModBlocks.HORNBEAM_STAIRS.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));
        slabBlock(ModBlocks.HORNBEAM_SLAB.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));
        buttonBlock(ModBlocks.HORNBEAM_BUTTON.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));
        pressurePlateBlock(ModBlocks.HORNBEAM_PRESSURE_PLATE.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));
        fenceBlock(ModBlocks.HORNBEAM_FENCE.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));
        fenceGateBlock(ModBlocks.HORNBEAM_FENCE_GATE.get(), blockTexture(ModBlocks.HORNBEAM_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.HORNBEAM_DOOR.get(), modLoc("block/hornbeam_door_bottom"), modLoc("block/hornbeam_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.HORNBEAM_TRAPDOOR.get(), modLoc("block/hornbeam_trapdoor"), true,"cutout");

        blockItem(ModBlocks.HORNBEAM_STAIRS);
        blockItem(ModBlocks.HORNBEAM_SLAB);
        blockItem(ModBlocks.HORNBEAM_PRESSURE_PLATE);
        blockItem(ModBlocks.HORNBEAM_FENCE_GATE);
        blockItem(ModBlocks.HORNBEAM_TRAPDOOR,"_bottom");

        // LINDEN
        logBlock(((RotatedPillarBlock) ModBlocks.LINDEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LINDEN_WOOD.get()), blockTexture(ModBlocks.LINDEN_LOG.get()), blockTexture(ModBlocks.LINDEN_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LINDEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LINDEN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LINDEN_LOG.get()), blockTexture(ModBlocks.STRIPPED_LINDEN_LOG.get()));

        blockItem(ModBlocks.LINDEN_LOG);
        blockItem(ModBlocks.STRIPPED_LINDEN_LOG);
        blockItem(ModBlocks.LINDEN_WOOD);
        blockItem(ModBlocks.STRIPPED_LINDEN_WOOD);

        blockWithItem(ModBlocks.LINDEN_PLANKS);

        leavesBlock(ModBlocks.LINDEN_LEAVES);
        saplingBlock(ModBlocks.LINDEN_SAPLING);

        stairsBlock(ModBlocks.LINDEN_STAIRS.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()));
        slabBlock(ModBlocks.LINDEN_SLAB.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()), blockTexture(ModBlocks.LINDEN_PLANKS.get()));
        buttonBlock(ModBlocks.LINDEN_BUTTON.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()));
        pressurePlateBlock(ModBlocks.LINDEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()));
        fenceBlock(ModBlocks.LINDEN_FENCE.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()));
        fenceGateBlock(ModBlocks.LINDEN_FENCE_GATE.get(), blockTexture(ModBlocks.LINDEN_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.LINDEN_DOOR.get(), modLoc("block/linden_door_bottom"), modLoc("block/linden_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.LINDEN_TRAPDOOR.get(), modLoc("block/linden_trapdoor"), true,"cutout");

        blockItem(ModBlocks.LINDEN_STAIRS);
        blockItem(ModBlocks.LINDEN_SLAB);
        blockItem(ModBlocks.LINDEN_PRESSURE_PLATE);
        blockItem(ModBlocks.LINDEN_FENCE_GATE);
        blockItem(ModBlocks.LINDEN_TRAPDOOR,"_bottom");
        
        // GINKGO
        logBlock(((RotatedPillarBlock) ModBlocks.GINKGO_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GINKGO_WOOD.get()), blockTexture(ModBlocks.GINKGO_LOG.get()), blockTexture(ModBlocks.GINKGO_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GINKGO_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GINKGO_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()), blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()));

        blockItem(ModBlocks.GINKGO_LOG);
        blockItem(ModBlocks.STRIPPED_GINKGO_LOG);
        blockItem(ModBlocks.GINKGO_WOOD);
        blockItem(ModBlocks.STRIPPED_GINKGO_WOOD);

        blockWithItem(ModBlocks.GINKGO_PLANKS);

        leavesBlock(ModBlocks.GINKGO_LEAVES);
        saplingBlock(ModBlocks.GINKGO_SAPLING);

        stairsBlock(ModBlocks.GINKGO_STAIRS.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        slabBlock(ModBlocks.GINKGO_SLAB.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        buttonBlock(ModBlocks.GINKGO_BUTTON.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        pressurePlateBlock(ModBlocks.GINKGO_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        fenceBlock(ModBlocks.GINKGO_FENCE.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        fenceGateBlock(ModBlocks.GINKGO_FENCE_GATE.get(), blockTexture(ModBlocks.GINKGO_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.GINKGO_DOOR.get(), modLoc("block/ginkgo_door_bottom"), modLoc("block/ginkgo_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.GINKGO_TRAPDOOR.get(), modLoc("block/ginkgo_trapdoor"), true,"cutout");

        blockItem(ModBlocks.GINKGO_STAIRS);
        blockItem(ModBlocks.GINKGO_SLAB);
        blockItem(ModBlocks.GINKGO_PRESSURE_PLATE);
        blockItem(ModBlocks.GINKGO_FENCE_GATE);
        blockItem(ModBlocks.GINKGO_TRAPDOOR,"_bottom");
        
        // POPLAR
        logBlock(((RotatedPillarBlock) ModBlocks.POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.POPLAR_WOOD.get()), blockTexture(ModBlocks.POPLAR_LOG.get()), blockTexture(ModBlocks.POPLAR_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_POPLAR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_POPLAR_LOG.get()), blockTexture(ModBlocks.STRIPPED_POPLAR_LOG.get()));

        blockItem(ModBlocks.POPLAR_LOG);
        blockItem(ModBlocks.STRIPPED_POPLAR_LOG);
        blockItem(ModBlocks.POPLAR_WOOD);
        blockItem(ModBlocks.STRIPPED_POPLAR_WOOD);

        blockWithItem(ModBlocks.POPLAR_PLANKS);

        leavesBlock(ModBlocks.POPLAR_LEAVES);
        saplingBlock(ModBlocks.POPLAR_SAPLING);

        stairsBlock(ModBlocks.POPLAR_STAIRS.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        slabBlock(ModBlocks.POPLAR_SLAB.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        buttonBlock(ModBlocks.POPLAR_BUTTON.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POPLAR_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        fenceBlock(ModBlocks.POPLAR_FENCE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        fenceGateBlock(ModBlocks.POPLAR_FENCE_GATE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POPLAR_DOOR.get(), modLoc("block/poplar_door_bottom"), modLoc("block/poplar_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.POPLAR_TRAPDOOR.get(), modLoc("block/poplar_trapdoor"), true,"cutout");

        blockItem(ModBlocks.POPLAR_STAIRS);
        blockItem(ModBlocks.POPLAR_SLAB);
        blockItem(ModBlocks.POPLAR_PRESSURE_PLATE);
        blockItem(ModBlocks.POPLAR_FENCE_GATE);
        blockItem(ModBlocks.POPLAR_TRAPDOOR,"_bottom");
        
        // MAPLE
        logBlock(((RotatedPillarBlock) ModBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAPLE_WOOD.get()), blockTexture(ModBlocks.MAPLE_LOG.get()), blockTexture(ModBlocks.MAPLE_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()));

        blockItem(ModBlocks.MAPLE_LOG);
        blockItem(ModBlocks.STRIPPED_MAPLE_LOG);
        blockItem(ModBlocks.MAPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_MAPLE_WOOD);

        blockWithItem(ModBlocks.MAPLE_PLANKS);

        leavesBlock(ModBlocks.MAPLE_LEAVES);
        saplingBlock(ModBlocks.MAPLE_SAPLING);

        stairsBlock(ModBlocks.MAPLE_STAIRS.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        slabBlock(ModBlocks.MAPLE_SLAB.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        buttonBlock(ModBlocks.MAPLE_BUTTON.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.MAPLE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        fenceBlock(ModBlocks.MAPLE_FENCE.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        fenceGateBlock(ModBlocks.MAPLE_FENCE_GATE.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.MAPLE_DOOR.get(), modLoc("block/maple_door_bottom"), modLoc("block/maple_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.MAPLE_TRAPDOOR.get(), modLoc("block/maple_trapdoor"), true,"cutout");

        blockItem(ModBlocks.MAPLE_STAIRS);
        blockItem(ModBlocks.MAPLE_SLAB);
        blockItem(ModBlocks.MAPLE_PRESSURE_PLATE);
        blockItem(ModBlocks.MAPLE_FENCE_GATE);
        blockItem(ModBlocks.MAPLE_TRAPDOOR,"_bottom");

        // BAOBAB
        logBlock(((RotatedPillarBlock) ModBlocks.BAOBAB_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BAOBAB_WOOD.get()), blockTexture(ModBlocks.BAOBAB_LOG.get()), blockTexture(ModBlocks.BAOBAB_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BAOBAB_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BAOBAB_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BAOBAB_LOG.get()), blockTexture(ModBlocks.STRIPPED_BAOBAB_LOG.get()));

        blockItem(ModBlocks.BAOBAB_LOG);
        blockItem(ModBlocks.STRIPPED_BAOBAB_LOG);
        blockItem(ModBlocks.BAOBAB_WOOD);
        blockItem(ModBlocks.STRIPPED_BAOBAB_WOOD);

        blockWithItem(ModBlocks.BAOBAB_PLANKS);

        leavesBlock(ModBlocks.BAOBAB_LEAVES);
        saplingBlock(ModBlocks.BAOBAB_SAPLING);

        stairsBlock(ModBlocks.BAOBAB_STAIRS.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        slabBlock(ModBlocks.BAOBAB_SLAB.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        buttonBlock(ModBlocks.BAOBAB_BUTTON.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        pressurePlateBlock(ModBlocks.BAOBAB_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        fenceBlock(ModBlocks.BAOBAB_FENCE.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        fenceGateBlock(ModBlocks.BAOBAB_FENCE_GATE.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.BAOBAB_DOOR.get(), modLoc("block/baobab_door_bottom"), modLoc("block/baobab_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.BAOBAB_TRAPDOOR.get(), modLoc("block/baobab_trapdoor"), true,"cutout");

        blockItem(ModBlocks.BAOBAB_STAIRS);
        blockItem(ModBlocks.BAOBAB_SLAB);
        blockItem(ModBlocks.BAOBAB_PRESSURE_PLATE);
        blockItem(ModBlocks.BAOBAB_FENCE_GATE);
        blockItem(ModBlocks.BAOBAB_TRAPDOOR,"_bottom");
        // PALM
        logBlock(((RotatedPillarBlock) ModBlocks.PALM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PALM_WOOD.get()), blockTexture(ModBlocks.PALM_LOG.get()), blockTexture(ModBlocks.PALM_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PALM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PALM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PALM_LOG.get()), blockTexture(ModBlocks.STRIPPED_PALM_LOG.get()));

        blockItem(ModBlocks.PALM_LOG);
        blockItem(ModBlocks.STRIPPED_PALM_LOG);
        blockItem(ModBlocks.PALM_WOOD);
        blockItem(ModBlocks.STRIPPED_PALM_WOOD);

        blockWithItem(ModBlocks.PALM_PLANKS);

        leavesBlock(ModBlocks.PALM_LEAVES);
        saplingBlock(ModBlocks.PALM_SAPLING);

        stairsBlock(ModBlocks.PALM_STAIRS.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));
        slabBlock(ModBlocks.PALM_SLAB.get(), blockTexture(ModBlocks.PALM_PLANKS.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        buttonBlock(ModBlocks.PALM_BUTTON.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));
        pressurePlateBlock(ModBlocks.PALM_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));
        fenceBlock(ModBlocks.PALM_FENCE.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));
        fenceGateBlock(ModBlocks.PALM_FENCE_GATE.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.PALM_DOOR.get(), modLoc("block/palm_door_bottom"), modLoc("block/palm_door_top"),"cutout");
        trapdoorBlockWithRenderType(ModBlocks.PALM_TRAPDOOR.get(), modLoc("block/palm_trapdoor"), true,"cutout");

        blockItem(ModBlocks.PALM_STAIRS);
        blockItem(ModBlocks.PALM_SLAB);
        blockItem(ModBlocks.PALM_PRESSURE_PLATE);
        blockItem(ModBlocks.PALM_FENCE_GATE);
        blockItem(ModBlocks.PALM_TRAPDOOR,"_bottom");
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
