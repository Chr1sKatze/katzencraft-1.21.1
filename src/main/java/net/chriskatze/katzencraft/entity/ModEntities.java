package net.chriskatze.katzencraft.entity;

import net.chriskatze.katzencraft.KatzencraftMod;
import net.chriskatze.katzencraft.entity.custom.BulbasaurEntity;
import net.chriskatze.katzencraft.entity.custom.CaterpieEntity;
import net.chriskatze.katzencraft.entity.custom.IvysaurEntity;
import net.chriskatze.katzencraft.entity.custom.KakunaEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<BulbasaurEntity> BULBASAUR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KatzencraftMod.MOD_ID, "bulbasaur"),
            EntityType.Builder.create(BulbasaurEntity::new, SpawnGroup.CREATURE).dimensions(0.85f,0.75f).build());

    public static final EntityType<IvysaurEntity> IVYSAUR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KatzencraftMod.MOD_ID, "ivysaur"),
            EntityType.Builder.create(IvysaurEntity::new, SpawnGroup.CREATURE).dimensions(0.85f,0.75f).build());

    public static final EntityType<CaterpieEntity> CATERPIE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KatzencraftMod.MOD_ID, "caterpie"),
            EntityType.Builder.create(CaterpieEntity::new, SpawnGroup.CREATURE).dimensions(0.85f,0.75f).build());

    public static final EntityType<KakunaEntity> KAKUNA = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KatzencraftMod.MOD_ID, "kakuna"),
            EntityType.Builder.create(KakunaEntity::new, SpawnGroup.CREATURE).dimensions(0.85f,0.75f).build());

    // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    // USED FOR INITIALIZATION AND LOGGING OF THE MODITEMS CLASS -------------------------------------------------------
    public static void registerModEntities() {
        KatzencraftMod.LOGGER.info("Registering Mod Entities for " + KatzencraftMod.MOD_ID);
    }
}
