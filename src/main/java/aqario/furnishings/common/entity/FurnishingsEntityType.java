package aqario.furnishings.common.entity;

import aqario.furnishings.common.Furnishings;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

public class FurnishingsEntityType {
	public static final EntityType<SeatEntity> SEAT = Registry.register(
		Registry.ENTITY_TYPE, new Identifier(Furnishings.ID, "seat"),
		QuiltEntityTypeBuilder.create()
			.entityFactory(SeatEntity::new)
			.spawnGroup(SpawnGroup.MISC)
			.setDimensions(EntityDimensions.fixed(0.0F, 0.0F))
			.build());

	public static final EntityType<ScarecrowEntity> SCARECROW = Registry.register(
			Registry.ENTITY_TYPE, new Identifier(Furnishings.ID, "scarecrow"),
			QuiltEntityTypeBuilder.createLiving()
					.entityFactory(ScarecrowEntity::new)
					.spawnGroup(SpawnGroup.MISC)
					.defaultAttributes(StatueEntity.createLivingAttributes().add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0F))
					.setDimensions(EntityDimensions.fixed(0.6F, 2.0F))
					.build());

	public static final EntityType<StatueEntity> STATUE = Registry.register(
			Registry.ENTITY_TYPE, new Identifier(Furnishings.ID, "statue"),
			QuiltEntityTypeBuilder.createLiving()
					.entityFactory(StatueEntity::new)
					.spawnGroup(SpawnGroup.MISC)
					.defaultAttributes(StatueEntity.createLivingAttributes().add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0F))
					.setDimensions(EntityDimensions.fixed(0.6F, 2.0F))
					.build());

	public static void init() {
	}
}
