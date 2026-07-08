package net.ccitronella.backwardspickarangs.mixin;


import net.ccitronella.backwardspickarangs.BackwardsPickarangsClient;
import net.ccitronella.backwardspickarangs.Config;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.violetmoon.quark.content.tools.entity.rang.AbstractPickarang;
@Pseudo
@Mixin(targets = "org.violetmoon.quark.content.tools.client.render.entity.PickarangRenderer")
public abstract class PickarangRendererMixin extends EntityRenderer<AbstractPickarang<?>> {

    protected PickarangRendererMixin(EntityRendererProvider.Context context) {
        super(context);
    }

    @ModifyArg(method = "render(Lorg/violetmoon/quark/content/tools/entity/rang/AbstractPickarang;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
            at = @At(value = "INVOKE", target = "Lcom/mojang/math/Axis;rotationDegrees(F)Lorg/joml/Quaternionf;", ordinal = 1), index = 0
    )
    public float hhh(float degrees) {
        return(degrees * BackwardsPickarangsClient.speed);
    }

}
