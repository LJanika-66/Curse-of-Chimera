
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CurseOfTheChimeraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CurseOfTheChimeraMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CurseOfTheChimeraModItems.KASANE_TETO_SPAWN_EGG.get());
			tabData.accept(CurseOfTheChimeraModItems.KASANE_TETO_V_2_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CurseOfTheChimeraModBlocks.BLOOD_BLOCK.get().asItem());
			tabData.accept(CurseOfTheChimeraModItems.BLOOD.get());
			tabData.accept(CurseOfTheChimeraModItems.SMELTEDBLOOD.get());
			tabData.accept(CurseOfTheChimeraModItems.REALMOF_CHIMERA.get());
			tabData.accept(CurseOfTheChimeraModItems.BLOOD_FLUID_BUCKET.get());
		}
	}
}
