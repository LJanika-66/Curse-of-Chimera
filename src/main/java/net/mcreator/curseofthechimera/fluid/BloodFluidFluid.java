
package net.mcreator.curseofthechimera.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.curseofthechimera.init.CurseOfTheChimeraModItems;
import net.mcreator.curseofthechimera.init.CurseOfTheChimeraModFluids;
import net.mcreator.curseofthechimera.init.CurseOfTheChimeraModFluidTypes;
import net.mcreator.curseofthechimera.init.CurseOfTheChimeraModBlocks;

public abstract class BloodFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CurseOfTheChimeraModFluidTypes.BLOOD_FLUID_TYPE.get(), () -> CurseOfTheChimeraModFluids.BLOOD_FLUID.get(),
			() -> CurseOfTheChimeraModFluids.FLOWING_BLOOD_FLUID.get()).explosionResistance(100f).slopeFindDistance(2).bucket(() -> CurseOfTheChimeraModItems.BLOOD_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) CurseOfTheChimeraModBlocks.BLOOD_FLUID.get());

	private BloodFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.CRIMSON_SPORE;
	}

	public static class Source extends BloodFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
