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
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class JavaFury extends SwordItem {

	public JavaFury(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

	}
	

	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {

	tooltip.set(0, new StringTextComponent("§c"+tooltip.get(0).getString()+"§r"));
    tooltip.add(new StringTextComponent("§7Gives you random positive potions effects upon hitting enemies. Only §9Basti_io§7 can hold this weapon."));
	super.addInformation(stack, worldIn, tooltip, flagIn);
    }  
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		int randomAttack = random.nextInt(9);
		int amplifier = random.nextInt(2);
		
		switch(randomAttack)
		{
		case 0:
			attacker.addPotionEffect(new EffectInstance(Effects.SPEED, 160, amplifier));
		break;
		case 1:
			attacker.addPotionEffect(new EffectInstance(Effects.HASTE, 160, amplifier));
		break;
		case 2:
			attacker.addPotionEffect(new EffectInstance(Effects.STRENGTH, 160, amplifier));
		break;
		case 3:
			attacker.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 160, amplifier));
		break;
		case 4:
			attacker.addPotionEffect(new EffectInstance(Effects.REGENERATION, 160, amplifier));
		break;
		case 5:
			attacker.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 160, amplifier));
		break;
		case 6:
			attacker.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 160, amplifier));
		break;
		case 7:
			attacker.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 160, amplifier));
		break;
		case 8:
			attacker.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 160, amplifier));
		break;
		}
		
		return super.hitEntity(stack, target, attacker);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
	
		if(entityIn instanceof PlayerEntity)
    	{
    	   PlayerEntity playerIn = (PlayerEntity)entityIn;
    	   
    	   if(!playerIn.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))
    	   {
    	
    		  if(((playerIn.getHeldItemMainhand().getItem() == ItemInit.JAVA_FURY.get())) || 
    			(playerIn.getHeldItemOffhand().getItem() == ItemInit.JAVA_FURY.get()))
    			
    		    { 				  
   	                 playerIn.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 20, 29));
   	                 playerIn.addPotionEffect(new EffectInstance(Effects.POISON, 20, 4)); 
   	                 worldIn.playSound(playerIn, playerIn.getPosition(), SoundEvents.BLOCK_DISPENSER_DISPENSE, SoundCategory.MASTER, 1.0F, 1.0F);
   	                 worldIn.playSound(playerIn, playerIn.getPosition(), SoundEvents.ENTITY_WOLF_GROWL, SoundCategory.MASTER, 1.0F, 1.0F);	               
    		     }
    	     }
    		 
     	 }
		
		super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
	}

}
