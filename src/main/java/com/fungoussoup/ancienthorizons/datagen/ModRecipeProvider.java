package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.block.ModBlocks;
import com.fungoussoup.ancienthorizons.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> TIMESTONE_SMELTABLES = List.of(ModItems.RAW_TIME_STONE,
                ModBlocks.TIMESTONE_ORE, ModBlocks.DEEPSLATE_TIMESTONE_ORE);
        List<ItemLike> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM,
                ModBlocks.ALUMINIUM_ORE, ModBlocks.DEEPSLATE_ALUMINIUM_ORE);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_NUGGET.get())
                .unlockedBy("has_aluminium_nugget", has(ModItems.ALUMINIUM_NUGGET)).save(recipeOutput,"ancienthorizons:aluminium_ingot_from_nugget");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIMESTONE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIME_STONE.get())
                .unlockedBy("has_timestone", has(ModItems.TIME_STONE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIME_MATRIX.get())
                .pattern("OOO")
                .pattern("TNT")
                .pattern("OOO")
                .define('O', Items.OBSIDIAN)
                .define('T', ModItems.TIME_STONE.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_timestone", has(ModItems.TIME_STONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINIUM_BLOCK)
                .unlockedBy("has_aluminium_block", has(ModBlocks.ALUMINIUM_BLOCK.get())).save(recipeOutput,"ancienthorizons:aluminium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT.get())).save(recipeOutput);

        oreSmelting(recipeOutput, TIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.TIME_STONE.get(), 0.25f,200,"time_stone");
        oreBlasting(recipeOutput, TIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.TIME_STONE.get(), 0.25f,100,"time_stone");

        oreSmelting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f,200,"aluminium_ingot");
        oreBlasting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f,100,"aluminium_ingot");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, AncientHorizons.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
