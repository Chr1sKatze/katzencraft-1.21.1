package net.chriskatze.katzencraft;

import net.chriskatze.katzencraft.entity.ModEntities;
import net.chriskatze.katzencraft.entity.client.bulbasaur.BulbasaurModel;
import net.chriskatze.katzencraft.entity.client.bulbasaur.BulbasaurRenderer;
import net.chriskatze.katzencraft.entity.client.ModEntityModelLayers;
import net.chriskatze.katzencraft.entity.client.caterpie.CaterpieModel;
import net.chriskatze.katzencraft.entity.client.caterpie.CaterpieRenderer;
import net.chriskatze.katzencraft.entity.client.ivysaur.IvysaurModel;
import net.chriskatze.katzencraft.entity.client.ivysaur.IvysaurRenderer;
import net.chriskatze.katzencraft.entity.client.ivysaur.KakunaRenderer;
import net.chriskatze.katzencraft.entity.client.kakuna.KakunaModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class KatzencraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.BULBASAUR, BulbasaurModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BULBASAUR, BulbasaurRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.IVYSAUR, IvysaurModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.IVYSAUR, IvysaurRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.CATERPIE, CaterpieModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CATERPIE, CaterpieRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.KAKUNA, KakunaModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.KAKUNA, KakunaRenderer::new);

        // TRANSPARENCY FOR TEXTURES -----------------------------------------------------------------------------------

    }
}
