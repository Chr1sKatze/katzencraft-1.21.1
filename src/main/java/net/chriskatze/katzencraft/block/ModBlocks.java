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
