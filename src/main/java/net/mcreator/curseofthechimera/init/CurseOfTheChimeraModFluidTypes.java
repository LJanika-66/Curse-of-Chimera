
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.curseofthechimera.fluid.types.BloodFluidFluidType;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<FluidType> BLOOD_FLUID_TYPE = REGISTRY.register("blood_fluid", () -> new BloodFluidFluidType());
}
