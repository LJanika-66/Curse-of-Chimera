
package net.mcreator.curseofthechimera.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SmeltedbloodItem extends Item {
	public SmeltedbloodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}
}
