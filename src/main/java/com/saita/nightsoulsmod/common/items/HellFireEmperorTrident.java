package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class HellFireEmperorTrident extends SwordItem {

	public HellFireEmperorTrident(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§4"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§7This one is going to hurt a lot. Only §5Miizeal§7 can hold this weapon."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		target.setFire(10);
		return super.hitEntity(stack, target, attacker);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		if(entityIn instanceof PlayerEntity)
    	{
    	   PlayerEntity playerIn = (PlayerEntity)entityIn;
    	   
    	   if(!playerIn.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
    	   {
    	
    		  if(((playerIn.getHeldItemMainhand().getItem() == ItemInit.HELLFIRE_EMPEROR_TRIDENT.get())) || 
    			(playerIn.getHeldItemOffhand().getItem() == ItemInit.HELLFIRE_EMPEROR_TRIDENT.get()))
    			
    		    { 			 
    	           playerIn.setFire(1);
    	           playerIn.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
    	           playerIn.addPotionEffect(new EffectInstance(Effects.WITHER, 20, 1));
    		    }
    	    }
    		 
     	 }
    	
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	}

}
