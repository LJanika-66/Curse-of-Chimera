
package net.mcreator.curseofthechimera.client.renderer;

public class KasaneTetoV2Renderer extends HumanoidMobRenderer<KasaneTetoV2Entity, HumanoidModel<KasaneTetoV2Entity>> {

	public KasaneTetoV2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(KasaneTetoV2Entity entity) {
		return new ResourceLocation("curse_of_the_chimera:textures/entities/b85bf8672dd304fc.png");
	}

}
