
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.curseofthechimera.item.BloodItem;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	// Start of user code block custom items
	// End of user code block custom items
}
