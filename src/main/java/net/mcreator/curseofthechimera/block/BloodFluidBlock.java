
package net.mcreator.curseofthechimera.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BloodFluidBlock extends LiquidBlock {
	public BloodFluidBlock() {
		super(() -> CurseOfTheChimeraModFluids.BLOOD_FLUID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}