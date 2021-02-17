package com.saita.nightsoulsmod.common.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class ReinhardtHammer extends SwordItem {

	public ReinhardtHammer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
		super(tier, attackDamageIn, attackSpeedIn, builderIn);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {

		return Rarity.RARE;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
    	
    tooltip.add(new StringTextComponent("§7HAMMER DOWN !"));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		if(stack.isEnchanted() == false)
			
		  {
		  stack.addEnchantment(Enchantments.SWEEPING, 10);
		  }
		
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	}

}
