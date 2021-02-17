package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.SoundInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class AmpItUp extends Item {

	public AmpItUp(Properties properties) {
		super(properties);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {

	return Rarity.RARE;
	}
	
	 @Override
	 public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	 {
	    	
	   tooltip.add(new StringTextComponent("§7Cooldown : 16 seconds"));
	   super.addInformation(stack, worldIn, tooltip, flagIn);
	 }
	 
	 @Override
	    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
	    	
	    playerIn.getCooldownTracker().setCooldown(this, 320);
	    
	    playerIn.removePotionEffect(Effects.SLOWNESS);
	    
	    playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 130, 3));
	    playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 80, 2));
	    worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.AMP_IT_UP.get(), SoundCategory.MASTER, 0.6F, 1.0F);
	    
	    	return super.onItemRightClick(worldIn, playerIn, handIn);
	  }

}
