
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.curseofthechimera.block.RealmofChimeraPortalBlock;
import net.mcreator.curseofthechimera.block.BloodFluidBlock;
import net.mcreator.curseofthechimera.block.BloodBlockBlock;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", () -> new BloodBlockBlock());
	public static final RegistryObject<Block> REALMOF_CHIMERA_PORTAL = REGISTRY.register("realmof_chimera_portal", () -> new RealmofChimeraPortalBlock());
	public static final RegistryObject<Block> BLOOD_FLUID = REGISTRY.register("blood_fluid", () -> new BloodFluidBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
