package com.fungoussoup.ancienthorizons.entity.client;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TigerRenderer extends MobRenderer<TigerEntity, TigerModel<TigerEntity>> {
    public TigerRenderer(EntityRendererProvider.Context context) {
        super(context, new TigerModel<>(context.bakeLayer(TigerModel.LAYER_LOCATION)), 0.75f);
    }

    @Override
    public ResourceLocation getTextureLocation(TigerEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID,"textures/entity/tiger/tiger.png");
    }

    @Override
    public void render(TigerEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f,0.5f,0.5f);
        } else {
            poseStack.scale(1f,1f,1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
