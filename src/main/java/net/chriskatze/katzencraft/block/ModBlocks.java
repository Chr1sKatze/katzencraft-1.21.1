package net.chriskatze.katzencraft.block;

import net.chriskatze.katzencraft.KatzencraftMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    // STANDARD BLOCKS -------------------------------------------------------------------------------------------------
    public static final Block ADAMANTIUM_BLOCK = registerBlock("adamantium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f).requiresTool()));

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f).requiresTool()));

    public static final Block MANDERVILLIUM_BLOCK = registerBlock("mandervillium_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f).requiresTool()));

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f).requiresTool()));

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f).requiresTool()));

    // ORES ------------------------------------------------------------------------------------------------------------
    public static final Block ADAMANTIUM_ORE = registerBlock("adamantium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE)
                    .strength(4f).requiresTool()));
    public static final Block ADAMANTIUM_ORE_DEEPSLATE = registerBlock("adamantium_ore_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresTool()));
    public static final Block ADAMANTIUM_ORE_NETHER = registerBlock("adamantium_ore_nether",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .strength(4f).requiresTool()));
    public static final Block ADAMANTIUM_ORE_END = registerBlock("adamantium_ore_end",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .strength(4f).requiresTool()));

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE)
                    .strength(4f).requiresTool()));
    public static final Block MYTHRIL_ORE_DEEPSLATE = registerBlock("mythril_ore_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresTool()));
    public static final Block MYTHRIL_ORE_NETHER = registerBlock("mythril_ore_nether",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .strength(4f).requiresTool()));
    public static final Block MYTHRIL_ORE_END = registerBlock("mythril_ore_end",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .strength(4f).requiresTool()));

    public static final Block MANDERVILLIUM_ORE = registerBlock("mandervillium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE)
                    .strength(4f).requiresTool()));
    public static final Block MANDERVILLIUM_ORE_DEEPSLATE = registerBlock("mandervillium_ore_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresTool()));
    public static final Block MANDERVILLIUM_ORE_NETHER = registerBlock("mandervillium_ore_nether",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .strength(4f).requiresTool()));
    public static final Block MANDERVILLIUM_ORE_END = registerBlock("mandervillium_ore_end",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .strength(4f).requiresTool()));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE)
                    .strength(4f).requiresTool()));
    public static final Block PLATINUM_ORE_DEEPSLATE = registerBlock("platinum_ore_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresTool()));
    public static final Block PLATINUM_ORE_NETHER = registerBlock("platinum_ore_nether",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .strength(4f).requiresTool()));
    public static final Block PLATINUM_ORE_END = registerBlock("platinum_ore_end",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .strength(4f).requiresTool()));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE)
                    .strength(4f).requiresTool()));
    public static final Block SILVER_ORE_DEEPSLATE = registerBlock("silver_ore_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresTool()));
    public static final Block SILVER_ORE_NETHER = registerBlock("silver_ore_nether",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.NETHERRACK)
                    .strength(4f).requiresTool()));
    public static final Block SILVER_ORE_END = registerBlock("silver_ore_end",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.END_STONE)
                    .strength(4f).requiresTool()));

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED TO REGISTER STANDARD BLOCKS --------------------------------------------------------------------------------
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KatzencraftMod.MOD_ID, name), block);
    }

    // USED TO REGISTER THE ASSOCIATED BLOCK ITEM (BLOCK =/= BLOCKITEM) ------------------------------------------------
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(KatzencraftMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED FOR INITIALIZATION AND LOGGING OF THE MODBLOCKS CLASS ------------------------------------------------------
    public static void registerModBlocks() {
        KatzencraftMod.LOGGER.info("Registering Mod Blocks for " + KatzencraftMod.MOD_ID);
    }
}
