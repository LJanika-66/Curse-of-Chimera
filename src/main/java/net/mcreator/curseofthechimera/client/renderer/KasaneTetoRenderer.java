
package net.mcreator.curseofthechimera.client.renderer;

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
