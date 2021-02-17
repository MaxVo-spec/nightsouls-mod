package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.common.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, NightSoulsMod.MOD_ID);

	public static final RegistryObject<Block> SAITASTONE_BLOCK = BLOCKS.register("saitastone_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.RED).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> MIIZEALITE_BLOCK = BLOCKS.register("miizealite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> CRANITE_BLOCK = BLOCKS.register("cranite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.LIGHT_GRAY).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BASTIRITE_BLOCK = BLOCKS.register("bastirite_block", () -> new NightSoulsOreBlock(Block.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(6.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.METAL)));

	public static final RegistryObject<Block> SAITASTONE_ORE = BLOCKS.register("saitastone_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MIIZEALITE_ORE = BLOCKS.register("miizealite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> NETHER_MIIZEALITE_ORE = BLOCKS.register("nether_miizealite_ore", () -> new NetherMiizealiteOre(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> CRANITE_ORE = BLOCKS.register("cranite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BASTIRITE_ORE = BLOCKS.register("bastirite_ore", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));
	public static final RegistryObject<Block> UNDERGROUND_HEART_CRYSTAL = BLOCKS.register("underground_heart_crystal", () -> new UndergroundHeartCrystal(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(4.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.GLASS)));	
	public static final RegistryObject<Block> TRAPPED_TRUE_NIGHT_SOUL = BLOCKS.register("trapped_true_night_soul", () -> new TrappedTrueNightSoul(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(10.0F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(6).sound(SoundType.STONE)));
	public static final RegistryObject<Block> NIGHTSOULS_LUCKY_BLOCK = BLOCKS.register("nightsouls_lucky_block", () -> new NightSoulsLuckyBlock(Block.Properties.create(Material.IRON, MaterialColor.PURPLE).hardnessAndResistance(1.5F, 1200.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SAITASTONE_CROPS = BLOCKS.register("saitastone_crops", () -> new SaitastoneCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> MIIZEALITE_CROPS = BLOCKS.register("miizealite_crops", () -> new MiizealiteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> CRANITE_CROPS = BLOCKS.register("cranite_crops", () -> new CraniteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> BASTIRITE_CROPS = BLOCKS.register("bastirite_crops", () -> new BastiriteCrops(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> CELESTIAL_EMERALD_BLOCK = BLOCKS.register("celestial_emerald_block", () -> new CelestialEmeraldBlock(Block.Properties.create(Material.IRON, MaterialColor.GREEN).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.GLASS).notSolid()));

}
