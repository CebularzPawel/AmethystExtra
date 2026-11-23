package net.cebularz.amethystextra.client.renderer.entity;

import net.cebularz.amethystextra.AmethystExtra;
import net.cebularz.amethystextra.world.entity.projectile.AmethystArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public class AmethystArrowRenderer extends ArrowRenderer<AmethystArrow> {

    @OnlyIn(Dist.CLIENT)
    public AmethystArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(AmethystArrow amethystArrow) {
        return ResourceLocation.fromNamespaceAndPath(AmethystExtra.MOD_ID,"textures/entity/projectiles/amethyst_arrow.png");
    }
}
