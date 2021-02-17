package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;
import com.saita.nightsoulsmod.core.init.SoundInit;

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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class MilkyWayArmor extends ArmorItem {

	public MilkyWayArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§1"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§1Full set bonus : §7Infinite Strength III, Speed I, Jump Boost III and restores health overtime. Hold sneak to enable slow falling. Automatically gives you star bits overtime which buffs you when you eat them. Only §cSaitaquack§7 can wear this armor."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	 @Override
	 public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		 
		 // Effets négatifs
		 
		 if(!player.inventory.hasItemStack(new ItemStack(ItemInit.SAITAQUACK_SOUL.get())))
			 
  	        {		
			    player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
		   		player.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 20, 0));
		   		player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 10, 14));	     
  	        }
		 		 
		 
		 //Effets positifs
		 		 		 
			 if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.MILKY_WAY_HELMET.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.MILKY_WAY_CHESTPLATE.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.MILKY_WAY_LEGGINGS.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.MILKY_WAY_BOOTS.get() &&
			    player.inventory.hasItemStack(new ItemStack(ItemInit.SAITAQUACK_SOUL.get())))
				 
			     {
			   		player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 1, false, false));	    
			   		player.addPotionEffect(new EffectInstance(Effects.SPEED, 5, 0, false, false));
			   		player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 5, 2, false, false));
			   		if(world.getDayTime() % 80 == 0)
			   		{
			   			int randomHealChance = random.nextInt(3);
					    
			   			if(randomHealChance == 0)
			   			{
			   				player.heal(1.0F);
			   			}
			   		}
			   		
			    	if(player.isSneaking())
				    {	
			    	  player.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 100, 0, false, false));						 
				    }
			    	
			    	if(world.getDayTime() % 1800 == 0)
			   		 {
                      ItemStack starFragment = new ItemStack(ItemInit.STAR_BIT.get(), 1);
          			  player.dropItem(starFragment, false).setNoPickupDelay();
          			  world.playSound(player, player.getPosition(), SoundInit.STAR_BIT.get(), SoundCategory.MASTER, 1.0F, 1.0F);

                     }
			   	}
				 
										
			      
	 
		super.onArmorTick(stack, world, player);
	  
    }

}
