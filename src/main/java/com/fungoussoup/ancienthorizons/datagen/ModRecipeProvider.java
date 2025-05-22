package com.fungoussoup.ancienthorizons.datagen;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.registry.ModBlocks;
import com.fungoussoup.ancienthorizons.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.common.Mod;
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
        List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN,
                ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);
        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER,
                ModBlocks.SILVER_ORE, ModBlocks.DEEPSLATE_SILVER_ORE);
        List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM,
                ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE);
        List<ItemLike> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT,
                ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE);
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN,
                ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

        // TIMESTONE

        // timestone block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIMESTONE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIME_STONE.get())
                .unlockedBy("has_timestone", has(ModItems.TIME_STONE)).save(recipeOutput);

        // raw timestone block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TIMESTONE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TIME_STONE.get())
                .unlockedBy("has_raw_timestone", has(ModItems.RAW_TIME_STONE)).save(recipeOutput);

        // raw timestone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TIME_STONE.get(), 9)
                .requires(ModBlocks.RAW_TIMESTONE_BLOCK)
                .unlockedBy("has_raw_timestone_block", has(ModBlocks.RAW_TIMESTONE_BLOCK.get())).save(recipeOutput);

        // timestone
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIME_STONE.get(), 9)
                .requires(ModBlocks.TIMESTONE_BLOCK)
                .unlockedBy("has_timestone_block", has(ModBlocks.TIMESTONE_BLOCK.get())).save(recipeOutput);

        oreSmelting(recipeOutput, TIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.TIME_STONE.get(), 0.25f,200,"time_stone");
        oreBlasting(recipeOutput, TIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.TIME_STONE.get(), 0.25f,100,"time_stone");

        // time matrix
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIME_MATRIX.get())
                .pattern("OOO")
                .pattern("TNT")
                .pattern("OOO")
                .define('O', Items.OBSIDIAN)
                .define('T', ModItems.TIME_STONE.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_timestone", has(ModItems.TIME_STONE)).save(recipeOutput);



        // ALUMINIUM

        // aluminium block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);

        // raw aluminium block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ALUMINIUM.get())
                .unlockedBy("has_raw_aluminium", has(ModItems.RAW_ALUMINIUM)).save(recipeOutput);

        // aluminium ingot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_NUGGET.get())
                .unlockedBy("has_aluminium_nugget", has(ModItems.ALUMINIUM_NUGGET)).save(recipeOutput,"ancienthorizons:aluminium_ingot_from_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINIUM_BLOCK)
                .unlockedBy("has_aluminium_block", has(ModBlocks.ALUMINIUM_BLOCK.get())).save(recipeOutput,"ancienthorizons:aluminium_ingot_from_block");

        oreSmelting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f,200,"aluminium_ingot");
        oreBlasting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f,100,"aluminium_ingot");

        // raw aluminium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM.get(), 9)
                .requires(ModBlocks.RAW_ALUMINIUM_BLOCK)
                .unlockedBy("has_raw_aluminium_block", has(ModBlocks.RAW_ALUMINIUM_BLOCK.get())).save(recipeOutput);

        // aluminium nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT.get())).save(recipeOutput);

        // aluminium armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);

        // aluminium tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput,"aluminium_axe_left");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput,"aluminium_axe_right");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput,"aluminium_hoe_right");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput, "aluminium_hoe_left");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_HAMMER.get())
                .pattern(" X ")
                .pattern(" /X")
                .pattern("/  ")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_aluminium_ingot", has(ModItems.ALUMINIUM_INGOT)).save(recipeOutput);

        // TIN

        // raw tin
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TIN.get(), 9)
                .requires(ModBlocks.RAW_TIN_BLOCK)
                .unlockedBy("has_raw_tin_block", has(ModBlocks.RAW_TIN_BLOCK.get())).save(recipeOutput);

        // raw tin block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TIN.get())
                .unlockedBy("has_raw_tin", has(ModItems.RAW_TIN)).save(recipeOutput);

        // tin ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK.get())).save(recipeOutput,"tin_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_NUGGET.get())
                .unlockedBy("has_tin_nugget", has(ModItems.TIN_NUGGET)).save(recipeOutput,"tin_from_nugget");

        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f,200,"tin_ingot");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f,100,"tin_ingot");

        // tin nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                .requires(ModItems.TIN_INGOT)
                .unlockedBy("has_tin", has(ModItems.TIN_INGOT.get())).save(recipeOutput);

        // tin block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT)).save(recipeOutput);

        // decorational
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUT_TIN.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.TIN_BLOCK.get())
                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_TIN.get())
                .pattern("X")
                .pattern("X")
                .define('X', ModBlocks.CUT_TIN_SLAB.get())
                .unlockedBy("has_cut_tin_slab", has(ModBlocks.CUT_TIN_SLAB)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_GRATE.get())
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .define('X', ModBlocks.TIN_BLOCK.get())
                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK)).save(recipeOutput);

        stairBuilder(ModBlocks.CUT_TIN_STAIRS.get(), Ingredient.of(ModBlocks.CUT_TIN)).group("cut_tin")
                .unlockedBy("has_cut_tin",has(ModBlocks.CUT_TIN)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.CUT_TIN_SLAB.get(),ModBlocks.CUT_TIN.get());
        doorBuilder(ModBlocks.TIN_DOOR.get(), Ingredient.of(ModBlocks.CUT_TIN.get())).group("cut_tin")
                        .unlockedBy("has_cut_tin",has(ModBlocks.CUT_TIN.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.TIN_TRAPDOOR.get(), Ingredient.of(ModBlocks.CUT_TIN.get())).group("cut_tin")
                        .unlockedBy("has_cut_tin",has(ModBlocks.CUT_TIN.get())).save(recipeOutput);

        // BRONZE

        // bronze ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_ALLOY.get(), 2)
                .requires(ModItems.TIN_INGOT)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_tin", has(ModItems.TIN_INGOT.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_ALLOY.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK)
                .unlockedBy("has_bronze_block", has(ModBlocks.BRONZE_BLOCK.get())).save(recipeOutput,"bronze_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_ALLOY.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BRONZE_NUGGET.get())
                .unlockedBy("has_bronze_nugget", has(ModItems.BRONZE_NUGGET)).save(recipeOutput,"bronze_from_nugget");

        // bronze block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .unlockedBy("has_bronze", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);

        // bronze nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_NUGGET.get(), 9)
                .requires(ModItems.BRONZE_ALLOY)
                .unlockedBy("has_bronze", has(ModItems.BRONZE_ALLOY.get())).save(recipeOutput);

        // bronze armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);

        // bronze tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput,"bronze_axe_left");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput,"bronze_axe_right");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput,"bronze_hoe_right");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.BRONZE_ALLOY.get())
                .define('/', Items.STICK)
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_ALLOY)).save(recipeOutput,"bronze_hoe_left");


        // SILVER

        // silver ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK)
                .unlockedBy("has_silver_block", has(ModBlocks.SILVER_BLOCK.get())).save(recipeOutput,"silver_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_NUGGET.get())
                .unlockedBy("has_silver_nugget", has(ModItems.SILVER_NUGGET)).save(recipeOutput,"silver_from_nugget");

        // silver block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);

        // silver nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9)
                .requires(ModItems.SILVER_INGOT)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT.get())).save(recipeOutput);

        // silver armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);

        // silver tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput, "silver_axe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput, "silver_hoe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_KATANA.get())
                .pattern("  X")
                .pattern(" X ")
                .pattern("/  ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);

        oreSmelting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f,200,"silver_ingot");
        oreBlasting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f,100,"silver_ingot");

        // PLATINUM

        // platinum ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK)
                .unlockedBy("has_platinum_block", has(ModBlocks.PLATINUM_BLOCK.get())).save(recipeOutput,"platinum_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_NUGGET.get())
                .unlockedBy("has_platinum_nugget", has(ModItems.PLATINUM_NUGGET)).save(recipeOutput,"platinum_from_nugget");

        // platinum block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);

        // platinum nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get(), 9)
                .requires(ModItems.PLATINUM_INGOT)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);

        // platinum armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);

        // platinum tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput, "platinum_axe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_platinum", has(ModItems.PLATINUM_INGOT)).save(recipeOutput, "platinum_hoe_alt");

        // COBALT

        // cobalt ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 9)
                .requires(ModBlocks.COBALT_BLOCK)
                .unlockedBy("has_cobalt_block", has(ModBlocks.COBALT_BLOCK.get())).save(recipeOutput,"cobalt_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_NUGGET.get())
                .unlockedBy("has_cobalt_nugget", has(ModItems.COBALT_NUGGET)).save(recipeOutput,"cobalt_from_nugget");

        // cobalt block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBALT_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);

        // cobalt nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_NUGGET.get(), 9)
                .requires(ModItems.COBALT_INGOT)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);

        // cobalt armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);

        // cobalt tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput, "cobalt_axe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.COBALT_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput, "cobalt_hoe_alt");

        oreSmelting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f,200,"platinum_ingot");
        oreBlasting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f,100,"platinum_ingot");

        // TUNGSTEN

        // tungsten ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 9)
                .requires(ModBlocks.TUNGSTEN_BLOCK)
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTEN_BLOCK.get())).save(recipeOutput,"tungsten_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_NUGGET.get())
                .unlockedBy("has_tungsten_nugget", has(ModItems.TUNGSTEN_NUGGET)).save(recipeOutput,"tungsten_from_nugget");

        // tungsten block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTEN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);

        // tungsten nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET.get(), 9)
                .requires(ModItems.TUNGSTEN_INGOT)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);

        // tungsten armour
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);

        // tungsten tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_PICKAXE.get())
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_AXE.get())
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_AXE.get())
                .pattern("XX")
                .pattern("/X")
                .pattern("/ ")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput, "tungsten_axe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_SHOVEL.get())
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_HOE.get())
                .pattern("XX")
                .pattern("/ ")
                .pattern("/ ")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_HOE.get())
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput, "tungsten_hoe_alt");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_FLAIL.get())
                .pattern("  /")
                .pattern(" /S")
                .pattern("/ O")
                .define('/', ModItems.TUNGSTEN_INGOT.get())
                .define('O', ModItems.SPIKED_HEAVY_CORE.get())
                .define('S', Items.STRING)
                .unlockedBy("has_spiked_heavy_core", has(ModItems.SPIKED_HEAVY_CORE)).save(recipeOutput);

        // decorational
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUT_TUNGSTEN.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.TUNGSTEN_BLOCK.get())
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTEN_BLOCK)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_TUNGSTEN.get())
                .pattern("X")
                .pattern("X")
                .define('X', ModBlocks.CUT_TUNGSTEN_SLAB.get())
                .unlockedBy("has_cut_tungsten_slab", has(ModBlocks.CUT_TUNGSTEN_SLAB)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTEN_GRATE.get())
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .define('X', ModBlocks.TUNGSTEN_BLOCK.get())
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTEN_BLOCK)).save(recipeOutput);

        stairBuilder(ModBlocks.CUT_TUNGSTEN_STAIRS.get(), Ingredient.of(ModBlocks.CUT_TUNGSTEN)).group("cut_tungsten")
                .unlockedBy("has_cut_tungsten",has(ModBlocks.CUT_TUNGSTEN)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.CUT_TUNGSTEN_SLAB.get(),ModBlocks.CUT_TUNGSTEN.get());
        doorBuilder(ModBlocks.TUNGSTEN_DOOR.get(), Ingredient.of(ModBlocks.CUT_TUNGSTEN.get())).group("cut_tungsten")
                .unlockedBy("has_cut_tungsten",has(ModBlocks.CUT_TUNGSTEN.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.TUNGSTEN_TRAPDOOR.get(), Ingredient.of(ModBlocks.CUT_TUNGSTEN.get())).group("cut_tungsten")
                .unlockedBy("has_cut_tungsten",has(ModBlocks.CUT_TUNGSTEN.get())).save(recipeOutput);

        oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f,200,"tungsten_ingot");
        oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f,100,"tungsten_ingot");

        // ZIRCON

        // zircon block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCON_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZIRCON.get())
                .unlockedBy("has_zircon", has(ModItems.ZIRCON)).save(recipeOutput);

        // zircon
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCON.get(), 9)
                .requires(ModBlocks.ZIRCON_BLOCK)
                .unlockedBy("has_zircon_block", has(ModBlocks.ZIRCON_BLOCK)).save(recipeOutput);

        // WILLOW
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WILLOW_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.WILLOW_LOG.get())
                .unlockedBy("has_willow", has(ModBlocks.WILLOW_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_WILLOW_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_WILLOW_LOG.get())
                .unlockedBy("has_stripped_willow", has(ModBlocks.STRIPPED_WILLOW_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.WILLOW_LOG)
                .unlockedBy("has_willow", has(ModBlocks.WILLOW_LOG)).save(recipeOutput,"willow_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.WILLOW_WOOD)
                .unlockedBy("has_willow_wood", has(ModBlocks.WILLOW_WOOD)).save(recipeOutput,"willow_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_WILLOW_LOG)
                .unlockedBy("has_stripped_willow", has(ModBlocks.STRIPPED_WILLOW_LOG)).save(recipeOutput,"willow_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_WILLOW_WOOD)
                .unlockedBy("has_stripped_willow_wood", has(ModBlocks.STRIPPED_WILLOW_WOOD)).save(recipeOutput,"willow_planks_sw");

        stairBuilder(ModBlocks.WILLOW_STAIRS.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS)).group("willow")
                        .unlockedBy("has_willow_planks", has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.WILLOW_SLAB.get(),ModBlocks.WILLOW_PLANKS.get());

        buttonBuilder(ModBlocks.WILLOW_BUTTON.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS)).group("willow")
                .unlockedBy("has_willow_planks", has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.WILLOW_PRESSURE_PLATE.get(),ModBlocks.WILLOW_PLANKS.get());

        fenceBuilder(ModBlocks.WILLOW_FENCE.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS)).group("willow")
                .unlockedBy("has_willow_planks", has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.WILLOW_FENCE_GATE.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS)).group("willow")
                .unlockedBy("has_willow_planks", has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.WILLOW_DOOR.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS.get())).group("willow")
                .unlockedBy("has_willow_planks",has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.WILLOW_TRAPDOOR.get(), Ingredient.of(ModBlocks.WILLOW_PLANKS.get())).group("willow")
                .unlockedBy("has_willow_planks",has(ModBlocks.WILLOW_PLANKS)).save(recipeOutput);

        // HORNBEAM
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HORNBEAM_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.HORNBEAM_LOG.get())
                .unlockedBy("has_hornbeam", has(ModBlocks.HORNBEAM_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_HORNBEAM_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_HORNBEAM_LOG.get())
                .unlockedBy("has_stripped_hornbeam", has(ModBlocks.STRIPPED_HORNBEAM_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.HORNBEAM_PLANKS.get(), 4)
                .requires(ModBlocks.HORNBEAM_LOG)
                .unlockedBy("has_hornbeam", has(ModBlocks.HORNBEAM_LOG)).save(recipeOutput,"hornbeam_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.HORNBEAM_PLANKS.get(), 4)
                .requires(ModBlocks.HORNBEAM_WOOD)
                .unlockedBy("has_hornbeam_wood", has(ModBlocks.HORNBEAM_WOOD)).save(recipeOutput,"hornbeam_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.HORNBEAM_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_HORNBEAM_LOG)
                .unlockedBy("has_stripped_hornbeam", has(ModBlocks.STRIPPED_HORNBEAM_LOG)).save(recipeOutput,"hornbeam_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.HORNBEAM_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_HORNBEAM_WOOD)
                .unlockedBy("has_stripped_hornbeam_wood", has(ModBlocks.STRIPPED_HORNBEAM_WOOD)).save(recipeOutput,"hornbeam_planks_sw");

        stairBuilder(ModBlocks.HORNBEAM_STAIRS.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS)).group("hornbeam")
                .unlockedBy("has_hornbeam_planks", has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.HORNBEAM_SLAB.get(),ModBlocks.HORNBEAM_PLANKS.get());

        buttonBuilder(ModBlocks.HORNBEAM_BUTTON.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS)).group("hornbeam")
                .unlockedBy("has_hornbeam_planks", has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.HORNBEAM_PRESSURE_PLATE.get(),ModBlocks.HORNBEAM_PLANKS.get());

        fenceBuilder(ModBlocks.HORNBEAM_FENCE.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS)).group("hornbeam")
                .unlockedBy("has_hornbeam_planks", has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.HORNBEAM_FENCE_GATE.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS)).group("hornbeam")
                .unlockedBy("has_hornbeam_planks", has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.HORNBEAM_DOOR.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS.get())).group("hornbeam")
                .unlockedBy("has_hornbeam_planks",has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.HORNBEAM_TRAPDOOR.get(), Ingredient.of(ModBlocks.HORNBEAM_PLANKS.get())).group("hornbeam")
                .unlockedBy("has_hornbeam_planks",has(ModBlocks.HORNBEAM_PLANKS)).save(recipeOutput);

        // LINDEN
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINDEN_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.LINDEN_LOG.get())
                .unlockedBy("has_linden", has(ModBlocks.LINDEN_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_LINDEN_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_LINDEN_LOG.get())
                .unlockedBy("has_stripped_linden", has(ModBlocks.STRIPPED_LINDEN_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LINDEN_PLANKS.get(), 4)
                .requires(ModBlocks.LINDEN_LOG)
                .unlockedBy("has_linden", has(ModBlocks.LINDEN_LOG)).save(recipeOutput,"linden_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LINDEN_PLANKS.get(), 4)
                .requires(ModBlocks.LINDEN_WOOD)
                .unlockedBy("has_linden_wood", has(ModBlocks.LINDEN_WOOD)).save(recipeOutput,"linden_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LINDEN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_LINDEN_LOG)
                .unlockedBy("has_stripped_linden", has(ModBlocks.STRIPPED_LINDEN_LOG)).save(recipeOutput,"linden_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LINDEN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_LINDEN_WOOD)
                .unlockedBy("has_stripped_linden_wood", has(ModBlocks.STRIPPED_LINDEN_WOOD)).save(recipeOutput,"linden_planks_sw");

        stairBuilder(ModBlocks.LINDEN_STAIRS.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS)).group("linden")
                .unlockedBy("has_linden_planks", has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.LINDEN_SLAB.get(),ModBlocks.LINDEN_PLANKS.get());

        buttonBuilder(ModBlocks.LINDEN_BUTTON.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS)).group("linden")
                .unlockedBy("has_linden_planks", has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.LINDEN_PRESSURE_PLATE.get(),ModBlocks.LINDEN_PLANKS.get());

        fenceBuilder(ModBlocks.LINDEN_FENCE.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS)).group("linden")
                .unlockedBy("has_linden_planks", has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.LINDEN_FENCE_GATE.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS)).group("linden")
                .unlockedBy("has_linden_planks", has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.LINDEN_DOOR.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS.get())).group("linden")
                .unlockedBy("has_linden_planks",has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.LINDEN_TRAPDOOR.get(), Ingredient.of(ModBlocks.LINDEN_PLANKS.get())).group("linden")
                .unlockedBy("has_linden_planks",has(ModBlocks.LINDEN_PLANKS)).save(recipeOutput);
        
        // GINKGO
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GINKGO_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.GINKGO_LOG.get())
                .unlockedBy("has_ginkgo", has(ModBlocks.GINKGO_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_GINKGO_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_GINKGO_LOG.get())
                .unlockedBy("has_stripped_ginkgo", has(ModBlocks.STRIPPED_GINKGO_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GINKGO_PLANKS.get(), 4)
                .requires(ModBlocks.GINKGO_LOG)
                .unlockedBy("has_ginkgo", has(ModBlocks.GINKGO_LOG)).save(recipeOutput,"ginkgo_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GINKGO_PLANKS.get(), 4)
                .requires(ModBlocks.GINKGO_WOOD)
                .unlockedBy("has_ginkgo_wood", has(ModBlocks.GINKGO_WOOD)).save(recipeOutput,"ginkgo_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GINKGO_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_GINKGO_LOG)
                .unlockedBy("has_stripped_ginkgo", has(ModBlocks.STRIPPED_GINKGO_LOG)).save(recipeOutput,"ginkgo_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GINKGO_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_GINKGO_WOOD)
                .unlockedBy("has_stripped_ginkgo_wood", has(ModBlocks.STRIPPED_GINKGO_WOOD)).save(recipeOutput,"ginkgo_planks_sw");

        stairBuilder(ModBlocks.GINKGO_STAIRS.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS)).group("ginkgo")
                .unlockedBy("has_ginkgo_planks", has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.GINKGO_SLAB.get(),ModBlocks.GINKGO_PLANKS.get());

        buttonBuilder(ModBlocks.GINKGO_BUTTON.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS)).group("ginkgo")
                .unlockedBy("has_ginkgo_planks", has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.GINKGO_PRESSURE_PLATE.get(),ModBlocks.GINKGO_PLANKS.get());

        fenceBuilder(ModBlocks.GINKGO_FENCE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS)).group("ginkgo")
                .unlockedBy("has_ginkgo_planks", has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.GINKGO_FENCE_GATE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS)).group("ginkgo")
                .unlockedBy("has_ginkgo_planks", has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.GINKGO_DOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get())).group("ginkgo")
                .unlockedBy("has_ginkgo_planks",has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.GINKGO_TRAPDOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get())).group("ginkgo")
                .unlockedBy("has_ginkgo_planks",has(ModBlocks.GINKGO_PLANKS)).save(recipeOutput);

        // POPLAR
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POPLAR_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.POPLAR_LOG.get())
                .unlockedBy("has_poplar", has(ModBlocks.POPLAR_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_POPLAR_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_POPLAR_LOG.get())
                .unlockedBy("has_stripped_poplar", has(ModBlocks.STRIPPED_POPLAR_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POPLAR_PLANKS.get(), 4)
                .requires(ModBlocks.POPLAR_LOG)
                .unlockedBy("has_poplar", has(ModBlocks.POPLAR_LOG)).save(recipeOutput,"poplar_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POPLAR_PLANKS.get(), 4)
                .requires(ModBlocks.POPLAR_WOOD)
                .unlockedBy("has_poplar_wood", has(ModBlocks.POPLAR_WOOD)).save(recipeOutput,"poplar_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POPLAR_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_POPLAR_LOG)
                .unlockedBy("has_stripped_poplar", has(ModBlocks.STRIPPED_POPLAR_LOG)).save(recipeOutput,"poplar_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POPLAR_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_POPLAR_WOOD)
                .unlockedBy("has_stripped_poplar_wood", has(ModBlocks.STRIPPED_POPLAR_WOOD)).save(recipeOutput,"poplar_planks_sw");

        stairBuilder(ModBlocks.POPLAR_STAIRS.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS)).group("poplar")
                .unlockedBy("has_poplar_planks", has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.POPLAR_SLAB.get(),ModBlocks.POPLAR_PLANKS.get());

        buttonBuilder(ModBlocks.POPLAR_BUTTON.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS)).group("poplar")
                .unlockedBy("has_poplar_planks", has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.POPLAR_PRESSURE_PLATE.get(),ModBlocks.POPLAR_PLANKS.get());

        fenceBuilder(ModBlocks.POPLAR_FENCE.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS)).group("poplar")
                .unlockedBy("has_poplar_planks", has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.POPLAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS)).group("poplar")
                .unlockedBy("has_poplar_planks", has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.POPLAR_DOOR.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get())).group("poplar")
                .unlockedBy("has_poplar_planks",has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.POPLAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get())).group("poplar")
                .unlockedBy("has_poplar_planks",has(ModBlocks.POPLAR_PLANKS)).save(recipeOutput);
        
        // MAPLE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.MAPLE_LOG.get())
                .unlockedBy("has_maple", has(ModBlocks.MAPLE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_MAPLE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_MAPLE_LOG.get())
                .unlockedBy("has_stripped_maple", has(ModBlocks.STRIPPED_MAPLE_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4)
                .requires(ModBlocks.MAPLE_LOG)
                .unlockedBy("has_maple", has(ModBlocks.MAPLE_LOG)).save(recipeOutput,"maple_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4)
                .requires(ModBlocks.MAPLE_WOOD)
                .unlockedBy("has_maple_wood", has(ModBlocks.MAPLE_WOOD)).save(recipeOutput,"maple_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_MAPLE_LOG)
                .unlockedBy("has_stripped_maple", has(ModBlocks.STRIPPED_MAPLE_LOG)).save(recipeOutput,"maple_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_MAPLE_WOOD)
                .unlockedBy("has_stripped_maple_wood", has(ModBlocks.STRIPPED_MAPLE_WOOD)).save(recipeOutput,"maple_planks_sw");

        stairBuilder(ModBlocks.MAPLE_STAIRS.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS)).group("maple")
                .unlockedBy("has_maple_planks", has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.MAPLE_SLAB.get(),ModBlocks.MAPLE_PLANKS.get());

        buttonBuilder(ModBlocks.MAPLE_BUTTON.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS)).group("maple")
                .unlockedBy("has_maple_planks", has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.MAPLE_PRESSURE_PLATE.get(),ModBlocks.MAPLE_PLANKS.get());

        fenceBuilder(ModBlocks.MAPLE_FENCE.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS)).group("maple")
                .unlockedBy("has_maple_planks", has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.MAPLE_FENCE_GATE.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS)).group("maple")
                .unlockedBy("has_maple_planks", has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.MAPLE_DOOR.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS.get())).group("maple")
                .unlockedBy("has_maple_planks",has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.MAPLE_TRAPDOOR.get(), Ingredient.of(ModBlocks.MAPLE_PLANKS.get())).group("maple")
                .unlockedBy("has_maple_planks",has(ModBlocks.MAPLE_PLANKS)).save(recipeOutput);

        // BAOBAB
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAOBAB_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.BAOBAB_LOG.get())
                .unlockedBy("has_baobab", has(ModBlocks.BAOBAB_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BAOBAB_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_BAOBAB_LOG.get())
                .unlockedBy("has_stripped_baobab", has(ModBlocks.STRIPPED_BAOBAB_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BAOBAB_PLANKS.get(), 4)
                .requires(ModBlocks.BAOBAB_LOG)
                .unlockedBy("has_baobab", has(ModBlocks.BAOBAB_LOG)).save(recipeOutput,"baobab_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BAOBAB_PLANKS.get(), 4)
                .requires(ModBlocks.BAOBAB_WOOD)
                .unlockedBy("has_baobab_wood", has(ModBlocks.BAOBAB_WOOD)).save(recipeOutput,"baobab_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BAOBAB_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_BAOBAB_LOG)
                .unlockedBy("has_stripped_baobab", has(ModBlocks.STRIPPED_BAOBAB_LOG)).save(recipeOutput,"baobab_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BAOBAB_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_BAOBAB_WOOD)
                .unlockedBy("has_stripped_baobab_wood", has(ModBlocks.STRIPPED_BAOBAB_WOOD)).save(recipeOutput,"baobab_planks_sw");

        stairBuilder(ModBlocks.BAOBAB_STAIRS.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS)).group("baobab")
                .unlockedBy("has_baobab_planks", has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.BAOBAB_SLAB.get(),ModBlocks.BAOBAB_PLANKS.get());

        buttonBuilder(ModBlocks.BAOBAB_BUTTON.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS)).group("baobab")
                .unlockedBy("has_baobab_planks", has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BAOBAB_PRESSURE_PLATE.get(),ModBlocks.BAOBAB_PLANKS.get());

        fenceBuilder(ModBlocks.BAOBAB_FENCE.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS)).group("baobab")
                .unlockedBy("has_baobab_planks", has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BAOBAB_FENCE_GATE.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS)).group("baobab")
                .unlockedBy("has_baobab_planks", has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.BAOBAB_DOOR.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS.get())).group("baobab")
                .unlockedBy("has_baobab_planks",has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BAOBAB_TRAPDOOR.get(), Ingredient.of(ModBlocks.BAOBAB_PLANKS.get())).group("baobab")
                .unlockedBy("has_baobab_planks",has(ModBlocks.BAOBAB_PLANKS)).save(recipeOutput);

        // PALM
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALM_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.PALM_LOG.get())
                .unlockedBy("has_palm", has(ModBlocks.PALM_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_PALM_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_PALM_LOG.get())
                .unlockedBy("has_stripped_palm", has(ModBlocks.STRIPPED_PALM_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALM_PLANKS.get(), 4)
                .requires(ModBlocks.PALM_LOG)
                .unlockedBy("has_palm", has(ModBlocks.PALM_LOG)).save(recipeOutput,"palm_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALM_PLANKS.get(), 4)
                .requires(ModBlocks.PALM_WOOD)
                .unlockedBy("has_palm_wood", has(ModBlocks.PALM_WOOD)).save(recipeOutput,"palm_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALM_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PALM_LOG)
                .unlockedBy("has_stripped_palm", has(ModBlocks.STRIPPED_PALM_LOG)).save(recipeOutput,"palm_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PALM_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PALM_WOOD)
                .unlockedBy("has_stripped_palm_wood", has(ModBlocks.STRIPPED_PALM_WOOD)).save(recipeOutput,"palm_planks_sw");

        stairBuilder(ModBlocks.PALM_STAIRS.get(), Ingredient.of(ModBlocks.PALM_PLANKS)).group("palm")
                .unlockedBy("has_palm_planks", has(ModBlocks.PALM_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.PALM_SLAB.get(),ModBlocks.PALM_PLANKS.get());

        buttonBuilder(ModBlocks.PALM_BUTTON.get(), Ingredient.of(ModBlocks.PALM_PLANKS)).group("palm")
                .unlockedBy("has_palm_planks", has(ModBlocks.PALM_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.PALM_PRESSURE_PLATE.get(),ModBlocks.PALM_PLANKS.get());

        fenceBuilder(ModBlocks.PALM_FENCE.get(), Ingredient.of(ModBlocks.PALM_PLANKS)).group("palm")
                .unlockedBy("has_palm_planks", has(ModBlocks.PALM_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.PALM_FENCE_GATE.get(), Ingredient.of(ModBlocks.PALM_PLANKS)).group("palm")
                .unlockedBy("has_palm_planks", has(ModBlocks.PALM_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.PALM_DOOR.get(), Ingredient.of(ModBlocks.PALM_PLANKS.get())).group("palm")
                .unlockedBy("has_palm_planks",has(ModBlocks.PALM_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.PALM_TRAPDOOR.get(), Ingredient.of(ModBlocks.PALM_PLANKS.get())).group("palm")
                .unlockedBy("has_palm_planks",has(ModBlocks.PALM_PLANKS)).save(recipeOutput);

        // ASPEN
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASPEN_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.ASPEN_LOG.get())
                .unlockedBy("has_aspen", has(ModBlocks.ASPEN_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ASPEN_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_ASPEN_LOG.get())
                .unlockedBy("has_stripped_aspen", has(ModBlocks.STRIPPED_ASPEN_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS.get(), 4)
                .requires(ModBlocks.ASPEN_LOG)
                .unlockedBy("has_aspen", has(ModBlocks.ASPEN_LOG)).save(recipeOutput,"aspen_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS.get(), 4)
                .requires(ModBlocks.ASPEN_WOOD)
                .unlockedBy("has_aspen_wood", has(ModBlocks.ASPEN_WOOD)).save(recipeOutput,"aspen_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_ASPEN_LOG)
                .unlockedBy("has_stripped_aspen", has(ModBlocks.STRIPPED_ASPEN_LOG)).save(recipeOutput,"aspen_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_ASPEN_WOOD)
                .unlockedBy("has_stripped_aspen_wood", has(ModBlocks.STRIPPED_ASPEN_WOOD)).save(recipeOutput,"aspen_planks_sw");

        stairBuilder(ModBlocks.ASPEN_STAIRS.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen")
                .unlockedBy("has_aspen_planks", has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.ASPEN_SLAB.get(),ModBlocks.ASPEN_PLANKS.get());

        buttonBuilder(ModBlocks.ASPEN_BUTTON.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen")
                .unlockedBy("has_aspen_planks", has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.ASPEN_PRESSURE_PLATE.get(),ModBlocks.ASPEN_PLANKS.get());

        fenceBuilder(ModBlocks.ASPEN_FENCE.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen")
                .unlockedBy("has_aspen_planks", has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ASPEN_FENCE_GATE.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen")
                .unlockedBy("has_aspen_planks", has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.ASPEN_DOOR.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS.get())).group("aspen")
                .unlockedBy("has_aspen_planks",has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.ASPEN_TRAPDOOR.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS.get())).group("aspen")
                .unlockedBy("has_aspen_planks",has(ModBlocks.ASPEN_PLANKS)).save(recipeOutput);

        // ASH
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASH_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.ASH_LOG.get())
                .unlockedBy("has_ash", has(ModBlocks.ASH_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ASH_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_ASH_LOG.get())
                .unlockedBy("has_stripped_ash", has(ModBlocks.STRIPPED_ASH_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASH_PLANKS.get(), 4)
                .requires(ModBlocks.ASH_LOG)
                .unlockedBy("has_ash", has(ModBlocks.ASH_LOG)).save(recipeOutput,"ash_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASH_PLANKS.get(), 4)
                .requires(ModBlocks.ASH_WOOD)
                .unlockedBy("has_ash_wood", has(ModBlocks.ASH_WOOD)).save(recipeOutput,"ash_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_ASH_LOG)
                .unlockedBy("has_stripped_ash", has(ModBlocks.STRIPPED_ASH_LOG)).save(recipeOutput,"ash_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ASH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_ASH_WOOD)
                .unlockedBy("has_stripped_ash_wood", has(ModBlocks.STRIPPED_ASH_WOOD)).save(recipeOutput,"ash_planks_sw");

        stairBuilder(ModBlocks.ASH_STAIRS.get(), Ingredient.of(ModBlocks.ASH_PLANKS)).group("ash")
                .unlockedBy("has_ash_planks", has(ModBlocks.ASH_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.ASH_SLAB.get(),ModBlocks.ASH_PLANKS.get());

        buttonBuilder(ModBlocks.ASH_BUTTON.get(), Ingredient.of(ModBlocks.ASH_PLANKS)).group("ash")
                .unlockedBy("has_ash_planks", has(ModBlocks.ASH_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.ASH_PRESSURE_PLATE.get(),ModBlocks.ASH_PLANKS.get());

        fenceBuilder(ModBlocks.ASH_FENCE.get(), Ingredient.of(ModBlocks.ASH_PLANKS)).group("ash")
                .unlockedBy("has_ash_planks", has(ModBlocks.ASH_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ASH_FENCE_GATE.get(), Ingredient.of(ModBlocks.ASH_PLANKS)).group("ash")
                .unlockedBy("has_ash_planks", has(ModBlocks.ASH_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.ASH_DOOR.get(), Ingredient.of(ModBlocks.ASH_PLANKS.get())).group("ash")
                .unlockedBy("has_ash_planks",has(ModBlocks.ASH_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.ASH_TRAPDOOR.get(), Ingredient.of(ModBlocks.ASH_PLANKS.get())).group("ash")
                .unlockedBy("has_ash_planks",has(ModBlocks.ASH_PLANKS)).save(recipeOutput);

        // BEECH
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BEECH_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.BEECH_LOG.get())
                .unlockedBy("has_beech", has(ModBlocks.BEECH_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BEECH_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_BEECH_LOG.get())
                .unlockedBy("has_stripped_beech", has(ModBlocks.STRIPPED_BEECH_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BEECH_PLANKS.get(), 4)
                .requires(ModBlocks.BEECH_LOG)
                .unlockedBy("has_beech", has(ModBlocks.BEECH_LOG)).save(recipeOutput,"beech_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BEECH_PLANKS.get(), 4)
                .requires(ModBlocks.BEECH_WOOD)
                .unlockedBy("has_beech_wood", has(ModBlocks.BEECH_WOOD)).save(recipeOutput,"beech_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BEECH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_BEECH_LOG)
                .unlockedBy("has_stripped_beech", has(ModBlocks.STRIPPED_BEECH_LOG)).save(recipeOutput,"beech_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BEECH_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_BEECH_WOOD)
                .unlockedBy("has_stripped_beech_wood", has(ModBlocks.STRIPPED_BEECH_WOOD)).save(recipeOutput,"beech_planks_sw");

        stairBuilder(ModBlocks.BEECH_STAIRS.get(), Ingredient.of(ModBlocks.BEECH_PLANKS)).group("beech")
                .unlockedBy("has_beech_planks", has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.BEECH_SLAB.get(),ModBlocks.BEECH_PLANKS.get());

        buttonBuilder(ModBlocks.BEECH_BUTTON.get(), Ingredient.of(ModBlocks.BEECH_PLANKS)).group("beech")
                .unlockedBy("has_beech_planks", has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BEECH_PRESSURE_PLATE.get(),ModBlocks.BEECH_PLANKS.get());

        fenceBuilder(ModBlocks.BEECH_FENCE.get(), Ingredient.of(ModBlocks.BEECH_PLANKS)).group("beech")
                .unlockedBy("has_beech_planks", has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BEECH_FENCE_GATE.get(), Ingredient.of(ModBlocks.BEECH_PLANKS)).group("beech")
                .unlockedBy("has_beech_planks", has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.BEECH_DOOR.get(), Ingredient.of(ModBlocks.BEECH_PLANKS.get())).group("beech")
                .unlockedBy("has_beech_planks",has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BEECH_TRAPDOOR.get(), Ingredient.of(ModBlocks.BEECH_PLANKS.get())).group("beech")
                .unlockedBy("has_beech_planks",has(ModBlocks.BEECH_PLANKS)).save(recipeOutput);

        // EUCALYPTUS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EUCALYPTUS_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.EUCALYPTUS_LOG.get())
                .unlockedBy("has_eucalyptus", has(ModBlocks.EUCALYPTUS_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_EUCALYPTUS_LOG.get())
                .unlockedBy("has_stripped_eucalyptus", has(ModBlocks.STRIPPED_EUCALYPTUS_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EUCALYPTUS_PLANKS.get(), 4)
                .requires(ModBlocks.EUCALYPTUS_LOG)
                .unlockedBy("has_eucalyptus", has(ModBlocks.EUCALYPTUS_LOG)).save(recipeOutput,"eucalyptus_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EUCALYPTUS_PLANKS.get(), 4)
                .requires(ModBlocks.EUCALYPTUS_WOOD)
                .unlockedBy("has_eucalyptus_wood", has(ModBlocks.EUCALYPTUS_WOOD)).save(recipeOutput,"eucalyptus_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EUCALYPTUS_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_EUCALYPTUS_LOG)
                .unlockedBy("has_stripped_eucalyptus", has(ModBlocks.STRIPPED_EUCALYPTUS_LOG)).save(recipeOutput,"eucalyptus_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EUCALYPTUS_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_EUCALYPTUS_WOOD)
                .unlockedBy("has_stripped_eucalyptus_wood", has(ModBlocks.STRIPPED_EUCALYPTUS_WOOD)).save(recipeOutput,"eucalyptus_planks_sw");

        stairBuilder(ModBlocks.EUCALYPTUS_STAIRS.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS)).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks", has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.EUCALYPTUS_SLAB.get(),ModBlocks.EUCALYPTUS_PLANKS.get());

        buttonBuilder(ModBlocks.EUCALYPTUS_BUTTON.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS)).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks", has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(),ModBlocks.EUCALYPTUS_PLANKS.get());

        fenceBuilder(ModBlocks.EUCALYPTUS_FENCE.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS)).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks", has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS)).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks", has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.EUCALYPTUS_DOOR.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get())).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks",has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get())).group("eucalyptus")
                .unlockedBy("has_eucalyptus_planks",has(ModBlocks.EUCALYPTUS_PLANKS)).save(recipeOutput);

        // SYCAMORE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SYCAMORE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.SYCAMORE_LOG.get())
                .unlockedBy("has_sycamore", has(ModBlocks.SYCAMORE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_SYCAMORE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_SYCAMORE_LOG.get())
                .unlockedBy("has_stripped_sycamore", has(ModBlocks.STRIPPED_SYCAMORE_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SYCAMORE_PLANKS.get(), 4)
                .requires(ModBlocks.SYCAMORE_LOG)
                .unlockedBy("has_sycamore", has(ModBlocks.SYCAMORE_LOG)).save(recipeOutput,"sycamore_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SYCAMORE_PLANKS.get(), 4)
                .requires(ModBlocks.SYCAMORE_WOOD)
                .unlockedBy("has_sycamore_wood", has(ModBlocks.SYCAMORE_WOOD)).save(recipeOutput,"sycamore_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SYCAMORE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_SYCAMORE_LOG)
                .unlockedBy("has_stripped_sycamore", has(ModBlocks.STRIPPED_SYCAMORE_LOG)).save(recipeOutput,"sycamore_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SYCAMORE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_SYCAMORE_WOOD)
                .unlockedBy("has_stripped_sycamore_wood", has(ModBlocks.STRIPPED_SYCAMORE_WOOD)).save(recipeOutput,"sycamore_planks_sw");

        stairBuilder(ModBlocks.SYCAMORE_STAIRS.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS)).group("sycamore")
                .unlockedBy("has_sycamore_planks", has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.SYCAMORE_SLAB.get(),ModBlocks.SYCAMORE_PLANKS.get());

        buttonBuilder(ModBlocks.SYCAMORE_BUTTON.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS)).group("sycamore")
                .unlockedBy("has_sycamore_planks", has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.SYCAMORE_PRESSURE_PLATE.get(),ModBlocks.SYCAMORE_PLANKS.get());

        fenceBuilder(ModBlocks.SYCAMORE_FENCE.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS)).group("sycamore")
                .unlockedBy("has_sycamore_planks", has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SYCAMORE_FENCE_GATE.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS)).group("sycamore")
                .unlockedBy("has_sycamore_planks", has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.SYCAMORE_DOOR.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS.get())).group("sycamore")
                .unlockedBy("has_sycamore_planks",has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SYCAMORE_TRAPDOOR.get(), Ingredient.of(ModBlocks.SYCAMORE_PLANKS.get())).group("sycamore")
                .unlockedBy("has_sycamore_planks",has(ModBlocks.SYCAMORE_PLANKS)).save(recipeOutput);

        // REDWOOD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDWOOD_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.REDWOOD_LOG.get())
                .unlockedBy("has_redwood", has(ModBlocks.REDWOOD_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_REDWOOD_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_REDWOOD_LOG.get())
                .unlockedBy("has_stripped_redwood", has(ModBlocks.STRIPPED_REDWOOD_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.REDWOOD_PLANKS.get(), 4)
                .requires(ModBlocks.REDWOOD_LOG)
                .unlockedBy("has_redwood", has(ModBlocks.REDWOOD_LOG)).save(recipeOutput,"redwood_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.REDWOOD_PLANKS.get(), 4)
                .requires(ModBlocks.REDWOOD_WOOD)
                .unlockedBy("has_redwood_wood", has(ModBlocks.REDWOOD_WOOD)).save(recipeOutput,"redwood_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.REDWOOD_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_REDWOOD_LOG)
                .unlockedBy("has_stripped_redwood", has(ModBlocks.STRIPPED_REDWOOD_LOG)).save(recipeOutput,"redwood_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.REDWOOD_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_REDWOOD_WOOD)
                .unlockedBy("has_stripped_redwood_wood", has(ModBlocks.STRIPPED_REDWOOD_WOOD)).save(recipeOutput,"redwood_planks_sw");

        stairBuilder(ModBlocks.REDWOOD_STAIRS.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS)).group("redwood")
                .unlockedBy("has_redwood_planks", has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.REDWOOD_SLAB.get(),ModBlocks.REDWOOD_PLANKS.get());

        buttonBuilder(ModBlocks.REDWOOD_BUTTON.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS)).group("redwood")
                .unlockedBy("has_redwood_planks", has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.REDWOOD_PRESSURE_PLATE.get(),ModBlocks.REDWOOD_PLANKS.get());

        fenceBuilder(ModBlocks.REDWOOD_FENCE.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS)).group("redwood")
                .unlockedBy("has_redwood_planks", has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.REDWOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS)).group("redwood")
                .unlockedBy("has_redwood_planks", has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.REDWOOD_DOOR.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS.get())).group("redwood")
                .unlockedBy("has_redwood_planks",has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.REDWOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.REDWOOD_PLANKS.get())).group("redwood")
                .unlockedBy("has_redwood_planks",has(ModBlocks.REDWOOD_PLANKS)).save(recipeOutput);

        // MONKEY_PUZZLE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MONKEY_PUZZLE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.MONKEY_PUZZLE_LOG.get())
                .unlockedBy("has_monkey_puzzle", has(ModBlocks.MONKEY_PUZZLE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG.get())
                .unlockedBy("has_stripped_monkey_puzzle", has(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MONKEY_PUZZLE_PLANKS.get(), 4)
                .requires(ModBlocks.MONKEY_PUZZLE_LOG)
                .unlockedBy("has_monkey_puzzle", has(ModBlocks.MONKEY_PUZZLE_LOG)).save(recipeOutput,"monkey_puzzle_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MONKEY_PUZZLE_PLANKS.get(), 4)
                .requires(ModBlocks.MONKEY_PUZZLE_WOOD)
                .unlockedBy("has_monkey_puzzle_wood", has(ModBlocks.MONKEY_PUZZLE_WOOD)).save(recipeOutput,"monkey_puzzle_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MONKEY_PUZZLE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG)
                .unlockedBy("has_stripped_monkey_puzzle", has(ModBlocks.STRIPPED_MONKEY_PUZZLE_LOG)).save(recipeOutput,"monkey_puzzle_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MONKEY_PUZZLE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD)
                .unlockedBy("has_stripped_monkey_puzzle_wood", has(ModBlocks.STRIPPED_MONKEY_PUZZLE_WOOD)).save(recipeOutput,"monkey_puzzle_planks_sw");

        stairBuilder(ModBlocks.MONKEY_PUZZLE_STAIRS.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS)).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks", has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.MONKEY_PUZZLE_SLAB.get(),ModBlocks.MONKEY_PUZZLE_PLANKS.get());

        buttonBuilder(ModBlocks.MONKEY_PUZZLE_BUTTON.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS)).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks", has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.MONKEY_PUZZLE_PRESSURE_PLATE.get(),ModBlocks.MONKEY_PUZZLE_PLANKS.get());

        fenceBuilder(ModBlocks.MONKEY_PUZZLE_FENCE.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS)).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks", has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.MONKEY_PUZZLE_FENCE_GATE.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS)).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks", has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.MONKEY_PUZZLE_DOOR.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS.get())).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks",has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.MONKEY_PUZZLE_TRAPDOOR.get(), Ingredient.of(ModBlocks.MONKEY_PUZZLE_PLANKS.get())).group("monkey_puzzle")
                .unlockedBy("has_monkey_puzzle_planks",has(ModBlocks.MONKEY_PUZZLE_PLANKS)).save(recipeOutput);

        // YEW
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YEW_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.YEW_LOG.get())
                .unlockedBy("has_yew", has(ModBlocks.YEW_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_YEW_WOOD.get(),3)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModBlocks.STRIPPED_YEW_LOG.get())
                .unlockedBy("has_stripped_yew", has(ModBlocks.STRIPPED_YEW_LOG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YEW_PLANKS.get(), 4)
                .requires(ModBlocks.YEW_LOG)
                .unlockedBy("has_yew", has(ModBlocks.YEW_LOG)).save(recipeOutput,"yew_planks_l");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YEW_PLANKS.get(), 4)
                .requires(ModBlocks.YEW_WOOD)
                .unlockedBy("has_yew_wood", has(ModBlocks.YEW_WOOD)).save(recipeOutput,"yew_planks_sl");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YEW_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_YEW_LOG)
                .unlockedBy("has_stripped_yew", has(ModBlocks.STRIPPED_YEW_LOG)).save(recipeOutput,"yew_planks_w");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YEW_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_YEW_WOOD)
                .unlockedBy("has_stripped_yew_wood", has(ModBlocks.STRIPPED_YEW_WOOD)).save(recipeOutput,"yew_planks_sw");

        stairBuilder(ModBlocks.YEW_STAIRS.get(), Ingredient.of(ModBlocks.YEW_PLANKS)).group("yew")
                .unlockedBy("has_yew_planks", has(ModBlocks.YEW_PLANKS)).save(recipeOutput);
        slab(recipeOutput,RecipeCategory.MISC,ModBlocks.YEW_SLAB.get(),ModBlocks.YEW_PLANKS.get());

        buttonBuilder(ModBlocks.YEW_BUTTON.get(), Ingredient.of(ModBlocks.YEW_PLANKS)).group("yew")
                .unlockedBy("has_yew_planks", has(ModBlocks.YEW_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.YEW_PRESSURE_PLATE.get(),ModBlocks.YEW_PLANKS.get());

        fenceBuilder(ModBlocks.YEW_FENCE.get(), Ingredient.of(ModBlocks.YEW_PLANKS)).group("yew")
                .unlockedBy("has_yew_planks", has(ModBlocks.YEW_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.YEW_FENCE_GATE.get(), Ingredient.of(ModBlocks.YEW_PLANKS)).group("yew")
                .unlockedBy("has_yew_planks", has(ModBlocks.YEW_PLANKS)).save(recipeOutput);

        doorBuilder(ModBlocks.YEW_DOOR.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get())).group("yew")
                .unlockedBy("has_yew_planks",has(ModBlocks.YEW_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.YEW_TRAPDOOR.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get())).group("yew")
                .unlockedBy("has_yew_planks",has(ModBlocks.YEW_PLANKS)).save(recipeOutput);
        
        // misc
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.HEAVY_CORE)
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_SHARD)
                .pattern(" X")
                .pattern("X ")
                .define('X', Items.OBSIDIAN)
                .unlockedBy("has_obsidian", has(Items.OBSIDIAN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPIKED_HEAVY_CORE)
                .pattern(" X ")
                .pattern("XOX")
                .pattern(" X ")
                .define('X', ModItems.OBSIDIAN_SHARD)
                .define('O', Blocks.HEAVY_CORE)
                .unlockedBy("has_obsidian", has(Items.OBSIDIAN)).save(recipeOutput);




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
