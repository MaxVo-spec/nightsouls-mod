package com.saita.nightsoulsmod.core.enums;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum NightSoulsArmorTier implements IArmorMaterial
{
     SAITASTONE("nightsouls:saitastone", 53, new int [] {3,6,8,4}, 22, //33 * 1.6
     SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 5.0F, ()-> { return Ingredient.fromItems(ItemInit.SAITASTONE_INGOT.get());
     }),
	
	 MIIZEALITE("nightsouls:miizealite", 53, new int [] {3,6,8,3}, 15, //33 * 1.6
		     SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F, ()-> { return Ingredient.fromItems(ItemInit.MIIZEALITE_INGOT.get());
	 }),
	
	 CRANITE("nightsouls:cranite", 59, new int [] {3,7,8,4}, 30, //33 * 1.8
		     SoundEvents.ITEM_ARMOR_EQUIP_IRON , 6.0F, ()-> { return Ingredient.fromItems(ItemInit.CRANITE_INGOT.get());
	 }),
	
     BASTIRITE("nightsouls:bastirite", 72, new int [] {3,6,8,3}, 15, // 33 * 2.2
		     SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 4.0F, ()-> { return Ingredient.fromItems(ItemInit.BASTIRITE_INGOT.get());
	 }),
     
	 FANTA_GLASSES("nightsouls:fanta_glasses", 7, new int [] {1,1,2,1}, 15, 
		     SoundEvents.ITEM_ARMOR_EQUIP_TURTLE , 0.0F, ()-> { return Ingredient.fromItems(Items.GLASS_PANE);
	 }),
	 
	 //End game armors
	
	 HALLOWED_PALADIN("nightsouls:hallowed_paladin", 360, new int [] {5,8,9,5}, 30, //72 * 5 Durability 27 Defense points
		     SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 15.0F, ()-> { return Ingredient.fromItems(ItemInit.TRUE_NIGHT_SOUL.get());
	 }),
	 HELLFIRE_EMPEROR("nightsouls:hellfire_emperor", 360, new int [] {4,7,9,4}, 30, //72 * 5 Durability 24 Defense points
		     SoundEvents.ITEM_ARMOR_EQUIP_CHAIN , 12.0F, ()-> { return Ingredient.fromItems(ItemInit.TRUE_NIGHT_SOUL.get());
	 }),
	 MILKY_WAY("nightsouls:milky_way", 360, new int [] {4,8,9,5}, 30, //72 * 5 Durability 26 Defense points
		     SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND , 12.0F, ()-> { return Ingredient.fromItems(ItemInit.TRUE_NIGHT_SOUL.get());
	 }),
	 BINARY("nightsouls:binary", 360, new int [] {4,7,9,5}, 30, //72 * 5 Durability 25 Defense points
		     SoundEvents.ITEM_ARMOR_EQUIP_IRON , 12.0F, ()-> { return Ingredient.fromItems(ItemInit.TRUE_NIGHT_SOUL.get());
	 });



	 private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private NightSoulsArmorTier(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
		{
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
		
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			
			return this.repairMaterial.getValue();
		}
	    
		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			
			return this.name;
		}

		@Override
		public float getToughness() {
		
			return this.toughness;
		}

}  