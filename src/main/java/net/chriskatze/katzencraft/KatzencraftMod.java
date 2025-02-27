package net.chriskatze.katzencraft;

import net.chriskatze.katzencraft.block.ModBlocks;
import net.chriskatze.katzencraft.entity.ModEntities;
import net.chriskatze.katzencraft.entity.custom.BulbasaurEntity;
import net.chriskatze.katzencraft.entity.custom.CaterpieEntity;
import net.chriskatze.katzencraft.entity.custom.IvysaurEntity;
import net.chriskatze.katzencraft.entity.custom.KakunaEntity;
import net.chriskatze.katzencraft.item.ModItemGroups;
import net.chriskatze.katzencraft.item.ModItems;
import net.chriskatze.katzencraft.world.gen.ModEntitySpawns;
import net.chriskatze.katzencraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KatzencraftMod implements ModInitializer {
	public static final String MOD_ID = "katzencraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// THIS CODE RUNS AS SOON AS MINECRAFT IS IN A MOD-LOAD-READY STATE --------------------------------------------
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGeneration();
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.BULBASAUR, BulbasaurEntity.createBulbasaurAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.IVYSAUR, IvysaurEntity.createIvysaurAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.CATERPIE, CaterpieEntity.createCaterpieAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.KAKUNA, KakunaEntity.createKakunaAttributes());
		ModEntitySpawns.addSpawns();
	}
}