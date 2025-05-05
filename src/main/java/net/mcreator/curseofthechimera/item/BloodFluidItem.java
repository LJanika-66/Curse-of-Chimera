
package net.mcreator.curseofthechimera.item;

import net.minecraft.network.chat.Component;

public class BloodFluidItem extends BucketItem {

	public BloodFluidItem() {
		super(CurseOfTheChimeraModFluids.BLOOD_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
