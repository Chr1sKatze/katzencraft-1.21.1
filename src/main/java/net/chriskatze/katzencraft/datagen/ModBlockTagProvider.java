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
                .add(ModBlocks.ADAMANTIUM_BLOCK,
                        ModBlocks.ADAMANTIUM_ORE,
                        ModBlocks.ADAMANTIUM_ORE_DEEPSLATE,
                        ModBlocks.ADAMANTIUM_ORE_NETHER,
                        ModBlocks.ADAMANTIUM_ORE_END);

        // MINEABLE BLOCKS NEED IRON TOOL ------------------------------------------------------------------------------
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ADAMANTIUM_ORE,
                        ModBlocks.ADAMANTIUM_ORE_DEEPSLATE,
                        ModBlocks.ADAMANTIUM_ORE_NETHER,
                        ModBlocks.ADAMANTIUM_ORE_END);
    }
}
