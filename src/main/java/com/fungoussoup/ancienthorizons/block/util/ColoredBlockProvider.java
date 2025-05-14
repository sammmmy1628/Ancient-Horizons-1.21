package com.fungoussoup.ancienthorizons.block.util;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static com.fungoussoup.ancienthorizons.registry.ModBlocks.registerBlock;

public class ColoredBlockProvider {
    public static class v1 {
        public static class Normal {
            public static DeferredBlock<Block>[] provideColoredTypes(Color[] withColors, String textureName,
                                                                  Supplier<Block> block,
                                                                  int stacksTo) {
                List<DeferredBlock<Block>> blocks = new ArrayList<>();

                for (Color color : withColors) {
                    String name = color != null ? color.getPrefix() + textureName : textureName;
                    DeferredBlock<Block> blockEntry = registerBlock(name, block);
                    blocks.add(blockEntry);
                }

                @SuppressWarnings("unchecked")
                DeferredBlock<Block>[] result = blocks.toArray(new DeferredBlock[0]);
                return result;
            }
        }

        public static class Multi {
            public static DeferredBlock<Block>[] provideColoredTypes(Color[] withColors, String textureName,
                                                                  Supplier<Block>[] iBlocks,
                                                                  int stacksTo) {
                List<DeferredBlock<Block>> blocks = new ArrayList<>();

                for (int i = 0; i < withColors.length; i++) {
                    Color color = withColors[i];
                    Supplier<Block> block = iBlocks[i];

                    String name = color != null ? color.getPrefix() + textureName : textureName;
                    DeferredBlock<Block> blockEntry = registerBlock(name, block);
                    blocks.add(blockEntry);
                }

                @SuppressWarnings("unchecked") DeferredBlock<Block>[] result = blocks.toArray(new DeferredBlock[0]);
                return result;
            }
        }
    }

    public static class v2 {
        public static class Advanced {
            public static DeferredBlock<Block>[] provide(ColoredBlock[] blocks, int stacksTo) {
                List<DeferredBlock<Block>> nres = new ArrayList<>();
                for (ColoredBlock b : blocks) nres.add(registerBlock(b.NAME, (Supplier<Block>) b));

                @SuppressWarnings("unchecked") DeferredBlock<Block>[] res = nres.toArray(new DeferredBlock[0]);
                return res;
            }
        }

        public static class ColoredBlock extends Block {
            public final String NAME;

            public ColoredBlock(Properties properties, String name) {
                super(properties);
                this.NAME = name;
            }
        }
    }

    public enum Color {
        DEFAULT(""),
        WHITE("white_"),
        LIGHT_GRAY("light_gray_"),
        GRAY("gray_"),
        BLACK("black_"),
        BROWN("brown_"),
        RED("red_"),
        ORANGE("orange_"),
        YELLOW("yellow_"),
        LIME("lime_"),
        GREEN("green_"),
        CYAN("cyan_"),
        LIGHT_BLUE("light_blue_"),
        BLUE("blue_"),
        PURPLE("purple_"),
        MAGENTA("magenta_"),
        PINK("pink_");

        private final String prefix;

        Color(String prefix) {
            this.prefix = prefix;
        }

        public String getPrefix() {
            return prefix;
        }
    }
}