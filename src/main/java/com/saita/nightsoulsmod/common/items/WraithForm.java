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

public class WraithForm extends Item{

	public WraithForm(Properties properties) {
		super(properties);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {

	return Rarity.RARE;
	}
	
	 @Override
	 public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	 {
	    	
	   tooltip.add(new StringTextComponent("§7Cooldown : 12 seconds"));
	   super.addInformation(stack, worldIn, tooltip, flagIn);
	 }
	 
	 @Override
	    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
	    	
	    playerIn.getCooldownTracker().setCooldown(this, 240);
  	 
	    playerIn.removePotionEffect(Effects.POISON);
	    playerIn.removePotionEffect(Effects.WITHER);
	    playerIn.removePotionEffect(Effects.SLOWNESS);
	    playerIn.removePotionEffect(Effects.NAUSEA);
	    
	    playerIn.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 60, 4));
	    playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 60, 2));
	    playerIn.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 60, 4));
	    playerIn.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 60, 4));
	    playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 60, 0));
	    worldIn.playSound(playerIn, playerIn.getPosition(), SoundInit.WRAITH_FORM.get(), SoundCategory.MASTER, 1.0F, 1.0F);
	    
	    	return super.onItemRightClick(worldIn, playerIn, handIn);
	   }

}
