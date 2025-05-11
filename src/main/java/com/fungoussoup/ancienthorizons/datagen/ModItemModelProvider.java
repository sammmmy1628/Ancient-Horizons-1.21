package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AncientHorizons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.ALUMINIUM_NUGGET.get());

        handheldItem(ModItems.ALUMINIUM_SWORD.get());
        handheldItem(ModItems.ALUMINIUM_PICKAXE.get());
        handheldItem(ModItems.ALUMINIUM_AXE.get());
        handheldItem(ModItems.ALUMINIUM_SHOVEL.get());
        handheldItem(ModItems.ALUMINIUM_HOE.get());


        basicItem(ModItems.RAW_TIME_STONE.get());
        basicItem(ModItems.TIME_STONE.get());
    }
}
