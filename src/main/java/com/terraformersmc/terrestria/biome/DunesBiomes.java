package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terraform.biome.builder.TerraformBiome;
import com.terraformersmc.terrestria.init.TerrestriaBiomes;
import com.terraformersmc.terrestria.init.TerrestriaSurfaces;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static com.terraformersmc.terraform.biome.builder.DefaultFeature.*;
import static net.minecraft.world.gen.feature.MineshaftFeature.Type.NORMAL;

public class DunesBiomes {
	public static void register() {
		TerraformBiome.Template template = new TerraformBiome.Template(TerraformBiome.builder()
			.configureSurfaceBuilder(TerrestriaSurfaces.DUNES, TerrestriaSurfaces.DUNES_CONFIG)
			.precipitation(Biome.Precipitation.NONE).category(Biome.Category.DESERT)
			.temperature(0.9F)
			.downfall(0.1F)
			.waterColor(0x4da5e3)
			.waterFogColor(0x24a0b0)
			.addDefaultFeatures(STRUCTURES, DUNGEONS, MINEABLES, ORES, DISKS, FROZEN_TOP_LAYER)
			.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD)
			.addStructureFeature(DefaultBiomeFeatures.NORMAL_MINESHAFT)
			.addDefaultSpawnEntries()
		);

		TerrestriaBiomes.DUNES = TerrestriaBiomes.register("dunes", template.builder()
			.depth(0.3F)
			.scale(0.0F)
			.build()
		);

		TerrestriaBiomes.DUNES_EDGE = TerrestriaBiomes.register("dunes_edge", template.builder()
			.depth(-1F)
			.scale(0.0F)
			.build()
		);
	}
}
