package com.saita.nightsoulsmod.common.items;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CranePetsSummoningGem extends Item {

	public CranePetsSummoningGem(Properties properties) {
		super(properties);

	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		
	    return Rarity.UNCOMMON;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {	
		
		if(playerIn.inventory.hasItemStack(new ItemStack(ItemInit.KRAHNE_SOUL.get())))
 	    {
			
	    	ItemStack itemstack = playerIn.getHeldItem(handIn);
	    	itemstack.shrink(1);
		
	    	ItemStack nitille = new ItemStack(Items.RABBIT_SPAWN_EGG, 1);
	    	ItemStack blanche = new ItemStack(Items.RABBIT_SPAWN_EGG, 1);
	    	ItemStack biscotte = new ItemStack(Items.RABBIT_SPAWN_EGG, 1);
	    	ItemStack mercure = new ItemStack(Items.RABBIT_SPAWN_EGG, 1);
	    	ItemStack flopsy = new ItemStack(Items.RABBIT_SPAWN_EGG, 1);
    	
	    	ItemStack kiki = new ItemStack(Items.PARROT_SPAWN_EGG, 1);
    	
	    	ItemStack guimauve = new ItemStack(Items.WOLF_SPAWN_EGG, 1);
    	
	    	ItemStack bones = new ItemStack(Items.BONE, 12);
	    	ItemStack seeds = new ItemStack(Items.WHEAT_SEEDS, 12);
		
	    	nitille.setDisplayName(new StringTextComponent("Nitille"));
	    	blanche.setDisplayName(new StringTextComponent("Blanche"));
			biscotte.setDisplayName(new StringTextComponent("Biscotte"));
			mercure.setDisplayName(new StringTextComponent("Mercure"));
			flopsy.setDisplayName(new StringTextComponent("Flopsy"));
			kiki.setDisplayName(new StringTextComponent("Kiki"));
			guimauve.setDisplayName(new StringTextComponent("Guimauve"));
		
			bones.setDisplayName(new StringTextComponent("To tame Guimauve"));
			seeds.setDisplayName(new StringTextComponent("To tame Kiki"));
		
			playerIn.dropItem(nitille, false).setNoPickupDelay();
			playerIn.dropItem(blanche, false).setNoPickupDelay();
			playerIn.dropItem(biscotte, false).setNoPickupDelay();
	    	playerIn.dropItem(mercure, false).setNoPickupDelay();
	    	playerIn.dropItem(flopsy, false).setNoPickupDelay();
	    	playerIn.dropItem(kiki, false).setNoPickupDelay();
	    	playerIn.dropItem(guimauve, false).setNoPickupDelay();
	    	playerIn.dropItem(bones, false).setNoPickupDelay();
	    	playerIn.dropItem(seeds, false).setNoPickupDelay();
		}
		else
		{
		   if(worldIn.isRemote)
	    	{
	 	     playerIn.sendMessage(new TranslationTextComponent("Only Krahne can use this item !"));
	    	}
		}
	    	
			
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
