package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BowSer extends BowSerBaseBow {

	public BowSer(Properties builder) {
		super(builder);
	}

	    @Override
	    protected double getArrowDamage(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, bowStack);

	        return (double)powerLevel * 2.5D + 12.0D;
	    }
	    
	    @Override
	    protected int getArrowKnockback(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, bowStack);
	    	
	    	return knockbackLevel + 2;
	    }
	    

		@Override
		public int getItemEnchantability() {
		    		
		    return 30;
		}

		@Override
		public boolean isRepairable(ItemStack stack) {
		    		
		    return true;
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		    			
		   return repair.getItem() == ItemInit.TRUE_NIGHT_SOUL.get();
		   
		} 
		
		@Override
		public Rarity getRarity(ItemStack stack) {
			
			return Rarity.EPIC;
		}
		
		@Override
	    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	    {

		tooltip.set(0, new StringTextComponent("§c"+tooltip.get(0).getString()+"§r"));
	    tooltip.add(new StringTextComponent("§7BWA HA HA HA HA HA ! Only §5Miizeal§7 can hold this weapon."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	    }  
		
		@Override
		public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
			
			if(entityIn instanceof PlayerEntity)
	    	{
	    	   PlayerEntity playerIn = (PlayerEntity)entityIn;
	    	   
	    	   if(!playerIn.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
	    	   {
	    	
	    		  if(((playerIn.getHeldItemMainhand().getItem() == ItemInit.BOW_SER.get())) || 
	    			(playerIn.getHeldItemOffhand().getItem() == ItemInit.BOW_SER.get()))
	    			
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
