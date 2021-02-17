package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.common.world.structures.*;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class StructureInit {
	
    public static Structure<NoFeatureConfig> NIGHTSOULS_HOUSE = new NightSoulsHouseStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_HOUSE_PIECE = NightSoulsHousePieces.Piece::new;
    
    public static Structure<NoFeatureConfig> SAITA_FLOATING_ISLAND = new SaitaFloatingIslandStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType SAITA_FLOATING_ISLAND_PIECE = SaitaFloatingIslandPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CRANE_BATTLE_TOWER = new CraneBattleTowerStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CRANE_BATTLE_TOWER_PIECE = CraneBattleTowerPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> DRAGON_FOSSIL = new DragonFossilStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType DRAGON_FOSSIL_PIECE = DragonFossilPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> NIGHTSOULS_CAMP = new NightSoulsCampStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType NIGHTSOULS_CAMP_PIECE = NightSoulsCampPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> BASTI_LAB = new BastiLabStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType BASTI_LAB_PIECE = BastiLabPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> LUCKY_BLOCK = new LuckyBlockStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType LUCKY_BLOCK_PIECE = LuckyBlockPieces.Piece::new;
    
    public static Structure<NoFeatureConfig> CELESTIAL_EMERALD = new CelestialEmeraldStructure(NoFeatureConfig::deserialize);
    public static IStructurePieceType CELESTIAL_EMERALD_PIECE = CelestialEmeraldPieces.Piece::new;

    @SubscribeEvent
    public static void onRegisterFeatures(final RegistryEvent.Register<Feature<?>> event)
    {
        
        IForgeRegistry<Feature<?>> registry = event.getRegistry();

        NIGHTSOULS_HOUSE.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_house"));
        registry.register(NIGHTSOULS_HOUSE);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_house", NIGHTSOULS_HOUSE_PIECE);
        
        SAITA_FLOATING_ISLAND.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "saita_floating_island"));
        registry.register(SAITA_FLOATING_ISLAND);
        Registry.register(Registry.STRUCTURE_PIECE, "saita_floating_island", SAITA_FLOATING_ISLAND_PIECE);
        
        CRANE_BATTLE_TOWER.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "crane_battle_tower"));
        registry.register(CRANE_BATTLE_TOWER);
        Registry.register(Registry.STRUCTURE_PIECE, "crane_battle_tower", CRANE_BATTLE_TOWER_PIECE);
        
        DRAGON_FOSSIL.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "dragon_fossil"));
        registry.register(DRAGON_FOSSIL);
        Registry.register(Registry.STRUCTURE_PIECE, "dragon_fossil", DRAGON_FOSSIL_PIECE);
        
        NIGHTSOULS_CAMP.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "nightsouls_camp"));
        registry.register(NIGHTSOULS_CAMP);
        Registry.register(Registry.STRUCTURE_PIECE, "nightsouls_camp", NIGHTSOULS_CAMP_PIECE);
        
        BASTI_LAB.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "basti_lab"));
        registry.register(BASTI_LAB);
        Registry.register(Registry.STRUCTURE_PIECE, "basti_lab", BASTI_LAB_PIECE);
        
        LUCKY_BLOCK.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "lucky_block"));
        registry.register(LUCKY_BLOCK);
        Registry.register(Registry.STRUCTURE_PIECE, "lucky_block", LUCKY_BLOCK_PIECE);
        
        CELESTIAL_EMERALD.setRegistryName(new ResourceLocation(NightSoulsMod.MOD_ID, "celestial_emerald"));
        registry.register(CELESTIAL_EMERALD);
        Registry.register(Registry.STRUCTURE_PIECE, "celestial_emerald", CELESTIAL_EMERALD_PIECE);

    }
 
    public static void addToBiomes(){
        
        for(Biome biome : ForgeRegistries.BIOMES)
        {       	
               if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST || biome.getCategory() == Biome.Category.SAVANNA)            	   
                 { 
        	       biome.addStructure(NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_HOUSE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));   
                   
                   biome.addStructure(NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, NIGHTSOULS_CAMP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG))); 
			     }      
               
               if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST ||
                  biome.getCategory() == Biome.Category.EXTREME_HILLS || biome.getCategory() == Biome.Category.SAVANNA||
                  biome.getCategory() == Biome.Category.JUNGLE || biome.getCategory() == Biome.Category.RIVER || 
                  biome.getCategory() == Biome.Category.TAIGA ||  biome.getCategory() == Biome.Category.DESERT)
               {
            	   biome.addStructure(SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, SAITA_FLOATING_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
               }
               
               if(biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.FOREST || 
            	  biome.getCategory() == Biome.Category.SAVANNA || biome.getCategory() == Biome.Category.SWAMP || 
            	  biome.getCategory() == Biome.Category.EXTREME_HILLS)            	   
               { 
            	   biome.addStructure(CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CRANE_BATTLE_TOWER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
               }
               
               if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.OCEAN)    
               {
            	   biome.addStructure(DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, DRAGON_FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                   
                   biome.addStructure(LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, LUCKY_BLOCK.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
                   
                   biome.addStructure(CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, CELESTIAL_EMERALD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
               }
               
               if(biome.getCategory() == Biome.Category.ICY)    
               {
            	   biome.addStructure(BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                   biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, BASTI_LAB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                     .withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
               }
          }
    }
}
