package net.chriskatze.katzencraft.datagen;

import net.chriskatze.katzencraft.block.ModBlocks;
import net.chriskatze.katzencraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // GENERATES STANDARD BLOCK MODELS WITH PROVIDED TEXTURE -------------------------------------------------------
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTIUM_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTIUM_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTIUM_ORE_END);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // GENERATES STANDARD ITEM MODELS WITH PROVIDED TEXTURE --------------------------------------------------------
        itemModelGenerator.register(ModItems.ADAMANTIUM_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTIUM_INGOT, Models.GENERATED);
    }
}
