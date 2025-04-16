package net.chriskatze.katzencraft.datagen;

import net.chriskatze.katzencraft.block.ModBlocks;
import net.chriskatze.katzencraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        // STANDARD SELF DROPS -----------------------------------------------------------------------------------------
        addDrop(ModBlocks.ADAMANTIUM_BLOCK);
        addDrop(ModBlocks.MYTHRIL_BLOCK);
        addDrop(ModBlocks.MANDERVILLIUM_BLOCK);
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.SILVER_BLOCK);

        // ORE DROPS ---------------------------------------------------------------------------------------------------
        addDrop(ModBlocks.ADAMANTIUM_ORE, oreDrops(ModBlocks.ADAMANTIUM_ORE, ModItems.ADAMANTIUM_RAW));
        addDrop(ModBlocks.ADAMANTIUM_ORE_DEEPSLATE, multipleOreDrops(ModBlocks.ADAMANTIUM_ORE_DEEPSLATE, ModItems.ADAMANTIUM_RAW,
                1, 2));
        addDrop(ModBlocks.ADAMANTIUM_ORE_NETHER, oreDrops(ModBlocks.ADAMANTIUM_ORE_NETHER, ModItems.ADAMANTIUM_RAW));
        addDrop(ModBlocks.ADAMANTIUM_ORE_END, oreDrops(ModBlocks.ADAMANTIUM_ORE_END, ModItems.ADAMANTIUM_RAW));

        addDrop(ModBlocks.MYTHRIL_ORE, oreDrops(ModBlocks.MYTHRIL_ORE, ModItems.MYTHRIL_RAW));
        addDrop(ModBlocks.MYTHRIL_ORE_DEEPSLATE, multipleOreDrops(ModBlocks.MYTHRIL_ORE_DEEPSLATE, ModItems.MYTHRIL_RAW,
                1, 2));
        addDrop(ModBlocks.MYTHRIL_ORE_NETHER, oreDrops(ModBlocks.MYTHRIL_ORE_NETHER, ModItems.MYTHRIL_RAW));
        addDrop(ModBlocks.MYTHRIL_ORE_END, oreDrops(ModBlocks.MYTHRIL_ORE_END, ModItems.MYTHRIL_RAW));

        addDrop(ModBlocks.MANDERVILLIUM_ORE, oreDrops(ModBlocks.MANDERVILLIUM_ORE, ModItems.MANDERVILLIUM_RAW));
        addDrop(ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE, multipleOreDrops(ModBlocks.MANDERVILLIUM_ORE_DEEPSLATE, ModItems.MANDERVILLIUM_RAW,
                1, 2));
        addDrop(ModBlocks.MANDERVILLIUM_ORE_NETHER, oreDrops(ModBlocks.MANDERVILLIUM_ORE_NETHER, ModItems.MANDERVILLIUM_RAW));
        addDrop(ModBlocks.MANDERVILLIUM_ORE_END, oreDrops(ModBlocks.MANDERVILLIUM_ORE_END, ModItems.MANDERVILLIUM_RAW));

        addDrop(ModBlocks.PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM_RAW));
        addDrop(ModBlocks.PLATINUM_ORE_DEEPSLATE, multipleOreDrops(ModBlocks.PLATINUM_ORE_DEEPSLATE, ModItems.PLATINUM_RAW,
                1, 2));
        addDrop(ModBlocks.PLATINUM_ORE_NETHER, oreDrops(ModBlocks.PLATINUM_ORE_NETHER, ModItems.PLATINUM_RAW));
        addDrop(ModBlocks.PLATINUM_ORE_END, oreDrops(ModBlocks.PLATINUM_ORE_END, ModItems.PLATINUM_RAW));

        addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.SILVER_RAW));
        addDrop(ModBlocks.SILVER_ORE_DEEPSLATE, multipleOreDrops(ModBlocks.SILVER_ORE_DEEPSLATE, ModItems.SILVER_RAW,
                1, 2));
        addDrop(ModBlocks.SILVER_ORE_NETHER, oreDrops(ModBlocks.SILVER_ORE_NETHER, ModItems.SILVER_RAW));
        addDrop(ModBlocks.SILVER_ORE_END, oreDrops(ModBlocks.SILVER_ORE_END, ModItems.SILVER_RAW));
    }

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // MULTIPLE ORE DROP FUNCTION --------------------------------------------------------------------------------------
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(item)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
