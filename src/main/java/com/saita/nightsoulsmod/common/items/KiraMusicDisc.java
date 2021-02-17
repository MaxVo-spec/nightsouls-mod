package com.saita.nightsoulsmod.common.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.SoundEvent;

public class KiraMusicDisc extends MusicDiscItem {

	@SuppressWarnings("deprecation")
	public KiraMusicDisc(int comparatorValueIn, SoundEvent soundIn, Properties builder) {
		super(comparatorValueIn, soundIn, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.RARE;
	}

}