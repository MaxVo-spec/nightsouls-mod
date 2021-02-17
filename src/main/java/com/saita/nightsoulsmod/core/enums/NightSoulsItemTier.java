package com.saita.nightsoulsmod.core.enums;

import java.util.function.Supplier;

import com.saita.nightsoulsmod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum NightSoulsItemTier implements IItemTier
{
	SAITASTONE(6, 2185, 11.0F, 7.0F, 22, ()-> //1561 x 1.4  Good damage, efficency, enchantability and armor. Average durability
	{ 
		return Ingredient.fromItems( ItemInit.SAITASTONE_INGOT.get()); 
	}),
	MIIZEALITE(6, 2185, 12.0F, 8.0F, 15, ()-> //1561 x 1.4  Best damage and efficency, average armor, durability and enchantability.
	{ 
		return Ingredient.fromItems( ItemInit.MIIZEALITE_INGOT.get()); 
	}),
	CRANITE(6, 2341, 10.0F, 6.0F, 30, ()-> //1561 x 1.5  Better durability and amazing enchantability, average damage and efficency, best armor.
	{ 
		return Ingredient.fromItems( ItemInit.CRANITE_INGOT.get()); 
	}),
	BASTIRITE(6, 3122, 11.0F, 6.0F, 15, ()-> //1561 x 2  Best durability, better efficency, average stats.
	{ 
		return Ingredient.fromItems( ItemInit.BASTIRITE_INGOT.get()); 
	}),
	NIGHTSOULPICK(5, 2031, 9.0F, 5.0F, 20, ()->
	{ 
		return Ingredient.fromItems( ItemInit.NIGHT_SOUL.get()); 
	}),
	BLOODZEAL(6, 2263, 12.0F, 11.0F, 22, ()->
	{ 
		return Ingredient.fromItems( ItemInit.NIGHT_SOUL.get()); 
	}),
	INSTAPICK(6, 3902, 60.0F, 8.0F, 15, ()-> //3122 x 1.25
	{ 
		return Ingredient.fromItems( ItemInit.NIGHT_SOUL.get()); 
	}),
	REINHARDT_HAMMER(6, 3746, 16.0F, 12.0F, 30, ()-> //3122 x 1.2
	{ 
		return Ingredient.fromItems( ItemInit.NIGHT_SOUL.get()); 
	}),
	PYRO_BARBARIAN_WARAXE(6, 3746, 16.0F, 14.0F, 30, ()->  //3122 x 1.2
	{ 
		return Ingredient.fromItems( ItemInit.NIGHT_SOUL.get()); 
	}),	
	
	//End game weapons
	
	HELLFIRE_EMPEROR_TRIDENT(6, 11238, 32.0F, 34.0F, 25, ()->  //3764 x 3
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	}),
	SOUL_STEALER(6, 11238, 32.0F, 20.0F, 25, ()-> //Same for all the other end game weapons
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	}),
	FROSTBURN(6, 11238, 32.0F, 32.0F, 30, ()->  
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	}),
	ASTEROID_SMASHER(6, 11238, 32.0F, 44.0F, 30, ()->  
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	}),
	GALACTIC_SLAYER(6, 11238, 32.0F, 41.0F, 30, ()->  
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	}),
	JAVA_FURY(6, 11238, 32.0F, 30.0F, 30, ()->  
	{ 
		return Ingredient.fromItems( ItemInit.TRUE_NIGHT_SOUL.get()); 
	});
    
	   private final int harvestLevel;
	   private final int maxUses;
	   private final float efficiency;
	   private final float attackDamage;
	   private final int enchantability;
	   private final LazyValue<Ingredient> repairMaterial;

	   private NightSoulsItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
	                    Supplier<Ingredient> repairMaterialIn)
	   {
	      this.harvestLevel = harvestLevelIn;
	      this.maxUses = maxUsesIn;
	      this.efficiency = efficiencyIn;
	      this.attackDamage = attackDamageIn;
	      this.enchantability = enchantabilityIn;
	      this.repairMaterial = new LazyValue<>(repairMaterialIn);
	   }

	   @Override
	   public int getMaxUses() {
	      return this.maxUses;
	   }

	   @Override
	   public float getEfficiency() {
	      return this.efficiency;
	   }

	   @Override
	   public float getAttackDamage() {
	      return this.attackDamage;
	   }

	   @Override
	   public int getHarvestLevel() {
	      return this.harvestLevel;
	   }

	   @Override
	   public int getEnchantability() {
	      return this.enchantability;
	   }

	   @Override
	   public Ingredient getRepairMaterial() {
	      return this.repairMaterial.getValue();
	   }
}
