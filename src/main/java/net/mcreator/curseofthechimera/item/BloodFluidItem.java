
package net.mcreator.curseofthechimera.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.curseofthechimera.init.CurseOfTheChimeraModFluids;

public class BloodFluidItem extends BucketItem {
	public BloodFluidItem() {
		super(CurseOfTheChimeraModFluids.BLOOD_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
