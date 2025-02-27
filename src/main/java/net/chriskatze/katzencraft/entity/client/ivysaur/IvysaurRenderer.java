package net.chriskatze.katzencraft.entity.client.ivysaur;

import com.google.common.collect.Maps;
import net.chriskatze.katzencraft.KatzencraftMod;
import net.chriskatze.katzencraft.entity.client.ModEntityModelLayers;
import net.chriskatze.katzencraft.entity.custom.IvysaurEntity;
import net.chriskatze.katzencraft.entity.variant.ivysaur.IvysaurVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class IvysaurRenderer extends MobEntityRenderer<IvysaurEntity, IvysaurModel> {
    // USE THIS IF YOU HAVE VARIANTS
    //------------------------------------------------------------------------------------------------------------------
    private static final Map<net.chriskatze.katzencraft.entity.variant.ivysaur.IvysaurVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(IvysaurVariant.class), map -> {
                map.put(IvysaurVariant.MALE_NORMAL, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/ivysaur/ivysaur_m.png"));
                map.put(IvysaurVariant.FEMALE_NORMAL, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/ivysaur/ivysaur_f.png"));
                map.put(IvysaurVariant.MALE_SHINY, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/ivysaur/ivysaur_m_shiny.png"));
                map.put(IvysaurVariant.FEMALE_SHINY, Identifier.of(KatzencraftMod.MOD_ID, "textures/entity/ivysaur/ivysaur_f_shiny.png"));
            });
    //------------------------------------------------------------------------------------------------------------------
    public IvysaurRenderer(EntityRendererFactory.Context context) {
        super(context, new IvysaurModel(context.getPart(ModEntityModelLayers.IVYSAUR)), 0.5f);
    }

    @Override
    public Identifier getTexture(IvysaurEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    // THIS IS THE SCALE OF ENTITY AND CHILD ENTITY --------------------------------------------------------------------
    @Override
    public void render(IvysaurEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.65f, 0.65f, 0.65f);
        }
        else matrixStack.scale(0.85f, 0.85f, 0.85f);
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}