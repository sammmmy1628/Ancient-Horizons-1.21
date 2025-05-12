package com.fungoussoup.ancienthorizons.item;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientHorizons.MOD_ID);

    public static final Supplier<CreativeModeTab> ANCIENT_HORIZONS_TAB = CREATIVE_MODE_TAB.register("ancient_horizons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIME_STONE.get()))
                    .title(Component.translatable("creativetab.ancienthorizons.ancient_horizons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TIME_STONE);
                        output.accept(ModItems.RAW_TIME_STONE);
                        output.accept(ModItems.RAW_ALUMINIUM);
                        output.accept(ModBlocks.TIME_MATRIX);
                        output.accept(ModBlocks.TIMESTONE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TIMESTONE_ORE);
                        output.accept(ModBlocks.TIMESTONE_BLOCK);
                        output.accept(ModBlocks.RAW_TIMESTONE_BLOCK);


                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModItems.ALUMINIUM_NUGGET);
                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK);

                        output.accept(ModItems.ALUMINIUM_SWORD);
                        output.accept(ModItems.ALUMINIUM_PICKAXE);
                        output.accept(ModItems.ALUMINIUM_AXE);
                        output.accept(ModItems.ALUMINIUM_SHOVEL);
                        output.accept(ModItems.ALUMINIUM_HOE);
                        output.accept(ModItems.ALUMINIUM_HAMMER);

                        output.accept(ModItems.ALUMINIUM_HELMET);
                        output.accept(ModItems.ALUMINIUM_CHESTPLATE);
                        output.accept(ModItems.ALUMINIUM_LEGGINGS);
                        output.accept(ModItems.ALUMINIUM_BOOTS);


                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE);
                        output.accept(ModBlocks.RAW_TIN_BLOCK);
                        output.accept(ModBlocks.TIN_BLOCK);
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModItems.TIN_NUGGET);
                        output.accept(ModItems.RAW_TIN);

                        output.accept(ModBlocks.CHISELED_TIN);
                        output.accept(ModBlocks.TIN_GRATE);
                        output.accept(ModBlocks.CUT_TIN);
                        output.accept(ModBlocks.CUT_TIN_STAIRS);
                        output.accept(ModBlocks.CUT_TIN_SLAB);
                        output.accept(ModBlocks.TIN_DOOR);
                        output.accept(ModBlocks.TIN_TRAPDOOR);

                        output.accept(ModItems.BRONZE_ALLOY);
                        output.accept(ModItems.BRONZE_NUGGET);
                        output.accept(ModBlocks.BRONZE_BLOCK);

                        output.accept(ModItems.BRONZE_SWORD);
                        output.accept(ModItems.BRONZE_PICKAXE);
                        output.accept(ModItems.BRONZE_AXE);
                        output.accept(ModItems.BRONZE_SHOVEL);
                        output.accept(ModItems.BRONZE_HOE);

                        output.accept(ModItems.BRONZE_HELMET);
                        output.accept(ModItems.BRONZE_CHESTPLATE);
                        output.accept(ModItems.BRONZE_LEGGINGS);
                        output.accept(ModItems.BRONZE_BOOTS);

                    }).build());

    public static final Supplier<CreativeModeTab> EARLY_PALAEOZOIC_ERA_TAB = CREATIVE_MODE_TAB.register("early_palaeozoic_era_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TIMESTONE_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, "ancient_horizons_tab"))
                    .title(Component.translatable("creativetab.ancienthorizons.early_palaeozoic_era"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.BEDROCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
