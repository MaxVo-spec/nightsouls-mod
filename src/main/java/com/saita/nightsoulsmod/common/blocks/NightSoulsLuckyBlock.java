package com.saita.nightsoulsmod.common.blocks;

import com.saita.nightsoulsmod.core.init.BlockInit;
import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.VexEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class NightSoulsLuckyBlock extends Block {

	public NightSoulsLuckyBlock(Properties properties) {
		super(properties);

	}
	
	@Override
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, TileEntity te,
			ItemStack stack) {
		
		int randomPrice = RANDOM.nextInt(601);
		
		if(randomPrice < 30)
		{
			int randomBlock = RANDOM.nextInt(4);
			switch(randomBlock)
			{
			 case 0:
				worldIn.setBlockState(pos, BlockInit.MIIZEALITE_BLOCK.get().getDefaultState());
			 break;
			 case 1:
				worldIn.setBlockState(pos, BlockInit.SAITASTONE_BLOCK.get().getDefaultState());
			 break;
			 case 2:
				worldIn.setBlockState(pos, BlockInit.CRANITE_BLOCK.get().getDefaultState());
			 break;
			 case 3:
				worldIn.setBlockState(pos, BlockInit.BASTIRITE_BLOCK.get().getDefaultState());
			 break;
			}
		}
		else if(randomPrice < 40)
		{
			worldIn.setBlockState(pos, Blocks.COAL_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(0, 1, 0), Blocks.IRON_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(0, 2, 0), Blocks.GOLD_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(0, 3, 0), Blocks.DIAMOND_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(0, 4, 0), Blocks.EMERALD_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(0, 5, 0), BlockInit.MIIZEALITE_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(0, 6, 0), BlockInit.SAITASTONE_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(0, 7, 0), BlockInit.CRANITE_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(0, 8, 0), BlockInit.BASTIRITE_BLOCK.get().getDefaultState());	
		}
		else if(randomPrice < 90)
		{
			int randomIngots = RANDOM.nextInt(4);
			switch(randomIngots)
			{
			 case 0:
				 ItemStack saitastoneIngots = new ItemStack(ItemInit.SAITASTONE_INGOT.get(), 3 + RANDOM.nextInt(5));
				 player.dropItem(saitastoneIngots, false).setNoPickupDelay();				 
			 break;
			 case 1:
				 ItemStack miizealiteIngots = new ItemStack(ItemInit.MIIZEALITE_INGOT.get(), 3 + RANDOM.nextInt(5));
				 player.dropItem(miizealiteIngots, false).setNoPickupDelay();	
			 break;
			 case 2:
				 ItemStack craniteIngots = new ItemStack(ItemInit.CRANITE_INGOT.get(), 3 + RANDOM.nextInt(5));
				 player.dropItem(craniteIngots, false).setNoPickupDelay();	
			 break;
			 case 3:
				 ItemStack bastiriteIngots = new ItemStack(ItemInit.BASTIRITE_INGOT.get(), 3 + RANDOM.nextInt(5));
				 player.dropItem(bastiriteIngots, false).setNoPickupDelay();	
			 break;
			}	
		}
		else if(randomPrice < 100)
		{
			player.sendMessage(new TranslationTextComponent(":)"));
			player.setHealth(1.0F);
		}
		else if(randomPrice < 110)
		{
		     player.teleportKeepLoaded(player.getPosX(), player.getPosY() + 150, player.getPosZ());
			 ItemStack waterBucket = new ItemStack(Items.WATER_BUCKET, 1);
			 player.dropItem(waterBucket, false).setNoPickupDelay();
			 
		}
		else if(randomPrice < 130)
		{
	        player.sendMessage(new TranslationTextComponent("Get into water before you burn to death !"));
	        player.setFire(60);

		}
		else if(randomPrice < 150)
		{
	        player.sendMessage(new TranslationTextComponent("Well that's annoying."));
			worldIn.setBlockState(pos, Blocks.OBSIDIAN.getDefaultState());
		}
		else if(randomPrice < 170)
		{
	        player.sendMessage(new TranslationTextComponent("Ughhh you smell so bad. Wash yourself !"));
	        ItemStack waterBucket = new ItemStack(Items.WATER_BUCKET, 1);
	        ItemStack sponge = new ItemStack(Items.SPONGE, 1);
			player.dropItem(waterBucket, false).setNoPickupDelay();
			player.dropItem(sponge, false).setNoPickupDelay();
		}
		else if(randomPrice < 180)
		{
			boolean isStarItem = RANDOM.nextBoolean();
			if(isStarItem)
			{
				 ItemStack superStar = new ItemStack(ItemInit.SUPER_STAR.get(), 1);
				 player.dropItem(superStar, false).setNoPickupDelay();
			}
			else
			{
				ItemStack moltenCore = new ItemStack(ItemInit.MOLTEN_CORE.get(), 1);
				player.dropItem(moltenCore, false).setNoPickupDelay();
			}
			
		}
		else if(randomPrice < 195)
		{
	        player.sendMessage(new TranslationTextComponent("Zzzzzzzzzzzzzz..."));
	        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 140, 7));
	        player.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 140, 9));
	        player.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 140, 0));
	        player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 140, 0));

		}
		else if(randomPrice < 208)
		{
			int randomOwItem = RANDOM.nextInt(3);
			switch(randomOwItem)
			{
			case 0:			
			   ItemStack wraith = new ItemStack(ItemInit.WRAITH_FORM.get(), 1);
			   player.dropItem(wraith, false).setNoPickupDelay();
			break;
			case 1:			
				ItemStack breather = new ItemStack(ItemInit.TAKE_A_BREATHER.get(), 1);
				player.dropItem(breather, false).setNoPickupDelay();
			break;
			case 2:			
				ItemStack amp = new ItemStack(ItemInit.AMP_IT_UP.get(), 1);
				player.dropItem(amp, false).setNoPickupDelay();
			break;		
			}
		
		}
		else if(randomPrice < 230)
		{
			ItemStack nightSoulPick = new ItemStack(ItemInit.NIGHT_SOUL_PICKAXE.get(), 1);
			player.dropItem(nightSoulPick, false).setNoPickupDelay();
		}
		else if(randomPrice < 240)
		{
			ItemStack flower = new ItemStack(Items.POPPY, 1);
			player.dropItem(flower, false).setNoPickupDelay();
	 	    player.sendMessage(new TranslationTextComponent("§d*Flush*. I- I like you a lot, yo- you know..."));
		}
		else if(randomPrice < 260)
		{
			ItemStack luckyBlock = new ItemStack(ItemInit.NIGHTSOULS_LUCKY_BLOCK.get(), 1);
			player.dropItem(luckyBlock, false).setNoPickupDelay();
	 	    player.sendMessage(new TranslationTextComponent("Wow that was garbage. Try again."));

		}
		else if(randomPrice < 340)
		{
           player.sendMessage(new TranslationTextComponent("You got jebaited :) Better luck next time."));
		}
		else if(randomPrice < 350)
		{
			ItemStack salut = new ItemStack(ItemInit.FANTA_GLASSES.get(), 1);
			player.dropItem(salut, false).setNoPickupDelay();
		}
		else if(randomPrice < 360)
		{
			worldIn.setBlockState(pos, BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 0), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, 1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 0), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, -1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, -1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, -1), BlockInit.NIGHTSOULS_LUCKY_BLOCK.get().getDefaultState());
		}
		else if(randomPrice < 370)
		{
			ItemStack craniteWaraxe = new ItemStack(ItemInit.CRANITE_WARAXE.get(), 1);
			player.dropItem(craniteWaraxe, false).setNoPickupDelay();
		}
		else if(randomPrice < 380)
		{
			ItemStack dirt = new ItemStack(Items.DIRT, 1);
			player.dropItem(dirt, false).setNoPickupDelay();
		}
		
		else if(randomPrice < 390)
		{
			worldIn.setBlockState(pos, Blocks.REDSTONE_BLOCK.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 0), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 0), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, -1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, -1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, -1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(0, 1, 0), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(1, 1, 0), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(0, 1, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(1, 1, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 1, 0), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(0, 1, -1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 1, -1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 1, 1), Blocks.TNT.getDefaultState());
			worldIn.setBlockState(pos.add(1, 1, -1), Blocks.TNT.getDefaultState());
		}
		
		else if(randomPrice < 410)
		{
			worldIn.setBlockState(pos, Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 0), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, 1), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 1), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 0), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(0, 0, -1), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, -1), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 1), Blocks.FIRE.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, -1), Blocks.FIRE.getDefaultState());
		}
		
		else if(randomPrice < 420)
		{
			worldIn.setBlockState(pos.add(0, -1, 0), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(1, -1, 0), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(0, -1, 1), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(1, -1, 1), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(-1, -1, 0), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(0, -1, -1), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(-1, -1, -1), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(-1, -1, 1), Blocks.LAVA.getDefaultState());
			worldIn.setBlockState(pos.add(1, -1, -1), Blocks.LAVA.getDefaultState());
		}
		
		else if(randomPrice < 430)
		{
	         player.sendMessage(new TranslationTextComponent("You look wonderful today. Have a good day !"));
	         ItemStack diamond = new ItemStack(Items.DIAMOND, 1);
			 player.dropItem(diamond, false).setNoPickupDelay();

		}
		
		else if(randomPrice < 450)
		{
			CreeperEntity creeper = new CreeperEntity(EntityType.CREEPER, worldIn);
			creeper.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(creeper);

		}
		
		else if(randomPrice < 460)
		{
			CreeperEntity creeper1 = new CreeperEntity(EntityType.CREEPER, worldIn);
			CreeperEntity creeper2 = new CreeperEntity(EntityType.CREEPER, worldIn);
			CreeperEntity creeper3 = new CreeperEntity(EntityType.CREEPER, worldIn);
			CreeperEntity creeper4 = new CreeperEntity(EntityType.CREEPER, worldIn);
			CreeperEntity creeper5 = new CreeperEntity(EntityType.CREEPER, worldIn);
			creeper1.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			creeper2.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			creeper3.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			creeper4.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			creeper5.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(creeper1);
			worldIn.addEntity(creeper2);
			worldIn.addEntity(creeper3);
			worldIn.addEntity(creeper4);
			worldIn.addEntity(creeper5);

		}
		
		else if(randomPrice < 470)
		{
			ItemStack enderpearl = new ItemStack(Items.ENDER_PEARL, RANDOM.nextInt(7) + 2);
			player.dropItem(enderpearl, false).setNoPickupDelay();
		}
		
		else if(randomPrice < 485)
		{
			worldIn.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
			worldIn.setBlockState(pos.add(1, 0, 0), Blocks.COBBLESTONE.getDefaultState());
			worldIn.setBlockState(pos.add(-1, 0, 0), Blocks.COBBLESTONE.getDefaultState());
			worldIn.setBlockState(pos.add(0, 1, 0), Blocks.COBBLESTONE.getDefaultState());
			worldIn.setBlockState(pos.add(0, 2, 0), Blocks.COBBLESTONE.getDefaultState());
			worldIn.setBlockState(pos.add(0, 3, 0), Blocks.COBWEB.getDefaultState());
		}
		else if(randomPrice < 500)
		{
			player.addPotionEffect(new EffectInstance(Effects.POISON, 600, 3));
			player.sendMessage(new TranslationTextComponent("This block was poisoned !"));
		}		
		else if(randomPrice < 510)
		{
		    worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 4.0F, Explosion.Mode.BREAK);
		}
		else if(randomPrice < 530)
		{
			player.sendMessage(new TranslationTextComponent("Parce que les Bâtons de Berger sont mieux entre amis. Justin Bridoux, le vrai goût du partage."));
			ItemStack bridou = new ItemStack(ItemInit.JUSTIN_BRIDOU.get(), 32);
			player.dropItem(bridou, false).setNoPickupDelay();
		}
		else if(randomPrice < 540)
		{
		    ItemStack iron = new ItemStack(Items.IRON_INGOT, RANDOM.nextInt(11) + 10);
		    ItemStack gold = new ItemStack(Items.GOLD_INGOT, RANDOM.nextInt(10) + 6);
		    ItemStack diamond = new ItemStack(Items.DIAMOND, RANDOM.nextInt(7) + 3);
		    ItemStack emerald = new ItemStack(Items.EMERALD, RANDOM.nextInt(8) + 3);

			player.dropItem(iron, false).setNoPickupDelay();
			player.dropItem(gold, false).setNoPickupDelay();
			player.dropItem(diamond, false).setNoPickupDelay();
			player.dropItem(emerald, false).setNoPickupDelay();
		}
		else if(randomPrice < 550)
		{
			RavagerEntity ravager = new RavagerEntity(EntityType.RAVAGER, worldIn);
			ravager.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(ravager);
		}
		else if(randomPrice < 560)
		{
			VillagerEntity villager1 = new VillagerEntity(EntityType.VILLAGER, worldIn);
			VillagerEntity villager2 = new VillagerEntity(EntityType.VILLAGER, worldIn);
			VillagerEntity villager3 = new VillagerEntity(EntityType.VILLAGER, worldIn);
			VillagerEntity villager4 = new VillagerEntity(EntityType.VILLAGER, worldIn);
			VillagerEntity villager5 = new VillagerEntity(EntityType.VILLAGER, worldIn);
			villager1.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			villager2.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			villager3.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			villager4.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			villager5.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(villager1);
			worldIn.addEntity(villager2);
			worldIn.addEntity(villager3);
			worldIn.addEntity(villager4);
			worldIn.addEntity(villager5);
		}
		else if(randomPrice < 570)
		{
			VexEntity vex1 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex2 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex3 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex4 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex5 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex6 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex7 = new VexEntity(EntityType.VEX, worldIn);
			VexEntity vex8 = new VexEntity(EntityType.VEX, worldIn);
			vex1.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex2.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex3.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex4.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex5.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex6.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex7.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			vex8.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(vex1);
			worldIn.addEntity(vex2);
			worldIn.addEntity(vex3);
			worldIn.addEntity(vex4);
			worldIn.addEntity(vex5);	
			worldIn.addEntity(vex6);
			worldIn.addEntity(vex7);
			worldIn.addEntity(vex8);
		}
		
		else if(randomPrice < 590)
		{
			ItemStack bones = new ItemStack(Items.BONE, 12);
			player.dropItem(bones, false).setNoPickupDelay();
			
			WolfEntity wolf = new WolfEntity(EntityType.WOLF, worldIn);
			wolf.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
			worldIn.addEntity(wolf);
		}
		
		else if(randomPrice < 600)
		{
			player.sendMessage(new TranslationTextComponent("Dans le langage commun, la chance se saisit ou se donne."));
			player.sendMessage(new TranslationTextComponent("Au sein des institutions éducatives, ces deux formes se distinguent suivant que l’on « laisse » une chance ou qu’on la « donne »."));
			player.sendMessage(new TranslationTextComponent("Selon la première option, on favorisera un projet éducatif qui promeut la « conversion » du sujet (à des principes, des valeurs, des façons d’être…)."));
			player.sendMessage(new TranslationTextComponent("Au contraire, selon la seconde, on organisera des prises en charge qui visent une « métamorphose » de l’individu."));
			player.sendMessage(new TranslationTextComponent("L’objectif éducatif est alors de créer les conditions d’une intégration personnelle de ces mêmes éléments."));
			player.sendMessage(new TranslationTextComponent("Cet article dégage quelques arguments en faveur de cette seconde façon de faire, en mobilisant une étude en cours sur les conseils de discipline au sein d’établissements d’enseignement du second degré."));
			player.sendMessage(new TranslationTextComponent("Pour lire l'article en entier : https://journals.openedition.org/formationemploi/6039"));

		}
		
		else if(randomPrice == 600)
		{
			boolean isVeryLucky = RANDOM.nextBoolean();
			if(isVeryLucky)
			{
				player.sendMessage(new TranslationTextComponent("§dYOU HAVE BEEN BLESSED BY THE GODS !"));
				int randomOPWeapon = RANDOM.nextInt(7);
				switch(randomOPWeapon)
				{		
				  case 0:
				  ItemStack MiizealW1 = new ItemStack(ItemInit.HELLFIRE_EMPEROR_TRIDENT.get(), 1);
				  player.dropItem(MiizealW1, false).setNoPickupDelay();
				  break;
				  
				  case 1:
				  ItemStack MiizealW2 = new ItemStack(ItemInit.SOUL_STEALER.get(), 1);
				  player.dropItem(MiizealW2, false).setNoPickupDelay();
				  break;
				  
				  case 2:
				  ItemStack MiizealW3 = new ItemStack(ItemInit.BOW_SER.get(), 1);
				  player.dropItem(MiizealW3, false).setNoPickupDelay();
				  break;
				  
				  case 3:
				  ItemStack CraneW1 = new ItemStack(ItemInit.FROSTBURN.get(), 1);
				  player.dropItem(CraneW1, false).setNoPickupDelay();
				  break;
					  
				  case 4:
				  ItemStack CraneW2 = new ItemStack(ItemInit.ASTEROID_SMASHER.get(), 1);
				  player.dropItem(CraneW2, false).setNoPickupDelay();
				  break;
					  
				  case 5:
				  ItemStack SaitaW = new ItemStack(ItemInit.GALACTIC_SLAYER.get(), 1);
				  player.dropItem(SaitaW, false).setNoPickupDelay();
				  break;
				  
				  case 6:
				  ItemStack BastiW = new ItemStack(ItemInit.JAVA_FURY.get(), 1);
				  player.dropItem(BastiW, false).setNoPickupDelay();
				  break;
				}
			}
			else
			{
				player.sendMessage(new TranslationTextComponent("§0YOU HAVE BEEN CURSED BY THE GODS !"));
				WitherEntity wither = new WitherEntity(EntityType.WITHER, worldIn);
				wither.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
				worldIn.addEntity(wither);
			}
		}
		else if(randomPrice > 600)
		{
	        player.sendMessage(new TranslationTextComponent("You got jebaited :) Better luck next time."));
		}
				
		super.harvestBlock(worldIn, player, pos, state, te, stack);
	}

}
