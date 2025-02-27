package net.chriskatze.katzencraft.entity.client.ivysaur;

import com.google.common.collect.Maps;
import net.chriskatze.katzencraft.KatzencraftMod;
import net.chriskatze.katzencraft.entity.client.ModEntityModelLayers;
import net.chriskatze.katzencraft.entity.client.kakuna.KakunaModel;
import net.chriskatze.katzencraft.entity.custom.KakunaEntity;
import net.chriskatze.katzencraft.entity.variant.kakuna.KakunaVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class KakunaRenderer extends MobEntityRenderer<KakunaEntity, KakunaModel> {
    // USE THIS IF YOU HAVE VARIANTS
    //------------------------------------------------------------------------------------------------------------------
    private static final Map <KakunaVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(KakunaVariant.class), map -> {
                map.put(KakunaVariant.NORMAL, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/kakuna/kakuna.png"));
                map.put(KakunaVariant.SHINY, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/kakuna/kakuna_shiny.png"));
            });
    //------------------------------------------------------------------------------------------------------------------
    public KakunaRenderer(EntityRendererFactory.Context context) {
        super(context, new KakunaModel(context.getPart(ModEntityModelLayers.KAKUNA)), 0.5f);
    }

    @Override
    public Identifier getTexture(KakunaEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    // THIS IS THE SIZE OF THE CHILD
    @Override
    public void render(KakunaEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.65f, 0.65f, 0.65f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}