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
import net.minecraft.world.dimension.DimensionType;

public class HellfireEmperorArmor extends ArmorItem {

	public HellfireEmperorArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§4"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§4Full set bonus : §7Infinite Fire Resistance, Strength I and Speed I. Increased movement in the Nether. Your strength, regeneration and resistance increases if you are on fire, in the Nether or in lava. Fire and lava also removes bad potion effects. Long live the emperor ! Only §5Miizeal§7 can wear this armor."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	 @Override
	 public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		 
		 // Effets négatifs
		 
		 if(!player.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
			 
  	        {		
			   player.setFire(1);
	           player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
	           player.addPotionEffect(new EffectInstance(Effects.WITHER, 20, 1));
  	        }
		 		 
		 
		 //Effets positifs
		 		 		 
			 if(player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HELLFIRE_EMPEROR_HELMET.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HELLFIRE_EMPEROR_CHESTPLATE.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HELLFIRE_EMPEROR_LEGGINGS.get() && 
			    player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HELLFIRE_EMPEROR_BOOTS.get() &&
			    player.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
				 
			   {
				 	player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 5, 0, false, false));
				 	player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 0, false, false));
				 	player.addPotionEffect(new EffectInstance(Effects.SPEED, 5, 0, false, false));	
				 	
				 	if(player.dimension == DimensionType.THE_NETHER)
					 {
				 		player.addPotionEffect(new EffectInstance(Effects.SPEED, 5, 1, false, false));	
				 		player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 5, 1, false, false));	
					 }
				 	
				 	if(player.isInLava())
				 	{
				 		player.removePotionEffect(Effects.POISON);
					    player.removePotionEffect(Effects.WITHER);
					    player.removePotionEffect(Effects.SLOWNESS);
					    player.removePotionEffect(Effects.NAUSEA);
					    player.removePotionEffect(Effects.MINING_FATIGUE);
					    
				 		player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 3, false, false));
				 		player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5, 1, false, false));
				 		if(world.getDayTime() % 60 == 0)
						  {
				 			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 2));
						  }
				 		
				 	}
				 	else if(player.dimension == DimensionType.THE_NETHER)
				 	{
				 		player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 2, false, false));
				 		player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5, 0, false, false));
				 		if(world.getDayTime() % 60 == 0)
						  {
				 			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 1));
						  }
				 		
				 	}
				 	else if(player.isBurning())
				 	{
				 		player.removePotionEffect(Effects.POISON);
					    player.removePotionEffect(Effects.WITHER);
					    player.removePotionEffect(Effects.SLOWNESS);
					    player.removePotionEffect(Effects.NAUSEA);
					    player.removePotionEffect(Effects.MINING_FATIGUE);
					    
				 		player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 5, 1, false, false));
				 		player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5, 0, false, false));
				 		if(world.getDayTime() % 60 == 0)
						  {
				 			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 1));
						  }
				 	}
					 
			   }								
			      
	 
		super.onArmorTick(stack, world, player);
	  
    }

}
