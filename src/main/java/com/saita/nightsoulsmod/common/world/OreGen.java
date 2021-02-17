package com.saita.nightsoulsmod.common.world;

import com.saita.nightsoulsmod.core.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	
	public static void generateOres()
	{
		for(Biome biome : ForgeRegistries.BIOMES)
		{                                                                                         // (Rarity, OffsetBottom, OffsetTop, MaxHeight)
			ConfiguredPlacement<CountRangeConfig> nightSoulsOresSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 24));
			ConfiguredPlacement<CountRangeConfig> undergroundHeartCrystalSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 1, 1, 24));
			
			ConfiguredPlacement<CountRangeConfig> netherMiizealiteSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 1, 1, 64));
			
			ConfiguredPlacement<CountRangeConfig> trappedTrueNightSoulSpawn = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 78));
			                                                                                          
			if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND)
				
			 {	
				
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                                   // Max Ore per vein
			           (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SAITASTONE_ORE.get().getDefaultState(), 9)).withPlacement(nightSoulsOresSpawn));
			    
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                 
				        (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MIIZEALITE_ORE.get().getDefaultState(), 6)).withPlacement(nightSoulsOresSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                 
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.CRANITE_ORE.get().getDefaultState(), 9)).withPlacement(nightSoulsOresSpawn));
			  
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BASTIRITE_ORE.get().getDefaultState(), 9)).withPlacement(nightSoulsOresSpawn));
			   
			   biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
						 (new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.UNDERGROUND_HEART_CRYSTAL.get().getDefaultState(), 3)).withPlacement(undergroundHeartCrystalSpawn));
			  			  
			 }
				
			if(biome.getCategory() == Biome.Category.NETHER)
				
			     {
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
					(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.NETHER_MIIZEALITE_ORE.get().getDefaultState(), 8)).withPlacement(netherMiizealiteSpawn));		
			     }
			
			if(biome.getCategory() == Biome.Category.THEEND)
				
		     {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration                   
				(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE)), BlockInit.TRAPPED_TRUE_NIGHT_SOUL.get().getDefaultState(), 4)).withPlacement(trappedTrueNightSoulSpawn));			
		     }
						
		}
		
	}
	
}