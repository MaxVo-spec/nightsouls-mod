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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class HallowedPaladinArmor extends ArmorItem {

	public HallowedPaladinArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§6"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§6Full set bonus : §7Infinite Speed II, Regeneration I and Strength I. Also automatically generates an absorption shield. Hold sneak to jump super high and to regen health faster. Only §fKrahne§7 can wear this armor."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	 @Override
	 public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		 
		 // Effets négatifs
		 
		 if(!player.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())))
			 
  	        {		
			 	player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
			 	player.addPotionEffect(new EffectInstance(Effects.HUNGER, 20, 4));
			 	player.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 20, 0));
			 	player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 100, 0));
  	        }
		 
		 //Effets positifs
		 		 		 
			 if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HALLOWED_PALADIN_HELMET.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HALLOWED_PALADIN_CHESTPLATE.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HALLOWED_PALADIN_LEGGINGS.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HALLOWED_PALADIN_BOOTS.get() &&
			    player.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())))
				 
			  {
				 player.addPotionEffect(new EffectInstance(Effects.SPEED, 5, 1, false, false));
				 player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 0, false, false));
				 
				 if(world.getDayTime() % 200 == 0)
				  {
					 player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 400, 0, false, false));
				  }
				 
				 if(world.getDayTime() % 400 == 0)
				  {
					 player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 200, 1, false, false));
				  }
				 
				 if(player.isSneaking())
				 {	
			    	  player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 20, 5, false, false));	
			    	  if(world.getDayTime() % 60 == 0)
				   		{
					    	player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 80, 1));						 
				   	    }
				 }
					 
			}								
			      
	 
		super.onArmorTick(stack, world, player);
	  
    }

}
