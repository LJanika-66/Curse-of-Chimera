
package net.mcreator.curseofthechimera.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.curseofthechimera.entity.KasaneTetoEntity;

public class KasaneTetoRenderer extends HumanoidMobRenderer<KasaneTetoEntity, HumanoidModel<KasaneTetoEntity>> {
	public KasaneTetoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(KasaneTetoEntity entity) {
		return new ResourceLocation("curse_of_the_chimera:textures/entities/b85bf8672dd304fc.png");
	}
}
