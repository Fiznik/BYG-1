package corgiaoc.byg.core.world;

import corgiaoc.byg.common.world.decorator.AnyWaterOrSolidSurface;
import corgiaoc.byg.common.world.decorator.AtOceanFloorWithExtra;
import corgiaoc.byg.common.world.decorator.AtOrBelowSeaLevelCountExtra;
import corgiaoc.byg.common.world.decorator.UnderGroundPlacement;
import corgiaoc.byg.common.world.decorator.config.AtOrBelowSeaLevelCountExtraConfig;
import corgiaoc.byg.core.world.util.WorldGenRegistrationHelper;
import net.minecraft.world.gen.feature.FeatureSpreadConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class BYGDecorators {

    public static final Placement<FeatureSpreadConfig> ANY_WATER_OR_SOLID_SURFACE = WorldGenRegistrationHelper.createDecorator("water_or_solid_surface", new AnyWaterOrSolidSurface(FeatureSpreadConfig.field_242797_a));
    public static final Placement<AtSurfaceWithExtraConfig> OCEAN_FLOOR = WorldGenRegistrationHelper.createDecorator("ocean_floor_count_extra", new AtOceanFloorWithExtra(AtSurfaceWithExtraConfig.field_236973_a_));
    public static final Placement<AtSurfaceWithExtraConfig> UNDERGROUND_COUNT_EXTRA = WorldGenRegistrationHelper.createDecorator("underground_count_extra", new UnderGroundPlacement(AtSurfaceWithExtraConfig.field_236973_a_));
    public static final Placement<AtOrBelowSeaLevelCountExtraConfig> AT_OR_BELOW_SEA_LEVEL = WorldGenRegistrationHelper.createDecorator("at_or_below_sea_level", new AtOrBelowSeaLevelCountExtra(AtOrBelowSeaLevelCountExtraConfig.CODEC));

    public static void init() {
    }
}
