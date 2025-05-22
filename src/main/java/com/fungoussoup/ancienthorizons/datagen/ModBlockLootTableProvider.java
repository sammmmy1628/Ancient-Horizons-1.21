package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import com.fungoussoup.ancienthorizons.registry.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        // TIMESTONE
        dropSelf(ModBlocks.TIME_MATRIX.get());
        dropSelf(ModBlocks.TIMESTONE_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIMESTONE_BLOCK.get());

        add(ModBlocks.TIMESTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TIMESTONE_ORE.get(), ModItems.RAW_TIME_STONE.get(), 0,3));
        add(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get(), ModItems.RAW_TIME_STONE.get(), 0,3));


        // ALUMINIUM
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());

        add(ModBlocks.ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));
        add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));


        // TIN
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());

        dropSelf(ModBlocks.CUT_TIN_STAIRS.get());
        add(ModBlocks.CUT_TIN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_TIN_SLAB.get()));
        dropSelf(ModBlocks.CUT_TIN.get());
        dropSelf(ModBlocks.CHISELED_TIN.get());
        dropSelf(ModBlocks.TIN_GRATE.get());
        dropSelf(ModBlocks.TIN_TRAPDOOR.get());
        add(ModBlocks.TIN_DOOR.get(),
                block -> createDoorTable(ModBlocks.TIN_DOOR.get()));

        add(ModBlocks.TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));


        // BRONZE
        dropSelf(ModBlocks.BRONZE_BLOCK.get());


        // SILVER
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());

        add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));


        // PLATINUM
        dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_BLOCK.get());


        add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));


        // COBALT
        dropSelf(ModBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(ModBlocks.COBALT_BLOCK.get());

        add(ModBlocks.COBALT_ORE.get(),
                block -> createOreDrop(ModBlocks.COBALT_ORE.get(), ModItems.RAW_COBALT.get()));
        add(ModBlocks.DEEPSLATE_COBALT_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_COBALT_ORE.get(), ModItems.RAW_COBALT.get()));


        // TUNGSTEN
        dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());

        dropSelf(ModBlocks.CUT_TUNGSTEN_STAIRS.get());
        add(ModBlocks.CUT_TUNGSTEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_TUNGSTEN_SLAB.get()));
        dropSelf(ModBlocks.CUT_TUNGSTEN.get());
        dropSelf(ModBlocks.CHISELED_TUNGSTEN.get());
        dropSelf(ModBlocks.TUNGSTEN_GRATE.get());
        dropSelf(ModBlocks.TUNGSTEN_TRAPDOOR.get());
        add(ModBlocks.TUNGSTEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.TUNGSTEN_DOOR.get()));

        add(ModBlocks.TUNGSTEN_ORE.get(),
                block -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));
        add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));


        // ZIRCON
        dropSelf(ModBlocks.ZIRCON_BLOCK.get());

        add(ModBlocks.ZIRCON_ORE.get(),
                block -> createOreDrop(ModBlocks.ZIRCON_ORE.get(), ModItems.ZIRCON.get()));
        add(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(), ModItems.ZIRCON.get()));


        // WILLOW
        dropSelf(ModBlocks.WILLOW_LOG.get());
        dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        dropSelf(ModBlocks.WILLOW_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        dropSelf(ModBlocks.WILLOW_PLANKS.get());
        dropSelf(ModBlocks.WILLOW_SAPLING.get());

        add(ModBlocks.WILLOW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.WILLOW_STAIRS.get());
        add(ModBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WILLOW_SLAB.get()));
        dropSelf(ModBlocks.WILLOW_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WILLOW_BUTTON.get());
        dropSelf(ModBlocks.WILLOW_FENCE.get());
        dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());
        dropSelf(ModBlocks.WILLOW_TRAPDOOR.get());

        add(ModBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(ModBlocks.WILLOW_DOOR.get()));

        // HORNBEAM
        dropSelf(ModBlocks.HORNBEAM_LOG.get());
        dropSelf(ModBlocks.STRIPPED_HORNBEAM_LOG.get());
        dropSelf(ModBlocks.HORNBEAM_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_HORNBEAM_WOOD.get());
        dropSelf(ModBlocks.HORNBEAM_PLANKS.get());
        dropSelf(ModBlocks.HORNBEAM_SAPLING.get());

        add(ModBlocks.HORNBEAM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.HORNBEAM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.HORNBEAM_STAIRS.get());
        add(ModBlocks.HORNBEAM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.HORNBEAM_SLAB.get()));
        dropSelf(ModBlocks.HORNBEAM_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.HORNBEAM_BUTTON.get());
        dropSelf(ModBlocks.HORNBEAM_FENCE.get());
        dropSelf(ModBlocks.HORNBEAM_FENCE_GATE.get());
        dropSelf(ModBlocks.HORNBEAM_TRAPDOOR.get());

        add(ModBlocks.HORNBEAM_DOOR.get(),
                block -> createDoorTable(ModBlocks.HORNBEAM_DOOR.get()));

        // LINDEN
        dropSelf(ModBlocks.LINDEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LINDEN_LOG.get());
        dropSelf(ModBlocks.LINDEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LINDEN_WOOD.get());
        dropSelf(ModBlocks.LINDEN_PLANKS.get());
        dropSelf(ModBlocks.LINDEN_SAPLING.get());

        add(ModBlocks.LINDEN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.LINDEN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.LINDEN_STAIRS.get());
        add(ModBlocks.LINDEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LINDEN_SLAB.get()));
        dropSelf(ModBlocks.LINDEN_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LINDEN_BUTTON.get());
        dropSelf(ModBlocks.LINDEN_FENCE.get());
        dropSelf(ModBlocks.LINDEN_FENCE_GATE.get());
        dropSelf(ModBlocks.LINDEN_TRAPDOOR.get());

        add(ModBlocks.LINDEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.LINDEN_DOOR.get()));
        
        // GINGKO
        dropSelf(ModBlocks.GINKGO_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GINKGO_LOG.get());
        dropSelf(ModBlocks.GINKGO_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GINKGO_WOOD.get());
        dropSelf(ModBlocks.GINKGO_PLANKS.get());
        dropSelf(ModBlocks.GINKGO_SAPLING.get());

        add(ModBlocks.GINKGO_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GINKGO_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.GINKGO_STAIRS.get());
        add(ModBlocks.GINKGO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GINKGO_SLAB.get()));
        dropSelf(ModBlocks.GINKGO_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.GINKGO_BUTTON.get());
        dropSelf(ModBlocks.GINKGO_FENCE.get());
        dropSelf(ModBlocks.GINKGO_FENCE_GATE.get());
        dropSelf(ModBlocks.GINKGO_TRAPDOOR.get());

        add(ModBlocks.GINKGO_DOOR.get(),
                block -> createDoorTable(ModBlocks.GINKGO_DOOR.get()));
        
        // POPLAR
        dropSelf(ModBlocks.POPLAR_LOG.get());
        dropSelf(ModBlocks.STRIPPED_POPLAR_LOG.get());
        dropSelf(ModBlocks.POPLAR_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD.get());
        dropSelf(ModBlocks.POPLAR_PLANKS.get());
        dropSelf(ModBlocks.POPLAR_SAPLING.get());

        add(ModBlocks.POPLAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.POPLAR_STAIRS.get());
        add(ModBlocks.POPLAR_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POPLAR_SLAB.get()));
        dropSelf(ModBlocks.POPLAR_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POPLAR_BUTTON.get());
        dropSelf(ModBlocks.POPLAR_FENCE.get());
        dropSelf(ModBlocks.POPLAR_FENCE_GATE.get());
        dropSelf(ModBlocks.POPLAR_TRAPDOOR.get());

        add(ModBlocks.POPLAR_DOOR.get(),
                block -> createDoorTable(ModBlocks.POPLAR_DOOR.get()));
        
        // MAPLE
        dropSelf(ModBlocks.MAPLE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MAPLE_LOG.get());
        dropSelf(ModBlocks.MAPLE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MAPLE_WOOD.get());
        dropSelf(ModBlocks.MAPLE_PLANKS.get());
        dropSelf(ModBlocks.MAPLE_SAPLING.get());

        add(ModBlocks.MAPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.MAPLE_STAIRS.get());
        add(ModBlocks.MAPLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAPLE_SLAB.get()));
        dropSelf(ModBlocks.MAPLE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MAPLE_BUTTON.get());
        dropSelf(ModBlocks.MAPLE_FENCE.get());
        dropSelf(ModBlocks.MAPLE_FENCE_GATE.get());
        dropSelf(ModBlocks.MAPLE_TRAPDOOR.get());

        add(ModBlocks.MAPLE_DOOR.get(),
                block -> createDoorTable(ModBlocks.MAPLE_DOOR.get()));
        
        // BAOBAB
        dropSelf(ModBlocks.BAOBAB_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BAOBAB_LOG.get());
        dropSelf(ModBlocks.BAOBAB_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BAOBAB_WOOD.get());
        dropSelf(ModBlocks.BAOBAB_PLANKS.get());
        dropSelf(ModBlocks.BAOBAB_SAPLING.get());

        add(ModBlocks.BAOBAB_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BAOBAB_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.BAOBAB_STAIRS.get());
        add(ModBlocks.BAOBAB_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BAOBAB_SLAB.get()));
        dropSelf(ModBlocks.BAOBAB_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BAOBAB_BUTTON.get());
        dropSelf(ModBlocks.BAOBAB_FENCE.get());
        dropSelf(ModBlocks.BAOBAB_FENCE_GATE.get());
        dropSelf(ModBlocks.BAOBAB_TRAPDOOR.get());

        add(ModBlocks.BAOBAB_DOOR.get(),
                block -> createDoorTable(ModBlocks.BAOBAB_DOOR.get()));

        // PALM
        dropSelf(ModBlocks.PALM_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PALM_LOG.get());
        dropSelf(ModBlocks.PALM_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PALM_WOOD.get());
        dropSelf(ModBlocks.PALM_PLANKS.get());
        dropSelf(ModBlocks.PALM_SAPLING.get());

        add(ModBlocks.PALM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PALM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.PALM_STAIRS.get());
        add(ModBlocks.PALM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALM_SLAB.get()));
        dropSelf(ModBlocks.PALM_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PALM_BUTTON.get());
        dropSelf(ModBlocks.PALM_FENCE.get());
        dropSelf(ModBlocks.PALM_FENCE_GATE.get());
        dropSelf(ModBlocks.PALM_TRAPDOOR.get());

        add(ModBlocks.PALM_DOOR.get(),
                block -> createDoorTable(ModBlocks.PALM_DOOR.get()));

        // ASPEN
        dropSelf(ModBlocks.ASPEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ASPEN_LOG.get());
        dropSelf(ModBlocks.ASPEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        dropSelf(ModBlocks.ASPEN_PLANKS.get());
        dropSelf(ModBlocks.ASPEN_SAPLING.get());

        add(ModBlocks.ASPEN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ASPEN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.ASPEN_STAIRS.get());
        add(ModBlocks.ASPEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASPEN_SLAB.get()));
        dropSelf(ModBlocks.ASPEN_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ASPEN_BUTTON.get());
        dropSelf(ModBlocks.ASPEN_FENCE.get());
        dropSelf(ModBlocks.ASPEN_FENCE_GATE.get());
        dropSelf(ModBlocks.ASPEN_TRAPDOOR.get());

        add(ModBlocks.ASPEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASPEN_DOOR.get()));

        // ASH
        dropSelf(ModBlocks.ASH_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ASH_LOG.get());
        dropSelf(ModBlocks.ASH_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ASH_WOOD.get());
        dropSelf(ModBlocks.ASH_PLANKS.get());
        dropSelf(ModBlocks.ASH_SAPLING.get());

        add(ModBlocks.ASH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ASH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.ASH_STAIRS.get());
        add(ModBlocks.ASH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASH_SLAB.get()));
        dropSelf(ModBlocks.ASH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ASH_BUTTON.get());
        dropSelf(ModBlocks.ASH_FENCE.get());
        dropSelf(ModBlocks.ASH_FENCE_GATE.get());
        dropSelf(ModBlocks.ASH_TRAPDOOR.get());

        add(ModBlocks.ASH_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASH_DOOR.get()));

        // BEECH
        dropSelf(ModBlocks.BEECH_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BEECH_LOG.get());
        dropSelf(ModBlocks.BEECH_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BEECH_WOOD.get());
        dropSelf(ModBlocks.BEECH_PLANKS.get());
        dropSelf(ModBlocks.BEECH_SAPLING.get());

        add(ModBlocks.BEECH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BEECH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.BEECH_STAIRS.get());
        add(ModBlocks.BEECH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BEECH_SLAB.get()));
        dropSelf(ModBlocks.BEECH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BEECH_BUTTON.get());
        dropSelf(ModBlocks.BEECH_FENCE.get());
        dropSelf(ModBlocks.BEECH_FENCE_GATE.get());
        dropSelf(ModBlocks.BEECH_TRAPDOOR.get());

        add(ModBlocks.BEECH_DOOR.get(),
                block -> createDoorTable(ModBlocks.BEECH_DOOR.get()));

        // EUCALYPTUS
        dropSelf(ModBlocks.EUCALYPTUS_LOG.get());
        dropSelf(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        dropSelf(ModBlocks.EUCALYPTUS_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        dropSelf(ModBlocks.EUCALYPTUS_PLANKS.get());
        dropSelf(ModBlocks.EUCALYPTUS_SAPLING.get());

        add(ModBlocks.EUCALYPTUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.EUCALYPTUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.EUCALYPTUS_STAIRS.get());
        add(ModBlocks.EUCALYPTUS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EUCALYPTUS_SLAB.get()));
        dropSelf(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.EUCALYPTUS_BUTTON.get());
        dropSelf(ModBlocks.EUCALYPTUS_FENCE.get());
        dropSelf(ModBlocks.EUCALYPTUS_FENCE_GATE.get());
        dropSelf(ModBlocks.EUCALYPTUS_TRAPDOOR.get());

        add(ModBlocks.EUCALYPTUS_DOOR.get(),
                block -> createDoorTable(ModBlocks.EUCALYPTUS_DOOR.get()));

        // SYCAMORE
        dropSelf(ModBlocks.SYCAMORE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_SYCAMORE_LOG.get());
        dropSelf(ModBlocks.SYCAMORE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_SYCAMORE_WOOD.get());
        dropSelf(ModBlocks.SYCAMORE_PLANKS.get());
        dropSelf(ModBlocks.SYCAMORE_SAPLING.get());

        add(ModBlocks.SYCAMORE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.SYCAMORE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.SYCAMORE_STAIRS.get());
        add(ModBlocks.SYCAMORE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SYCAMORE_SLAB.get()));
        dropSelf(ModBlocks.SYCAMORE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SYCAMORE_BUTTON.get());
        dropSelf(ModBlocks.SYCAMORE_FENCE.get());
        dropSelf(ModBlocks.SYCAMORE_FENCE_GATE.get());
        dropSelf(ModBlocks.SYCAMORE_TRAPDOOR.get());

        add(ModBlocks.SYCAMORE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SYCAMORE_DOOR.get()));

        // REDWOOD
        dropSelf(ModBlocks.REDWOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_REDWOOD_LOG.get());
        dropSelf(ModBlocks.REDWOOD_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
        dropSelf(ModBlocks.REDWOOD_PLANKS.get());
        dropSelf(ModBlocks.REDWOOD_SAPLING.get());

        add(ModBlocks.REDWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.REDWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.REDWOOD_STAIRS.get());
        add(ModBlocks.REDWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.REDWOOD_SLAB.get()));
        dropSelf(ModBlocks.REDWOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.REDWOOD_BUTTON.get());
        dropSelf(ModBlocks.REDWOOD_FENCE.get());
        dropSelf(ModBlocks.REDWOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.REDWOOD_TRAPDOOR.get());

        add(ModBlocks.REDWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.REDWOOD_DOOR.get()));

        // MONKEY_PUZZLE
        dropSelf(ModBlocks.MONKEY_PUZZLE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_PLANKS.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_SAPLING.get());

        add(ModBlocks.MONKEY_PUZZLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MONKEY_PUZZLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.MONKEY_PUZZLE_STAIRS.get());
        add(ModBlocks.MONKEY_PUZZLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MONKEY_PUZZLE_SLAB.get()));
        dropSelf(ModBlocks.MONKEY_PUZZLE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_BUTTON.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_FENCE.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_FENCE_GATE.get());
        dropSelf(ModBlocks.MONKEY_PUZZLE_TRAPDOOR.get());

        add(ModBlocks.MONKEY_PUZZLE_DOOR.get(),
                block -> createDoorTable(ModBlocks.MONKEY_PUZZLE_DOOR.get()));

        // YEW
        dropSelf(ModBlocks.YEW_LOG.get());
        dropSelf(ModBlocks.STRIPPED_YEW_LOG.get());
        dropSelf(ModBlocks.YEW_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_YEW_WOOD.get());
        dropSelf(ModBlocks.YEW_PLANKS.get());
        dropSelf(ModBlocks.YEW_SAPLING.get());

        add(ModBlocks.YEW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.YEW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.YEW_STAIRS.get());
        add(ModBlocks.YEW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YEW_SLAB.get()));
        dropSelf(ModBlocks.YEW_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.YEW_BUTTON.get());
        dropSelf(ModBlocks.YEW_FENCE.get());
        dropSelf(ModBlocks.YEW_FENCE_GATE.get());
        dropSelf(ModBlocks.YEW_TRAPDOOR.get());

        add(ModBlocks.YEW_DOOR.get(),
                block -> createDoorTable(ModBlocks.YEW_DOOR.get()));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
