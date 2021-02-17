package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BinaryArmor extends ArmorItem {

	public BinaryArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§a"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§aFull set bonus : §7Infinite Haste IV, Fire Resistance, Hero of The Village, Conduit Power and Dolphin's Grace. Automatically repairs itself. Hold sneak to regenerate fast, get saturation and resistance. Only §9Basti_io§7 can wear this armor."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	 @Override
	 public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		 
		 // Effets négatifs
		 
		 if(!player.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))	
			 
  	        {		
			    player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
                player.addPotionEffect(new EffectInstance(Effects.POISON, 20, 4)); 
                world.playSound(player, player.getPosition(), SoundEvents.BLOCK_DISPENSER_DISPENSE, SoundCategory.MASTER, 1.0F, 1.0F);
                world.playSound(player, player.getPosition(), SoundEvents.ENTITY_WOLF_GROWL, SoundCategory.MASTER, 1.0F, 1.0F);
  	        }
		 		 
		 
		 //Effets positifs
		 		 		 
			 if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.BINARY_HELMET.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.BINARY_CHESTPLATE.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.BINARY_LEGGINGS.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.BINARY_BOOTS.get() &&
			    player.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))	
				 
			   {				 
				 	player.addPotionEffect(new EffectInstance(Effects.HASTE, 5, 3, false, false));
				 	player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 5, 0, false, false));
				 	player.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 20, 0, false, false));
				 	player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 5, 0, false, false));	
				 	player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 5, 0, false, false));	
				 	
				 	if(world.getDayTime() % 300 == 0)
			   		{
				 		stack.damageItem(-1, player, null);
			   		}
				 	
				 	if(player.isSneaking())
				    {	
				 		if(world.getDayTime() % 60 == 0)
				   		{
					    	player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 80, 2));						 
				   		}
				    	player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5, 1));	
				    	player.addPotionEffect(new EffectInstance(Effects.SATURATION, 5, 0));						 
				    }
				 	
				 
			   }								
			      
	 
		super.onArmorTick(stack, world, player);
	  
    }

}
