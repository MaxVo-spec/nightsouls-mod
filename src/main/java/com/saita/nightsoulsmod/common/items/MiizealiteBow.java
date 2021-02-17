package com.saita.nightsoulsmod.common.items;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;


public class MiizealiteBow extends NightSoulsBaseBow{

	public MiizealiteBow(Properties builder) {
		super(builder);
	}

	    @Override
	    protected double getArrowDamage(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, bowStack);

	        return (double)powerLevel * 0.75D + 4.0D;
	    }
	    
	    @Override
	    protected int getArrowKnockback(ItemStack bowStack, AbstractArrowEntity arrowEntity) {
	    	int knockbackLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, bowStack);
	    	
	    	return knockbackLevel + 1;
	    }
	    

		@Override
		public int getItemEnchantability() {
		    		
		    return 15;
		}

		@Override
		public boolean isRepairable(ItemStack stack) {
		    		
		    return true;
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		    			
		   return repair.getItem() == ItemInit.MIIZEALITE_INGOT.get();
		   
		 } 
		    
}
		   
