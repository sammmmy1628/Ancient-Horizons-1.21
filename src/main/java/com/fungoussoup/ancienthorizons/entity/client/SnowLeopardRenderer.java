package com.fungoussoup.ancienthorizons.entity.client;

import com.fungoussoup.ancienthorizons.AncientHorizons;
import com.fungoussoup.ancienthorizons.entity.custom.SnowLeopardEntity;
import com.fungoussoup.ancienthorizons.entity.custom.TigerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SnowLeopardRenderer  extends MobRenderer<SnowLeopardEntity, SnowLeopardModel<SnowLeopardEntity>> {
    public SnowLeopardRenderer(EntityRendererProvider.Context context) {
        super(context, new SnowLeopardModel<>(context.bakeLayer(SnowLeopardModel.LAYER_LOCATION)), 0.75f);
    }

    @Override
    public ResourceLocation getTextureLocation(SnowLeopardEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(AncientHorizons.MOD_ID, "textures/entity/snow_leopard/snow_leopard.png");
    }

    @Override
    public void render(SnowLeopardEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f,0.5f,0.5f);
        } else {
            poseStack.scale(1f,1f,1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
