package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import com.fungoussoup.ancienthorizons.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AncientHorizons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // TIMESTONE
                .add(ModBlocks.TIMESTONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.RAW_TIMESTONE_BLOCK.get())
                .add(ModBlocks.TIMESTONE_BLOCK.get())
                .add(ModBlocks.TIME_MATRIX.get())

                // ALUMINIUM
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ALUMINIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get())

                // TIN
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())

                .add(ModBlocks.CHISELED_TIN.get())
                .add(ModBlocks.TIN_GRATE.get())
                .add(ModBlocks.CUT_TIN.get())
                .add(ModBlocks.CUT_TIN_STAIRS.get())
                .add(ModBlocks.CUT_TIN_SLAB.get())
                .add(ModBlocks.TIN_DOOR.get())
                .add(ModBlocks.TIN_TRAPDOOR.get())

                // BRONZE
                .add(ModBlocks.BRONZE_BLOCK.get())

                // SILVER
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())

                // PLATINUM
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())

                // COBALT
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get())
                .add(ModBlocks.RAW_COBALT_BLOCK.get())
                .add(ModBlocks.COBALT_BLOCK.get())

                // TUNGSTEN
                .add(ModBlocks.TUNGSTEN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get())
                .add(ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .add(ModBlocks.TUNGSTEN_BLOCK.get())

                .add(ModBlocks.CHISELED_TUNGSTEN.get())
                .add(ModBlocks.TUNGSTEN_GRATE.get())
                .add(ModBlocks.CUT_TUNGSTEN.get())
                .add(ModBlocks.CUT_TUNGSTEN_STAIRS.get())
                .add(ModBlocks.CUT_TUNGSTEN_SLAB.get())
                .add(ModBlocks.TUNGSTEN_DOOR.get())
                .add(ModBlocks.TUNGSTEN_TRAPDOOR.get())

                // ZIRCON
                .add(ModBlocks.ZIRCON_ORE.get())
                .add(ModBlocks.DEEPSLATE_ZIRCON_ORE.get())
                .add(ModBlocks.ZIRCON_BLOCK.get());





        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TIME_MATRIX.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                // ALUMINIUM
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ALUMINIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get())
                // TIN
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())

                .add(ModBlocks.CHISELED_TIN.get())
                .add(ModBlocks.TIN_GRATE.get())
                .add(ModBlocks.CUT_TIN.get())
                .add(ModBlocks.CUT_TIN_STAIRS.get())
                .add(ModBlocks.CUT_TIN_SLAB.get())
                .add(ModBlocks.TIN_DOOR.get())
                .add(ModBlocks.TIN_TRAPDOOR.get())

                // BRONZE
                .add(ModBlocks.BRONZE_BLOCK.get())

                // SILVER
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())

                // PLATINUM
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())

                // COBALT
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.get())
                .add(ModBlocks.RAW_COBALT_BLOCK.get())
                .add(ModBlocks.COBALT_BLOCK.get())

                // TUNGSTEN
                .add(ModBlocks.TUNGSTEN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get())
                .add(ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .add(ModBlocks.TUNGSTEN_BLOCK.get())

                .add(ModBlocks.CHISELED_TUNGSTEN.get())
                .add(ModBlocks.TUNGSTEN_GRATE.get())
                .add(ModBlocks.CUT_TUNGSTEN.get())
                .add(ModBlocks.CUT_TUNGSTEN_STAIRS.get())
                .add(ModBlocks.CUT_TUNGSTEN_SLAB.get())
                .add(ModBlocks.TUNGSTEN_DOOR.get())
                .add(ModBlocks.TUNGSTEN_TRAPDOOR.get())

                // ZIRCON
                .add(ModBlocks.ZIRCON_ORE.get())
                .add(ModBlocks.DEEPSLATE_ZIRCON_ORE.get())
                .add(ModBlocks.ZIRCON_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(Blocks.DIAMOND_ORE);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TIMESTONE_BLOCK.get())
                .add(ModBlocks.TIMESTONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIMESTONE_ORE.get())
                .add(ModBlocks.RAW_TIMESTONE_BLOCK.get());

        tag(ModTags.Blocks.ALUMINIUM_ORES)
                .add(ModBlocks.ALUMINIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_ALUMINIUM_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ALUMINIUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_ALUMINIUM_TOOL);

        tag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.DIAMOND_ORE);

        tag(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_SILVER_TOOL);

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get())
                .add(ModBlocks.WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get())
        
                .add(ModBlocks.HORNBEAM_LOG.get())
                .add(ModBlocks.STRIPPED_HORNBEAM_LOG.get())
                .add(ModBlocks.HORNBEAM_WOOD.get())
                .add(ModBlocks.STRIPPED_HORNBEAM_WOOD.get())
        
                .add(ModBlocks.LINDEN_LOG.get())
                .add(ModBlocks.STRIPPED_LINDEN_LOG.get())
                .add(ModBlocks.LINDEN_WOOD.get())
                .add(ModBlocks.STRIPPED_LINDEN_WOOD.get())
        
                .add(ModBlocks.GINKGO_LOG.get())
                .add(ModBlocks.STRIPPED_GINKGO_LOG.get())
                .add(ModBlocks.GINKGO_WOOD.get())
                .add(ModBlocks.STRIPPED_GINKGO_WOOD.get())
                
                .add(ModBlocks.POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.get())
                .add(ModBlocks.POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.get())
                
                .add(ModBlocks.MAPLE_LOG.get())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.get())
                .add(ModBlocks.MAPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.get())
        
                .add(ModBlocks.BAOBAB_LOG.get())
                .add(ModBlocks.STRIPPED_BAOBAB_LOG.get())
                .add(ModBlocks.BAOBAB_WOOD.get())
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD.get())
                
                .add(ModBlocks.PALM_LOG.get())
                .add(ModBlocks.STRIPPED_PALM_LOG.get())
                .add(ModBlocks.PALM_WOOD.get())
                .add(ModBlocks.STRIPPED_PALM_WOOD.get())
        
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get())
                
                .add(ModBlocks.ASH_LOG.get())
                .add(ModBlocks.STRIPPED_ASH_LOG.get())
                .add(ModBlocks.ASH_WOOD.get())
                .add(ModBlocks.STRIPPED_ASH_WOOD.get())
                
                .add(ModBlocks.BEECH_LOG.get())
                .add(ModBlocks.STRIPPED_BEECH_LOG.get())
                .add(ModBlocks.BEECH_WOOD.get())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.get())
                
                .add(ModBlocks.EUCALYPTUS_LOG.get())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get())
                .add(ModBlocks.EUCALYPTUS_WOOD.get())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get())
                
                .add(ModBlocks.SYCAMORE_LOG.get())
                .add(ModBlocks.STRIPPED_SYCAMORE_LOG.get())
                .add(ModBlocks.SYCAMORE_WOOD.get())
                .add(ModBlocks.STRIPPED_SYCAMORE_WOOD.get())
                
                .add(ModBlocks.REDWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_REDWOOD_LOG.get())
                .add(ModBlocks.REDWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_REDWOOD_WOOD.get())
                
                .add(ModBlocks.MONKEY_PUZZLE_LOG.get())
                .add(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG.get())
                .add(ModBlocks.MONKEY_PUZZLE_WOOD.get())
                .add(ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD.get())
                
                .add(ModBlocks.YEW_LOG.get())
                .add(ModBlocks.STRIPPED_YEW_LOG.get())
                .add(ModBlocks.YEW_WOOD.get())
                .add(ModBlocks.STRIPPED_YEW_WOOD.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.WILLOW_FENCE.get())
                .add(ModBlocks.HORNBEAM_FENCE.get())
                .add(ModBlocks.LINDEN_FENCE.get())
                .add(ModBlocks.GINKGO_FENCE.get())
                .add(ModBlocks.POPLAR_FENCE.get())
                .add(ModBlocks.MAPLE_FENCE.get())
                .add(ModBlocks.BAOBAB_FENCE.get())
                .add(ModBlocks.PALM_FENCE.get())
                .add(ModBlocks.ASPEN_FENCE.get())
                .add(ModBlocks.ASH_FENCE.get())
                .add(ModBlocks.BEECH_FENCE.get())
                .add(ModBlocks.EUCALYPTUS_FENCE.get())
                .add(ModBlocks.SYCAMORE_FENCE.get())
                .add(ModBlocks.REDWOOD_FENCE.get())
                .add(ModBlocks.MONKEY_PUZZLE_FENCE.get())
                .add(ModBlocks.YEW_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WILLOW_FENCE_GATE.get())
                .add(ModBlocks.HORNBEAM_FENCE_GATE.get())
                .add(ModBlocks.LINDEN_FENCE_GATE.get())
                .add(ModBlocks.GINKGO_FENCE_GATE.get())
                .add(ModBlocks.POPLAR_FENCE_GATE.get())
                .add(ModBlocks.MAPLE_FENCE_GATE.get())
                .add(ModBlocks.BAOBAB_FENCE_GATE.get())
                .add(ModBlocks.PALM_FENCE_GATE.get())
                .add(ModBlocks.ASPEN_FENCE_GATE.get())
                .add(ModBlocks.ASH_FENCE_GATE.get())
                .add(ModBlocks.BEECH_FENCE_GATE.get())
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE.get())
                .add(ModBlocks.SYCAMORE_FENCE_GATE.get())
                .add(ModBlocks.REDWOOD_FENCE_GATE.get())
                .add(ModBlocks.MONKEY_PUZZLE_FENCE_GATE.get())
                .add(ModBlocks.YEW_FENCE_GATE.get());

        
    }
}
