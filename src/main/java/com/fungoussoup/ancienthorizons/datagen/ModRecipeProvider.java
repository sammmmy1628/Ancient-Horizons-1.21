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

        // bronze tools
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
