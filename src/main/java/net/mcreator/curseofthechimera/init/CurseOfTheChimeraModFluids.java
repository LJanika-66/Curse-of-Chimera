
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.curseofthechimera.fluid.BloodFluidFluid;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<FlowingFluid> BLOOD_FLUID = REGISTRY.register("blood_fluid", () -> new BloodFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLOOD_FLUID = REGISTRY.register("flowing_blood_fluid", () -> new BloodFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BLOOD_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD_FLUID.get(), RenderType.translucent());
		}
	}
}
