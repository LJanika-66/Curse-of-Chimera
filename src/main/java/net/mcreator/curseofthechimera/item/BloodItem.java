
package net.mcreator.curseofthechimera.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BloodItem extends Item {
	public BloodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
