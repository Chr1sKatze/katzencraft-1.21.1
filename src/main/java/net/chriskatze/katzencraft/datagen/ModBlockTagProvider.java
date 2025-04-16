package net.chriskatze.katzencraft.datagen;

import net.chriskatze.katzencraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        // MAKES BLOCKS MINEABLE ---------------------------------------------------------------------------------------
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add    (ModBlocks.ADAMANTIUM_BLOCK,
                        ModBlocks.ADAMANTIUM_ORE,
                        ModBlocks.ADAMANTIUM_ORE_DEEPSLATE,
                        ModBlocks.ADAMANTIUM_ORE_NETHER,
                        ModBlocks.ADAMANTIUM_ORE_END,

                        ModBlocks.MYTHRIL_BLOCK,
                        ModBlocks.MYTHRIL_ORE,
                        ModBlocks.MYTHRIL_ORE_DEEPSLATE,
                        ModBlocks.MYTHRIL_ORE_NETHER,
                        ModBlocks.MYTHRIL_ORE_END,

                        ModBlocks.MANDERVILLIUM_BLOCK,
                        ModBlocks.MANDERVILLIUM_ORE,
                        ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE,
                        ModBlocks.MANDERVILLIUM_ORE_NETHER,
                        ModBlocks.MANDERVILLIUM_ORE_END,

                        ModBlocks.PLATINUM_BLOCK,
                        ModBlocks.PLATINUM_ORE,
                        ModBlocks.PLATINUM_ORE_DEEPSLATE,
                        ModBlocks.PLATINUM_ORE_NETHER,
                        ModBlocks.PLATINUM_ORE_END,

                        ModBlocks.SILVER_BLOCK,
                        ModBlocks.SILVER_ORE,
                        ModBlocks.SILVER_ORE_DEEPSLATE,
                        ModBlocks.SILVER_ORE_NETHER,
                        ModBlocks.SILVER_ORE_END);

        // MINEABLE BLOCKS NEED IRON TOOL ------------------------------------------------------------------------------
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add    (ModBlocks.ADAMANTIUM_ORE,
                        ModBlocks.ADAMANTIUM_ORE_DEEPSLATE,
                        ModBlocks.ADAMANTIUM_ORE_NETHER,
                        ModBlocks.ADAMANTIUM_ORE_END,

                        ModBlocks.MYTHRIL_ORE,
                        ModBlocks.MYTHRIL_ORE_DEEPSLATE,
                        ModBlocks.MYTHRIL_ORE_NETHER,
                        ModBlocks.MYTHRIL_ORE_END,

                        ModBlocks.MANDERVILLIUM_ORE,
                        ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE,
                        ModBlocks.MANDERVILLIUM_ORE_NETHER,
                        ModBlocks.MANDERVILLIUM_ORE_END,

                        ModBlocks.PLATINUM_ORE,
                        ModBlocks.PLATINUM_ORE_DEEPSLATE,
                        ModBlocks.PLATINUM_ORE_NETHER,
                        ModBlocks.PLATINUM_ORE_END,

                        ModBlocks.SILVER_ORE,
                        ModBlocks.SILVER_ORE_DEEPSLATE,
                        ModBlocks.SILVER_ORE_NETHER,
                        ModBlocks.SILVER_ORE_END);

        // MINEABLE BLOCKS NEED STEEL TOOL -----------------------------------------------------------------------------

    }
}
