
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.curseofthechimera.client.renderer.KasaneTetoV2Renderer;
import net.mcreator.curseofthechimera.client.renderer.KasaneTetoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CurseOfTheChimeraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CurseOfTheChimeraModEntities.KASANE_TETO.get(), KasaneTetoRenderer::new);
		event.registerEntityRenderer(CurseOfTheChimeraModEntities.KASANE_TETO_V_2.get(), KasaneTetoV2Renderer::new);
	}
}
