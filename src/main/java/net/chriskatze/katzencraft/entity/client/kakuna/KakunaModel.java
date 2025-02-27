package net.chriskatze.katzencraft.entity.client.kakuna;

import net.chriskatze.katzencraft.entity.client.animation.CaterpieAnimations;
import net.chriskatze.katzencraft.entity.client.animation.KakunaAnimations;
import net.chriskatze.katzencraft.entity.custom.KakunaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class KakunaModel extends SinglePartEntityModel<KakunaEntity> {
    private final ModelPart kakuna;
    private final ModelPart body;
    private final ModelPart head;

    public KakunaModel(ModelPart root) {
        this.kakuna = root.getChild("kakuna");
        this.body = this.kakuna.getChild("body");
        this.head = this.body.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData kakuna = modelPartData.addChild("kakuna", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = kakuna.addChild("body", ModelPartBuilder.create().uv(0, 23).cuboid(-3.0F, -0.5066F, -2.6215F, 6.0F, 4.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 13).cuboid(-3.5F, -4.4066F, -3.1215F, 7.0F, 4.0F, 6.0F, new Dilation(-0.1F)), ModelTransform.pivot(0.0F, -7.4934F, -0.1285F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -5.0F, -3.75F, 7.0F, 5.0F, 8.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.4066F, -0.6215F, 0.0873F, 0.0F, 0.0F));

        ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, -2.75F));

        ModelPartData eye_right = eyes.addChild("eye_right", ModelPartBuilder.create().uv(-1, 0).cuboid(-0.245F, -0.5F, -0.535F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(22, 4).cuboid(-1.255F, -1.0F, -0.495F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.255F, 0.0F, -0.515F));

        ModelPartData eye_left = eyes.addChild("eye_left", ModelPartBuilder.create().uv(22, 0).cuboid(-0.745F, -1.0F, -0.495F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(-1, -1).cuboid(-0.755F, -0.5F, -0.535F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.255F, 0.0F, -0.515F));

        ModelPartData arm_right = body.addChild("arm_right", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -1.4066F, -0.6215F));

        ModelPartData arm_right2 = arm_right.addChild("arm_right2", ModelPartBuilder.create().uv(20, 13).cuboid(-1.0F, -1.25F, -1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.5F, -2.0F));

        ModelPartData arm_left = body.addChild("arm_left", ModelPartBuilder.create().uv(0, -1).cuboid(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -1.4066F, -0.6215F));

        ModelPartData arm_left2 = arm_left.addChild("arm_left2", ModelPartBuilder.create().uv(0, 13).cuboid(-1.0F, -1.25F, -1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.5F, -2.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(30, 0).cuboid(-2.0F, -1.5F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.3934F, -0.6215F, -0.5585F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public void setAngles(KakunaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(KakunaAnimations.KAKUNA_GROUND_WALK, limbSwing, limbSwingAmount, 8f, 10f);
        this.updateAnimation(entity.idleAnimationState, KakunaAnimations.KAKUNA_GROUND_IDLE, ageInTicks, 2f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25f, 45);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        kakuna.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return kakuna;
    }
}