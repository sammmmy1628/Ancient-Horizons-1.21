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
                        output.accept(ModBlocks.TIME_MATRIX);
                        output.accept(ModBlocks.TIMESTONE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TIMESTONE_ORE);
                        output.accept(ModBlocks.TIMESTONE_BLOCK);
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
