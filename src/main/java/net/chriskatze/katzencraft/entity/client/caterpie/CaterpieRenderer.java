package net.chriskatze.katzencraft.entity.client.caterpie;

import com.google.common.collect.Maps;
import net.chriskatze.katzencraft.KatzencraftMod;
import net.chriskatze.katzencraft.entity.client.ModEntityModelLayers;
import net.chriskatze.katzencraft.entity.custom.CaterpieEntity;
import net.chriskatze.katzencraft.entity.variant.caterpie.CaterpieVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class CaterpieRenderer extends MobEntityRenderer<CaterpieEntity, CaterpieModel> {
    // USE THIS IF YOU HAVE VARIANTS
    //------------------------------------------------------------------------------------------------------------------
    private static final Map<CaterpieVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CaterpieVariant.class), map -> {
                map.put(CaterpieVariant.NORMAL, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/caterpie/caterpie.png"));
                map.put(CaterpieVariant.SHINY, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/caterpie/caterpie_shiny.png"));
            });
    //------------------------------------------------------------------------------------------------------------------
    public CaterpieRenderer(EntityRendererFactory.Context context) {
        super(context, new CaterpieModel(context.getPart(ModEntityModelLayers.CATERPIE)), 0.5f);
    }

    @Override
    public Identifier getTexture(CaterpieEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
        // USE THIS IF YOU HAVE NO VARIANTS
        // Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/caterpie/caterpie_m.png");
    }

    // THIS IS THE SCALE OF ENTITY AND CHILD ENTITY --------------------------------------------------------------------
    @Override
    public void render(CaterpieEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.55f, 0.55f, 0.55f);
        }
        else matrixStack.scale(0.75f, 0.75f, 0.75f);
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}