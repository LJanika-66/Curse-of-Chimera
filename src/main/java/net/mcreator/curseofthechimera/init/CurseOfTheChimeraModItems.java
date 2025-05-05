
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.curseofthechimera.item.SmeltedbloodItem;
import net.mcreator.curseofthechimera.item.RealmofChimeraItem;
import net.mcreator.curseofthechimera.item.BloodItem;
import net.mcreator.curseofthechimera.item.BloodFluidItem;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

public class CurseOfTheChimeraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> BLOOD_BLOCK = block(CurseOfTheChimeraModBlocks.BLOOD_BLOCK);
	public static final RegistryObject<Item> SMELTEDBLOOD = REGISTRY.register("smeltedblood", () -> new SmeltedbloodItem());
	public static final RegistryObject<Item> REALMOF_CHIMERA = REGISTRY.register("realmof_chimera", () -> new RealmofChimeraItem());
	public static final RegistryObject<Item> KASANE_TETO_SPAWN_EGG = REGISTRY.register("kasane_teto_spawn_egg", () -> new ForgeSpawnEggItem(CurseOfTheChimeraModEntities.KASANE_TETO, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> KASANE_TETO_V_2_SPAWN_EGG = REGISTRY.register("kasane_teto_v_2_spawn_egg", () -> new ForgeSpawnEggItem(CurseOfTheChimeraModEntities.KASANE_TETO_V_2, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BLOOD_FLUID_BUCKET = REGISTRY.register("blood_fluid_bucket", () -> new BloodFluidItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
