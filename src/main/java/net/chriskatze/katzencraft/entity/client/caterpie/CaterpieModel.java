package net.chriskatze.katzencraft.entity.client.caterpie;

import net.chriskatze.katzencraft.entity.client.animation.CaterpieAnimations;
import net.chriskatze.katzencraft.entity.custom.CaterpieEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class CaterpieModel extends SinglePartEntityModel<CaterpieEntity> {
    private final ModelPart caterpie;
    private final ModelPart body;
    private final ModelPart head;

    public CaterpieModel(ModelPart root) {
        this.caterpie = root.getChild("caterpie");
        this.body = this.caterpie.getChild("body");
        this.head = this.body.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData caterpie = modelPartData.addChild("caterpie", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = caterpie.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.5F, -4.25F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -6.0F, 8.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.75F, -2.0F));

        ModelPartData antenna_r1 = head.addChild("antenna_r1", ModelPartBuilder.create().uv(42, 1).cuboid(-4.5F, -2.5F, 0.0F, 9.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.25F, -6.25F, 0.1745F, 0.0F, 0.0F));

        ModelPartData mouth_r1 = head.addChild("mouth_r1", ModelPartBuilder.create().uv(24, 30).cuboid(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.25F, -6.25F, 0.3927F, 0.0F, 0.0F));

        ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.25F, -3.75F));

        ModelPartData eye_right = eyes.addChild("eye_right", ModelPartBuilder.create().uv(41, 37).cuboid(-0.005F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.2F))
                .uv(33, 36).cuboid(0.005F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.2F)), ModelTransform.pivot(-3.815F, 0.55F, 0.45F));

        ModelPartData eyelid_right = eye_right.addChild("eyelid_right", ModelPartBuilder.create().uv(0, 40).cuboid(-0.51F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.2F)), ModelTransform.pivot(0.595F, 0.0F, 0.0F));

        ModelPartData eye_left = eyes.addChild("eye_left", ModelPartBuilder.create().uv(41, 31).cuboid(0.005F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.2F))
                .uv(25, 36).cuboid(-0.005F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.2F)), ModelTransform.pivot(3.815F, 0.55F, 0.45F));

        ModelPartData eyelid_left = eye_left.addChild("eyelid_left", ModelPartBuilder.create().uv(8, 40).cuboid(-0.49F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.2F)), ModelTransform.pivot(-0.595F, 0.0F, 0.0F));

        ModelPartData body_segment = body.addChild("body_segment", ModelPartBuilder.create().uv(0, 14).cuboid(-3.5F, -3.0F, -2.0F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F))
                .uv(42, 4).cuboid(-3.51F, -1.5F, 1.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(36, 30).cuboid(-3.52F, -1.0F, 1.5F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 43).cuboid(3.51F, -1.5F, 1.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(46, 29).cuboid(3.52F, -1.0F, 1.5F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, -1.0F));

        ModelPartData foot_right = body_segment.addChild("foot_right", ModelPartBuilder.create().uv(44, 22).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, 4.0F, 2.0F));

        ModelPartData foot_left = body_segment.addChild("foot_left", ModelPartBuilder.create().uv(32, 43).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, 4.0F, 2.0F));

        ModelPartData body_segment2 = body_segment.addChild("body_segment2", ModelPartBuilder.create().uv(0, 28).cuboid(-3.0F, -3.02F, -1.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(26, 43).cuboid(-3.01F, -2.0F, 1.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(46, 10).cuboid(-3.02F, -1.5F, 1.5F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(40, 42).cuboid(3.01F, -2.0F, 1.0F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(4, 46).cuboid(3.02F, -1.5F, 1.5F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 5.0F));

        ModelPartData foot_right2 = body_segment2.addChild("foot_right2", ModelPartBuilder.create().uv(38, 11).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 3.0F, 3.0F));

        ModelPartData foot_left2 = body_segment2.addChild("foot_left2", ModelPartBuilder.create().uv(30, 11).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 3.0F, 3.0F));

        ModelPartData tail = body_segment2.addChild("tail", ModelPartBuilder.create().uv(28, 14).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(12, 46).cuboid(-2.51F, 0.5F, 1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(22, 40).cuboid(-2.52F, 1.0F, 1.5F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(44, 25).cuboid(2.51F, 0.5F, 1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(24, 28).cuboid(2.52F, 1.0F, 1.5F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 5.0F));

        ModelPartData tail2 = tail.addChild("tail2", ModelPartBuilder.create().uv(28, 22).cuboid(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(46, 14).cuboid(-2.01F, -1.25F, 1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(32, 46).cuboid(-2.02F, -0.75F, 1.5F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 46).cuboid(2.01F, -1.25F, 1.0F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(26, 28).cuboid(2.02F, -0.75F, 1.5F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 4.0F));

        ModelPartData tail3 = tail2.addChild("tail3", ModelPartBuilder.create().uv(30, 4).cuboid(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, new Dilation(0.0F))
                .uv(46, 18).cuboid(-1.01F, -1.0F, 1.25F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(46, 33).cuboid(-1.02F, -0.5F, 1.75F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 46).cuboid(1.01F, -1.0F, 1.25F, 0.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 40).cuboid(1.02F, -0.5F, 1.75F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.5F, 4.0F));

        ModelPartData tail4 = tail3.addChild("tail4", ModelPartBuilder.create().uv(17, 40).cuboid(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 4.0F, -1.5708F, 0.0F, 0.0F));

        ModelPartData tail5 = tail4.addChild("tail5", ModelPartBuilder.create().uv(3, 51).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(CaterpieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(CaterpieAnimations.CATERPIE_GROUND_WALK, limbSwing, limbSwingAmount, 3f, 3f);
        this.updateAnimation(entity.idleAnimationState, CaterpieAnimations.CATERPIE_GROUND_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25f, 45);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        caterpie.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return caterpie;
    }
}