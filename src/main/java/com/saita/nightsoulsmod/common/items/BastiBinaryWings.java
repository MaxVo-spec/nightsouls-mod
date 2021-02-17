package com.saita.nightsoulsmod.common.items;

import java.util.List;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class BastiBinaryWings extends Item {

	public BastiBinaryWings(Properties properties) {
		super(properties);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
		return Rarity.EPIC;
	}
	
	    @Override
	    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	    {
	    	
	    tooltip.add(new StringTextComponent("§7Right click to activate or deactivate fly ! Only §5NightSouls§7 members can use this item."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	    }  
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
		if (playerIn.inventory.hasItemStack(new ItemStack(ItemInit.SAITAQUACK_SOUL.get())) || 
			playerIn.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())) || 
			playerIn.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())) || 
			playerIn.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))
 	    {
		
			worldIn.playSound(playerIn, playerIn.getPosition(), SoundEvents.ENTITY_ENDER_DRAGON_FLAP, SoundCategory.MASTER, 1.0F, 1.0F);
		
			if(!playerIn.abilities.isFlying)
			{
				playerIn.abilities.allowFlying = true;
				playerIn.abilities.isFlying = true;
				
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.SAITAQUACK_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§1You are reaching for the Milky Way !"));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§4Your demon wings start to unleash !"));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§6Your power brings you to Heaven's Door !"));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§abasti.abilities.allowFlying = true"));
				}
			}
			else
			{
				playerIn.abilities.allowFlying = false;
				playerIn.abilities.isFlying = false;
				
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.SAITAQUACK_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§1You go back to Earth."));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.MIIZEAL_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§4Your sins brings you back down."));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§6Your power is bringing you back down."));
				}
				if(worldIn.isRemote && playerIn.inventory.hasItemStack(new ItemStack(ItemInit.BASTIIO_SOUL.get())))
				{
					playerIn.sendMessage(new TranslationTextComponent("§abasti.abilities.allowFlying = false"));
				}
		    }
		}
		else
		{   
		   if(worldIn.isRemote)
		     {
			   playerIn.sendMessage(new TranslationTextComponent("You are not a member of NightSouls !"));
		     }
		}
			
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
