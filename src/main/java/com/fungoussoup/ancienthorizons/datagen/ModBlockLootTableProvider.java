package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.block.ModBlocks;
import com.fungoussoup.ancienthorizons.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
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
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.TIME_MATRIX.get());
        dropSelf(ModBlocks.TIMESTONE_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIMESTONE_BLOCK.get());

        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());

        dropSelf(ModBlocks.CUT_TIN_STAIRS.get());
        add(ModBlocks.CUT_TIN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_TIN_SLAB.get()));
        dropSelf(ModBlocks.CUT_TIN.get());
        dropSelf(ModBlocks.CHISELED_TIN.get());
        dropSelf(ModBlocks.TIN_GRATE.get());
        dropSelf(ModBlocks.TIN_TRAPDOOR.get());

        dropSelf(ModBlocks.BRONZE_BLOCK.get());

        add(ModBlocks.TIMESTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TIMESTONE_ORE.get(), ModItems.RAW_TIME_STONE.get(), 0,3));
        add(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get(), ModItems.RAW_TIME_STONE.get(), 0,3));

        add(ModBlocks.ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));
        add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));

        add(ModBlocks.TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
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
