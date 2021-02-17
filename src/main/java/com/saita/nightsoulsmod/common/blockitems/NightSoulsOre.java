package com.saita.nightsoulsmod.common.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

public class NightSoulsOre extends BlockItem {

	public NightSoulsOre(Block blockIn, Properties builder) {
		super(blockIn, builder);
		
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {

		return Rarity.UNCOMMON;
	}
	

}
