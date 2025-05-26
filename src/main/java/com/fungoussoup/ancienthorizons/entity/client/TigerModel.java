package com.fungoussoup.ancienthorizons.entity.client;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class TigerModel<T extends TigerEntity> extends HierarchicalModel<T> {
        public static final ModelLayerLocation LAYER_LOCATION =
                new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, "tiger"), "main");
        private final ModelPart body;
        private final ModelPart head;


        public TigerModel(ModelPart root) {
            this.body = root.getChild("body");
            this.head = this.body.getChild("head");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));

            PartDefinition belly = body.addOrReplaceChild("belly", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -18.0F, 11.0F, 11.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.0F, 11.0F));

            PartDefinition angerfur = belly.addOrReplaceChild("angerfur", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5F, -1.0F, -20.0F, 0.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
                    .texOffs(36, 58).addBox(-4.5F, -1.0F, -19.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 82).addBox(-5.5F, -2.0F, -17.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(20, 82).addBox(-5.5F, -2.0F, -15.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(36, 59).addBox(-4.5F, -1.0F, -13.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 3.0F));

            PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(52, 53).addBox(-6.0F, -5.0F, -7.0F, 12.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 58).addBox(-9.0F, -2.0F, -3.0F, 18.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -7.0F));

            PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create().texOffs(40, 69).addBox(-3.5F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                    .texOffs(60, 77).addBox(-3.0F, 3.0F, -4.75F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offset(0.5F, -2.0F, -7.0F));

            PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(62, 69).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                    .texOffs(40, 77).addBox(-2.5F, -2.0F, -4.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offset(0.0F, 1.0F, -7.0F));

            PartDefinition tongue = jaw.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(80, 77).addBox(-2.5F, -0.5F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition eyesangry = head.addOrReplaceChild("eyesangry", CubeListBuilder.create().texOffs(84, 3).addBox(1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(84, 6).addBox(-4.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -6.05F));

            PartDefinition eyesclosed = head.addOrReplaceChild("eyesclosed", CubeListBuilder.create().texOffs(84, 9).addBox(2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(84, 9).addBox(-4.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -6.05F));

            PartDefinition earleft = head.addOrReplaceChild("earleft", CubeListBuilder.create().texOffs(40, 66).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, -5.0F, -1.5F));

            PartDefinition earleft2 = head.addOrReplaceChild("earleft2", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -5.0F, -1.5F));

            PartDefinition pawleftfront = body.addOrReplaceChild("pawleftfront", CubeListBuilder.create().texOffs(64, 0).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offset(3.0F, 5.0F, -4.0F));

            PartDefinition clawsleftfront = pawleftfront.addOrReplaceChild("clawsleftfront", CubeListBuilder.create().texOffs(36, 60).addBox(-2.5F, 0.0F, -0.025F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, -3.025F));

            PartDefinition pawrightfront = body.addOrReplaceChild("pawrightfront", CubeListBuilder.create().texOffs(64, 16).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offset(-3.0F, 5.0F, -4.0F));

            PartDefinition clawsrightfront = pawrightfront.addOrReplaceChild("clawsrightfront", CubeListBuilder.create().texOffs(36, 63).addBox(-2.5F, 0.0F, -0.025F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, -3.025F));

            PartDefinition pawrightback = body.addOrReplaceChild("pawrightback", CubeListBuilder.create().texOffs(0, 66).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offset(-3.0F, 5.0F, 12.0F));

            PartDefinition clawsrightback = pawrightback.addOrReplaceChild("clawsrightback", CubeListBuilder.create().texOffs(80, 82).addBox(-2.5F, 0.0F, -0.025F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, -3.025F));

            PartDefinition pawleftback = body.addOrReplaceChild("pawleftback", CubeListBuilder.create().texOffs(20, 66).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.025F)), PartPose.offset(3.0F, 5.0F, 12.0F));

            PartDefinition clawsleftback = pawleftback.addOrReplaceChild("clawsleftback", CubeListBuilder.create().texOffs(0, 84).addBox(-2.5F, 0.0F, -0.025F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, -3.025F));

            PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 14.0F, -1.0036F, 0.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 128, 128);
        }

        @Override
        public void setupAnim(TigerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.applyHeadRotation(netHeadYaw, headPitch);

            this.animateWalk(TigerAnimations.TIGER_RUN, limbSwing, limbSwingAmount,2f,2.5f);
            this.animate(entity.angryAnimationState, TigerAnimations.TIGER_ANGRY, ageInTicks, 1f);
        }

        private void applyHeadRotation(float headYaw, float headPitch) {
            headYaw = Mth.clamp(headYaw,-30f,30f);
            headPitch = Mth.clamp(headPitch,-25f,45);

            this.head.yRot = headYaw * ((float)Math.PI / 180f);
            this.head.xRot = headPitch * ((float)Math.PI / 180f);
        }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
            body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        }

    @Override
    public ModelPart root() {
        return body;
    }
}

