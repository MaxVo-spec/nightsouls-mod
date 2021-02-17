package com.saita.nightsoulsmod.common.world.structures;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.common.collect.ImmutableMap;
import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.core.init.StructureInit;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class CraneBattleTowerPieces {
	
	 private static final ResourceLocation CRANE_BATTLE_TOWER = new ResourceLocation(NightSoulsMod.MOD_ID + ":crane_battle_tower");
	 private static final Map<ResourceLocation, BlockPos> OFFSET = ImmutableMap.of(CRANE_BATTLE_TOWER, new BlockPos(0, 0, 0));


	    public static void start(TemplateManager templateManager, BlockPos pos, Rotation rotation, List<StructurePiece> pieceList, Random random)
	    {
	        int x = pos.getX();
	        int z = pos.getZ();

	        BlockPos rotationOffSet = new BlockPos(0, 0, 0).rotate(rotation);
	        BlockPos blockpos = rotationOffSet.add(x, pos.getY(), z);
	        pieceList.add(new CraneBattleTowerPieces.Piece(templateManager, CRANE_BATTLE_TOWER, blockpos, rotation));

	    }

	    public static class Piece extends TemplateStructurePiece
	    {
	        private ResourceLocation resourceLocation;
	        private Rotation rotation;


	        public Piece(TemplateManager templateManagerIn, ResourceLocation resourceLocationIn, BlockPos pos, Rotation rotationIn)
	        {
	            super(StructureInit.CRANE_BATTLE_TOWER_PIECE, 0);
	            this.resourceLocation = resourceLocationIn;
	            BlockPos blockpos = CraneBattleTowerPieces.OFFSET.get(resourceLocation);
	            this.templatePosition = pos.add(blockpos.getX(), blockpos.getY(), blockpos.getZ());
	            this.rotation = rotationIn;
	            this.setupPiece(templateManagerIn);
	        }


	        public Piece(TemplateManager templateManagerIn, CompoundNBT tagCompound)
	        {
	            super(StructureInit.CRANE_BATTLE_TOWER_PIECE, tagCompound);
	            this.resourceLocation = new ResourceLocation(tagCompound.getString("Template"));
	            this.rotation = Rotation.valueOf(tagCompound.getString("Rot"));
	            this.setupPiece(templateManagerIn);
	        }


	        private void setupPiece(TemplateManager templateManager)
	        {
	            Template template = templateManager.getTemplateDefaulted(this.resourceLocation);
	            PlacementSettings placementsettings = (new PlacementSettings()).setRotation(this.rotation).setMirror(Mirror.NONE);
	            this.setup(template, this.templatePosition, placementsettings);
	        }


	        @Override
	        protected void readAdditional(CompoundNBT tagCompound)
	        {
	            super.readAdditional(tagCompound);
	            tagCompound.putString("Template", this.resourceLocation.toString());
	            tagCompound.putString("Rot", this.rotation.name());
	        }
	        
	        @Override
	        public boolean create(IWorld worldIn, ChunkGenerator<?> p_225577_2_, Random randomIn, MutableBoundingBox structureBoundingBoxIn, ChunkPos chunkPos)
	        {
	            PlacementSettings placementsettings = (new PlacementSettings()).setRotation(this.rotation).setMirror(Mirror.NONE);
	            BlockPos blockpos = CraneBattleTowerPieces.OFFSET.get(this.resourceLocation);
	            this.templatePosition.add(Template.transformedBlockPos(placementsettings, new BlockPos(0 - blockpos.getX(), 0, 0 - blockpos.getZ())));

	            return super.create(worldIn, p_225577_2_, randomIn, structureBoundingBoxIn, chunkPos);
	        }


			@Override
			protected void handleDataMarker(String function, BlockPos pos, IWorld worldIn, Random rand,
					MutableBoundingBox sbb) {
				
				 if ("chest".equals(function)) {        	
		                worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
		                TileEntity tileentity = worldIn.getTileEntity(pos.down());
		                
		                if (tileentity instanceof ChestTileEntity) { 
		                    ResourceLocation ltable = new ResourceLocation(NightSoulsMod.MOD_ID, "chests/battle_tower_treasure");
		                    ((ChestTileEntity)tileentity).setLootTable(ltable, rand.nextLong());
		                }

		            }
				
			}
	    }

}
