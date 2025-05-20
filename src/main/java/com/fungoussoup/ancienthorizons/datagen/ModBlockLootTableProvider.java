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
