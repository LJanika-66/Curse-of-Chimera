
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<SoundEvent> LALAH_EJEDRE = REGISTRY.register("lalah_ejedre", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("curse_of_the_chimera", "lalah_ejedre")));
}
