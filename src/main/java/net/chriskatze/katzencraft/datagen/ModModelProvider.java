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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE_END);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANDERVILLIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANDERVILLIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANDERVILLIUM_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANDERVILLIUM_ORE_END);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE_END);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE_END);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // GENERATES STANDARD ITEM MODELS WITH PROVIDED TEXTURE --------------------------------------------------------
        itemModelGenerator.register(ModItems.ADAMANTIUM_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MYTHRIL_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MANDERVILLIUM_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANDERVILLIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANDERVILLIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.PLATINUM_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SHORTSWORD, Models.HANDHELD);
    }
}
