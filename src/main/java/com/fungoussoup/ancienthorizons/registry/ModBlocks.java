package com.fungoussoup.ancienthorizons.registry;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.custom.ModFlammableRotatedPillarBlock;
import com.fungoussoup.ancienthorizons.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.fungoussoup.ancienthorizons.AncientHorizons.LOGGER;
import static com.fungoussoup.ancienthorizons.AncientHorizons.NAME;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AncientHorizons.MOD_ID);

    // TIMESTONE
    public static final DeferredBlock<Block> TIMESTONE_ORE = registerBlock("timestone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TIMESTONE_ORE = registerBlock("deepslate_timestone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RAW_TIMESTONE_BLOCK = registerBlock("raw_timestone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TIME_MATRIX = registerBlock("time_matrix",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> TIMESTONE_BLOCK = registerBlock("timestone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // ALUMINIUM
    public static final DeferredBlock<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // TIN

    // core
    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    // decoration
    public static final DeferredBlock<Block> CHISELED_TIN = registerBlock("chiseled_tin",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TIN_GRATE = registerBlock("tin_grate",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> CUT_TIN = registerBlock("cut_tin",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CUT_TIN_STAIRS = registerBlock("cut_tin_stairs",
            () -> new StairBlock(ModBlocks.CUT_TIN.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<SlabBlock> CUT_TIN_SLAB = registerBlock("cut_tin_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<DoorBlock> TIN_DOOR = registerBlock("tin_door",
            () -> new DoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.METAL)));
    public static final DeferredBlock<TrapDoorBlock> TIN_TRAPDOOR = registerBlock("tin_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.METAL)));


    // BRONZE
   public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


   // SILVER
   public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
           () -> new DropExperienceBlock(UniformInt.of(0,0),
                   BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
   public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
           () -> new DropExperienceBlock(UniformInt.of(0,0),
                   BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // PLATINUM
    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // COBALT
    public static final DeferredBlock<Block> COBALT_ORE = registerBlock("cobalt_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // TUNGSTEN
    public static final DeferredBlock<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CHISELED_TUNGSTEN = registerBlock("chiseled_tungsten",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TUNGSTEN_GRATE = registerBlock("tungsten_grate",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> CUT_TUNGSTEN = registerBlock("cut_tungsten",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CUT_TUNGSTEN_STAIRS = registerBlock("cut_tungsten_stairs",
            () -> new StairBlock(ModBlocks.CUT_TUNGSTEN.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<SlabBlock> CUT_TUNGSTEN_SLAB = registerBlock("cut_tungsten_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<DoorBlock> TUNGSTEN_DOOR = registerBlock("tungsten_door",
            () -> new DoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.METAL)));
    public static final DeferredBlock<TrapDoorBlock> TUNGSTEN_TRAPDOOR = registerBlock("tungsten_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.METAL)));


    // ZIRCON
    public static final DeferredBlock<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,0),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    // WILLOW
    public static final DeferredBlock<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final DeferredBlock<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(ModTreeGrowers.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<StairBlock> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(ModBlocks.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new ButtonBlock(BlockSetType.OAK,10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<FenceBlock> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // HORNBEAM
    public static final DeferredBlock<Block> HORNBEAM_LOG = registerBlock("hornbeam_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_HORNBEAM_LOG = registerBlock("stripped_hornbeam_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> HORNBEAM_WOOD = registerBlock("hornbeam_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_HORNBEAM_WOOD = registerBlock("stripped_hornbeam_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> HORNBEAM_PLANKS = registerBlock("hornbeam_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final DeferredBlock<Block> HORNBEAM_LEAVES = registerBlock("hornbeam_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> HORNBEAM_SAPLING = registerBlock("hornbeam_sapling",
            () -> new SaplingBlock(ModTreeGrowers.HORNBEAM, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SAPLING)));

    public static final DeferredBlock<StairBlock> HORNBEAM_STAIRS = registerBlock("hornbeam_stairs",
            () -> new StairBlock(ModBlocks.HORNBEAM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> HORNBEAM_SLAB = registerBlock("hornbeam_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> HORNBEAM_PRESSURE_PLATE = registerBlock("hornbeam_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> HORNBEAM_BUTTON = registerBlock("hornbeam_button",
            () -> new ButtonBlock(BlockSetType.OAK,10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<FenceBlock> HORNBEAM_FENCE = registerBlock("hornbeam_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> HORNBEAM_FENCE_GATE = registerBlock("hornbeam_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> HORNBEAM_DOOR = registerBlock("hornbeam_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> HORNBEAM_TRAPDOOR = registerBlock("hornbeam_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // LINDEN
    public static final DeferredBlock<Block> LINDEN_LOG = registerBlock("linden_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_LINDEN_LOG = registerBlock("stripped_linden_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> LINDEN_WOOD = registerBlock("linden_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_LINDEN_WOOD = registerBlock("stripped_linden_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> LINDEN_PLANKS = registerBlock("linden_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final DeferredBlock<Block> LINDEN_LEAVES = registerBlock("linden_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> LINDEN_SAPLING = registerBlock("linden_sapling",
            () -> new SaplingBlock(ModTreeGrowers.LINDEN, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SAPLING)));

    public static final DeferredBlock<StairBlock> LINDEN_STAIRS = registerBlock("linden_stairs",
            () -> new StairBlock(ModBlocks.LINDEN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> LINDEN_SLAB = registerBlock("linden_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> LINDEN_PRESSURE_PLATE = registerBlock("linden_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> LINDEN_BUTTON = registerBlock("linden_button",
            () -> new ButtonBlock(BlockSetType.OAK,10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<FenceBlock> LINDEN_FENCE = registerBlock("linden_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> LINDEN_FENCE_GATE = registerBlock("linden_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> LINDEN_DOOR = registerBlock("linden_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> LINDEN_TRAPDOOR = registerBlock("linden_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));








    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        LOGGER.info("Loaded {} mod blocks", NAME);
    }
}
