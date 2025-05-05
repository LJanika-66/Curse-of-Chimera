
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.curseofthechimera.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.curseofthechimera.entity.KasaneTetoV2Entity;
import net.mcreator.curseofthechimera.entity.KasaneTetoEntity;
import net.mcreator.curseofthechimera.CurseOfTheChimeraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CurseOfTheChimeraModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CurseOfTheChimeraMod.MODID);
	public static final RegistryObject<EntityType<KasaneTetoEntity>> KASANE_TETO = register("kasane_teto",
			EntityType.Builder.<KasaneTetoEntity>of(KasaneTetoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(KasaneTetoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KasaneTetoV2Entity>> KASANE_TETO_V_2 = register("kasane_teto_v_2",
			EntityType.Builder.<KasaneTetoV2Entity>of(KasaneTetoV2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(KasaneTetoV2Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KasaneTetoEntity.init();
			KasaneTetoV2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KASANE_TETO.get(), KasaneTetoEntity.createAttributes().build());
		event.put(KASANE_TETO_V_2.get(), KasaneTetoV2Entity.createAttributes().build());
	}
}
