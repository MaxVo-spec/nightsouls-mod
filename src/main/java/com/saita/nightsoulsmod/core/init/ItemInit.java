package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;
import com.saita.nightsoulsmod.NightSoulsMod.*;
import com.saita.nightsoulsmod.common.blockitems.*;
import com.saita.nightsoulsmod.common.items.*;
import com.saita.nightsoulsmod.core.enums.NightSoulsArmorTier;
import com.saita.nightsoulsmod.core.enums.NightSoulsItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NightSoulsMod.MOD_ID);
	
	public static final RegistryObject<Item> SAITASTONE_INGOT = ITEMS.register("saitastone_ingot", () -> new NightSoulsOreIngot(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> MIIZEALITE_INGOT = ITEMS.register("miizealite_ingot", () -> new NightSoulsOreIngot(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> CRANITE_INGOT = ITEMS.register("cranite_ingot", () -> new NightSoulsOreIngot(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BASTIRITE_INGOT = ITEMS.register("bastirite_ingot", () -> new NightSoulsOreIngot(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> NIGHT_SOUL = ITEMS.register("night_soul", () -> new Item(new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> SAITASTONE_SWORD = ITEMS.register("saitastone_sword", () -> new SwordItem(NightSoulsItemTier.SAITASTONE, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> SAITASTONE_PICKAXE = ITEMS.register("saitastone_pickaxe", () -> new NightSoulsOrePickaxe(NightSoulsItemTier.SAITASTONE, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> SAITASTONE_AXE = ITEMS.register("saitastone_axe", () -> new AxeItem(NightSoulsItemTier.SAITASTONE, 5, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ShovelItem> SAITASTONE_SHOVEL = ITEMS.register("saitastone_shovel", () -> new ShovelItem(NightSoulsItemTier.SAITASTONE, 1, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<HoeItem> SAITASTONE_HOE = ITEMS.register("saitastone_hoe", () -> new HoeItem(NightSoulsItemTier.SAITASTONE, 1, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> SAITASTONE_HELMET = ITEMS.register("saitastone_helmet", () -> new SaitastoneArmor(NightSoulsArmorTier.SAITASTONE, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> SAITASTONE_CHESTPLATE = ITEMS.register("saitastone_chestplate", () -> new SaitastoneArmor(NightSoulsArmorTier.SAITASTONE, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> SAITASTONE_LEGGINGS = ITEMS.register("saitastone_leggings", () -> new SaitastoneArmor(NightSoulsArmorTier.SAITASTONE, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> SAITASTONE_BOOTS = ITEMS.register("saitastone_boots", () -> new SaitastoneArmor(NightSoulsArmorTier.SAITASTONE, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> MIIZEALITE_SWORD = ITEMS.register("miizealite_sword", () -> new SwordItem(NightSoulsItemTier.MIIZEALITE, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> MIIZEALITE_PICKAXE = ITEMS.register("miizealite_pickaxe", () -> new NightSoulsOrePickaxe(NightSoulsItemTier.MIIZEALITE, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> MIIZEALITE_AXE = ITEMS.register("miizealite_axe", () -> new AxeItem(NightSoulsItemTier.MIIZEALITE, 5, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ShovelItem> MIIZEALITE_SHOVEL = ITEMS.register("miizealite_shovel", () -> new ShovelItem(NightSoulsItemTier.MIIZEALITE, 1, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<HoeItem> MIIZEALITE_HOE = ITEMS.register("miizealite_hoe", () -> new HoeItem(NightSoulsItemTier.MIIZEALITE, 1, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MIIZEALITE_HELMET = ITEMS.register("miizealite_helmet", () -> new MiizealiteArmor(NightSoulsArmorTier.MIIZEALITE, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MIIZEALITE_CHESTPLATE = ITEMS.register("miizealite_chestplate", () -> new MiizealiteArmor(NightSoulsArmorTier.MIIZEALITE, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MIIZEALITE_LEGGINGS = ITEMS.register("miizealite_leggings", () -> new MiizealiteArmor(NightSoulsArmorTier.MIIZEALITE, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MIIZEALITE_BOOTS = ITEMS.register("miizealite_boots", () -> new MiizealiteArmor(NightSoulsArmorTier.MIIZEALITE, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> CRANITE_SWORD = ITEMS.register("cranite_sword", () -> new SwordItem(NightSoulsItemTier.CRANITE, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> CRANITE_PICKAXE = ITEMS.register("cranite_pickaxe", () -> new NightSoulsOrePickaxe(NightSoulsItemTier.CRANITE, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> CRANITE_AXE = ITEMS.register("cranite_axe", () -> new AxeItem(NightSoulsItemTier.CRANITE, 5, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ShovelItem> CRANITE_SHOVEL = ITEMS.register("cranite_shovel", () -> new ShovelItem(NightSoulsItemTier.CRANITE, 1, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<HoeItem> CRANITE_HOE = ITEMS.register("cranite_hoe", () -> new HoeItem(NightSoulsItemTier.CRANITE, 1, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> CRANITE_WARAXE = ITEMS.register("cranite_waraxe", () -> new AxeItem(NightSoulsItemTier.CRANITE, 8, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> CRANITE_HELMET = ITEMS.register("cranite_helmet", () -> new CraniteArmor(NightSoulsArmorTier.CRANITE, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> CRANITE_CHESTPLATE = ITEMS.register("cranite_chestplate", () -> new CraniteArmor(NightSoulsArmorTier.CRANITE, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> CRANITE_LEGGINGS = ITEMS.register("cranite_leggings", () -> new CraniteArmor(NightSoulsArmorTier.CRANITE, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> CRANITE_BOOTS = ITEMS.register("cranite_boots", () -> new CraniteArmor(NightSoulsArmorTier.CRANITE, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> BASTIRITE_SWORD = ITEMS.register("bastirite_sword", () -> new SwordItem(NightSoulsItemTier.BASTIRITE, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> BASTIRITE_PICKAXE = ITEMS.register("bastirite_pickaxe", () -> new NightSoulsOrePickaxe(NightSoulsItemTier.BASTIRITE, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> BASTIRITE_AXE = ITEMS.register("bastirite_axe", () -> new AxeItem(NightSoulsItemTier.BASTIRITE, 5, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ShovelItem> BASTIRITE_SHOVEL = ITEMS.register("bastirite_shovel", () -> new ShovelItem(NightSoulsItemTier.BASTIRITE, 1, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<HoeItem> BASTIRITE_HOE = ITEMS.register("bastirite_hoe", () -> new HoeItem(NightSoulsItemTier.BASTIRITE, 1, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BASTIRITE_HELMET = ITEMS.register("bastirite_helmet", () -> new BastiriteArmor(NightSoulsArmorTier.BASTIRITE, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BASTIRITE_CHESTPLATE = ITEMS.register("bastirite_chestplate", () -> new BastiriteArmor(NightSoulsArmorTier.BASTIRITE, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BASTIRITE_LEGGINGS = ITEMS.register("bastirite_leggings", () -> new BastiriteArmor(NightSoulsArmorTier.BASTIRITE, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BASTIRITE_BOOTS = ITEMS.register("bastirite_boots", () -> new BastiriteArmor(NightSoulsArmorTier.BASTIRITE, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> NIGHT_SOUL_PICKAXE = ITEMS.register("night_soul_pickaxe", () -> new NightSoulPickaxe(NightSoulsItemTier.NIGHTSOULPICK, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> BLOODZEAL = ITEMS.register("bloodzeal", () -> new BloodZeal(NightSoulsItemTier.BLOODZEAL, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> SUPER_STAR = ITEMS.register("super_star", () -> new SuperStar(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(8)));
	public static final RegistryObject<Item> MOLTEN_CORE = ITEMS.register("molten_core", () -> new MoltenCore(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(8)));
	public static final RegistryObject<Item> WRAITH_FORM = ITEMS.register("wraith_form", () -> new WraithForm(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> TAKE_A_BREATHER = ITEMS.register("take_a_breather", () -> new TakeABreather(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> AMP_IT_UP = ITEMS.register("amp_it_up", () -> new AmpItUp(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> MOON_CHARM = ITEMS.register("moon_charm", () -> new MoonCharm(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<PickaxeItem> INSTA_PICKAXE = ITEMS.register("insta_pickaxe", () -> new InstaPickaxe(NightSoulsItemTier.INSTAPICK, 1, -2.8F, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> JUSTIN_BRIDOU = ITEMS.register("justin_bridou", () -> new Item(new Item.Properties().group(NightSoulsItemGroup.instance).food(new Food.Builder().hunger(9).saturation(2.2F).build())));
	public static final RegistryObject<Item> MIIZEALITE_BOW = ITEMS.register("miizealite_bow", () -> new MiizealiteBow(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1).maxDamage(847))); //385 x 2.2
    public static final RegistryObject<SwordItem> REINHARDT_HAMMER = ITEMS.register("reinhardt_hammer", () -> new ReinhardtHammer(NightSoulsItemTier.REINHARDT_HAMMER, 3, -2.6F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<AxeItem> PYRO_BARBARIAN_WARAXE = ITEMS.register("pyro_barbarian_waraxe", () -> new PyroBarbarianWaraxe(NightSoulsItemTier.PYRO_BARBARIAN_WARAXE, 5, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> CRANE_PETS_SUMMONING_GEM = ITEMS.register("crane_pets_summoning_gem", () -> new CranePetsSummoningGem(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> LIFE_CRYSTAL = ITEMS.register("life_crystal", () -> new LifeCrystal(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(10).food(new Food.Builder().hunger(3).saturation(1.2F).fastToEat().setAlwaysEdible().build())));
    public static final RegistryObject<ArmorItem> FANTA_GLASSES = ITEMS.register("fanta_glasses", () -> new FantaGlasses(NightSoulsArmorTier.FANTA_GLASSES, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> MAGIC_MIRROR = ITEMS.register("magic_mirror", () -> new MagicMirror(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> TRUE_NIGHT_SOUL = ITEMS.register("true_night_soul", () -> new TrueNightSoul(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BASTI_BINARY_WINGS = ITEMS.register("basti_binary_wings", () -> new BastiBinaryWings(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<SwordItem> HELLFIRE_EMPEROR_TRIDENT = ITEMS.register("hellfire_emperor_trident", () -> new HellFireEmperorTrident(NightSoulsItemTier.HELLFIRE_EMPEROR_TRIDENT, 3, -2.6F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> SOUL_STEALER = ITEMS.register("soul_stealer", () -> new SoulStealer(NightSoulsItemTier.SOUL_STEALER, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> FROSTBURN = ITEMS.register("frostburn", () -> new Frostburn(NightSoulsItemTier.FROSTBURN, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> ASTEROID_SMASHER = ITEMS.register("asteroid_smasher", () -> new AsteroidSmasher(NightSoulsItemTier.ASTEROID_SMASHER, 3, -3.0F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> GALACTIC_SLAYER = ITEMS.register("galactic_slayer", () -> new GalacticSlayer(NightSoulsItemTier.GALACTIC_SLAYER, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<SwordItem> JAVA_FURY = ITEMS.register("java_fury", () -> new JavaFury(NightSoulsItemTier.JAVA_FURY, 3, -2.4F, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BOW_SER = ITEMS.register("bow_ser", () -> new BowSer(new Item.Properties().group(NightSoulsItemGroup.instance).maxStackSize(1).maxDamage(6666))); 
	public static final RegistryObject<ArmorItem> HALLOWED_PALADIN_HELMET = ITEMS.register("hallowed_paladin_helmet", () -> new HallowedPaladinArmor(NightSoulsArmorTier.HALLOWED_PALADIN, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HALLOWED_PALADIN_CHESTPLATE = ITEMS.register("hallowed_paladin_chestplate", () -> new HallowedPaladinArmor(NightSoulsArmorTier.HALLOWED_PALADIN, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HALLOWED_PALADIN_LEGGINGS = ITEMS.register("hallowed_paladin_leggings", () -> new HallowedPaladinArmor(NightSoulsArmorTier.HALLOWED_PALADIN, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HALLOWED_PALADIN_BOOTS = ITEMS.register("hallowed_paladin_boots", () -> new HallowedPaladinArmor(NightSoulsArmorTier.HALLOWED_PALADIN, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HELLFIRE_EMPEROR_HELMET = ITEMS.register("hellfire_emperor_helmet", () -> new HellfireEmperorArmor(NightSoulsArmorTier.HELLFIRE_EMPEROR, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HELLFIRE_EMPEROR_CHESTPLATE = ITEMS.register("hellfire_emperor_chestplate", () -> new HellfireEmperorArmor(NightSoulsArmorTier.HELLFIRE_EMPEROR, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HELLFIRE_EMPEROR_LEGGINGS = ITEMS.register("hellfire_emperor_leggings", () -> new HellfireEmperorArmor(NightSoulsArmorTier.HELLFIRE_EMPEROR, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> HELLFIRE_EMPEROR_BOOTS = ITEMS.register("hellfire_emperor_boots", () -> new HellfireEmperorArmor(NightSoulsArmorTier.HELLFIRE_EMPEROR, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MILKY_WAY_HELMET = ITEMS.register("milky_way_helmet", () -> new MilkyWayArmor(NightSoulsArmorTier.MILKY_WAY, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MILKY_WAY_CHESTPLATE = ITEMS.register("milky_way_chestplate", () -> new MilkyWayArmor(NightSoulsArmorTier.MILKY_WAY, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MILKY_WAY_LEGGINGS = ITEMS.register("milky_way_leggings", () -> new MilkyWayArmor(NightSoulsArmorTier.MILKY_WAY, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> MILKY_WAY_BOOTS = ITEMS.register("milky_way_boots", () -> new MilkyWayArmor(NightSoulsArmorTier.MILKY_WAY, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> STAR_BIT = ITEMS.register("star_bit", () -> new StarBit(new Item.Properties().group(NightSoulsItemGroup.instance).food(new Food.Builder().hunger(4).saturation(1.6F).fastToEat().setAlwaysEdible().build())));
	public static final RegistryObject<ArmorItem> BINARY_HELMET = ITEMS.register("binary_helmet", () -> new BinaryArmor(NightSoulsArmorTier.BINARY, EquipmentSlotType.HEAD, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BINARY_CHESTPLATE = ITEMS.register("binary_chestplate", () -> new BinaryArmor(NightSoulsArmorTier.BINARY, EquipmentSlotType.CHEST, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BINARY_LEGGINGS = ITEMS.register("binary_leggings", () -> new BinaryArmor(NightSoulsArmorTier.BINARY, EquipmentSlotType.LEGS, new Item.Properties().group(NightSoulsItemGroup.instance)));
    public static final RegistryObject<ArmorItem> BINARY_BOOTS = ITEMS.register("binary_boots", () -> new BinaryArmor(NightSoulsArmorTier.BINARY, EquipmentSlotType.FEET, new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> SAITASTONE_SEEDS = ITEMS.register("saitastone_seeds", () -> new SaitastoneSeeds(BlockInit.SAITASTONE_CROPS.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> MIIZEALITE_SEEDS = ITEMS.register("miizealite_seeds", () -> new MiizealiteSeeds(BlockInit.MIIZEALITE_CROPS.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> CRANITE_SEEDS = ITEMS.register("cranite_seeds", () -> new CraniteSeeds(BlockInit.CRANITE_CROPS.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BASTIRITE_SEEDS = ITEMS.register("bastirite_seeds", () -> new BastiriteSeeds(BlockInit.BASTIRITE_CROPS.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> SAITASTONE_CHUNK = ITEMS.register("saitastone_chunk", () -> new NightSoulsOreChunk(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> MIIZEALITE_CHUNK = ITEMS.register("miizealite_chunk", () -> new NightSoulsOreChunk(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> CRANITE_CHUNK = ITEMS.register("cranite_chunk", () -> new NightSoulsOreChunk(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BASTIRITE_CHUNK = ITEMS.register("bastirite_chunk", () -> new NightSoulsOreChunk(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> BLANK_MUSIC_DISC = ITEMS.register("blank_music_disc", () -> new BlankMusicDisc(new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<Item> CELESITAL_EMERALD = ITEMS.register("celestial_emerald", () -> new CelestialEmerald(new Item.Properties().group(NightSoulsItemGroup.instance)));

    
	public static final RegistryObject<Item> SAITAQUACK_SOUL = ITEMS.register("saitaquack_soul", () -> new SaitaquackSoul(new Item.Properties().group(PlayerSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> MIIZEAL_SOUL = ITEMS.register("miizeal_soul", () -> new MiizealSoul(new Item.Properties().group(PlayerSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> KRAHNE_SOUL = ITEMS.register("krahne_soul", () -> new KrahneSoul(new Item.Properties().group(PlayerSoulsItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<Item> BASTIIO_SOUL = ITEMS.register("bastiio_soul", () -> new BastiioSoul(new Item.Properties().group(PlayerSoulsItemGroup.instance).maxStackSize(1)));
	
	
	public static final RegistryObject<Item> MARIO_GALAXY_SKY_STATION_MUSIC_DISC = ITEMS.register("mario_galaxy_sky_station_music_disc", () -> new MarioGalaxySkyStationMusicDisc(1, SoundInit.MARIO_GALAXY_SKY_STATION.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));
	public static final RegistryObject<Item> MARIO_GALAXY_CREDITS_MUSIC_DISC = ITEMS.register("mario_galaxy_credits_music_disc", () -> new MarioGalaxyCreditsMusicDisc(1, SoundInit.MARIO_GALAXY_CREDITS.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));
	public static final RegistryObject<Item> HOPES_AND_DREAMS_MUSIC_DISC = ITEMS.register("hopes_and_dreams_music_disc", () -> new HopesAndDreamsMusicDisc(1, SoundInit.HOPES_AND_DREAMS.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));
	public static final RegistryObject<Item> TOTO_AFRICA_MUSIC_DISC = ITEMS.register("toto_africa_music_disc", () -> new TotoAfricaMusicDisc(1, SoundInit.TOTO_AFRICA.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));
	public static final RegistryObject<Item> KIRA_MUSIC_DISC = ITEMS.register("kira_music_disc", () -> new KiraMusicDisc(1, SoundInit.KIRA.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));
	public static final RegistryObject<Item> NOUNOURS_MUSIC_DISC = ITEMS.register("nounours_music_disc", () -> new NounoursMusicDisc(1, SoundInit.NOUNOURS.get(), new Item.Properties().maxStackSize(1).group(NightSoulsDiscsItemGroup.instance)));


	public static final RegistryObject<BlockItem> SAITASTONE_BLOCK = ITEMS.register("saitastone_block", () -> new NightSoulsOreBlock(BlockInit.SAITASTONE_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> MIIZEALITE_BLOCK = ITEMS.register("miizealite_block", () -> new NightSoulsOreBlock(BlockInit.MIIZEALITE_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> CRANITE_BLOCK = ITEMS.register("cranite_block", () -> new NightSoulsOreBlock(BlockInit.CRANITE_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> BASTIRITE_BLOCK = ITEMS.register("bastirite_block", () -> new NightSoulsOreBlock(BlockInit.BASTIRITE_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> SAITASTONE_ORE = ITEMS.register("saitastone_ore", () -> new NightSoulsOre(BlockInit.SAITASTONE_ORE.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> MIIZEALITE_ORE = ITEMS.register("miizealite_ore", () -> new NightSoulsOre(BlockInit.MIIZEALITE_ORE.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> NETHER_MIIZEALITE_ORE = ITEMS.register("nether_miizealite_ore", () -> new NightSoulsOre(BlockInit.NETHER_MIIZEALITE_ORE.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> CRANITE_ORE = ITEMS.register("cranite_ore", () -> new NightSoulsOre(BlockInit.CRANITE_ORE.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> BASTIRITE_ORE = ITEMS.register("bastirite_ore", () -> new NightSoulsOre(BlockInit.BASTIRITE_ORE.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> UNDERGROUND_HEART_CRYSTAL = ITEMS.register("underground_heart_crystal", () -> new NightSoulsOre(BlockInit.UNDERGROUND_HEART_CRYSTAL.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> TRAPPED_TRUE_NIGHT_SOUL = ITEMS.register("trapped_true_night_soul", () -> new TrappedTrueNightSoul(BlockInit.TRAPPED_TRUE_NIGHT_SOUL.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> NIGHTSOULS_LUCKY_BLOCK = ITEMS.register("nightsouls_lucky_block", () -> new NightSoulsLuckyBlock(BlockInit.NIGHTSOULS_LUCKY_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));
	public static final RegistryObject<BlockItem> CELESTIAL_EMERALD_BLOCK = ITEMS.register("celestial_emerald_block", () -> new CelestialEmeraldBlockItem(BlockInit.CELESTIAL_EMERALD_BLOCK.get(), new Item.Properties().group(NightSoulsItemGroup.instance)));

}
