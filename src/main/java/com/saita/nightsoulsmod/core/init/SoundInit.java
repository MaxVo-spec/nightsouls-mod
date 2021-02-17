package com.saita.nightsoulsmod.core.init;

import com.saita.nightsoulsmod.NightSoulsMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
	
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, NightSoulsMod.MOD_ID);
	
	public static final RegistryObject<SoundEvent> SUPER_STAR = SOUNDS.register("super_star", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "super_star")));
	
	public static final RegistryObject<SoundEvent> MOLTEN_CORE = SOUNDS.register("molten_core", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "molten_core")));
	
	public static final RegistryObject<SoundEvent> WRAITH_FORM = SOUNDS.register("wraith_form", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "wraith_form")));
	
	public static final RegistryObject<SoundEvent> TAKE_A_BREATHER = SOUNDS.register("take_a_breather", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "take_a_breather")));
	
	public static final RegistryObject<SoundEvent> AMP_IT_UP = SOUNDS.register("amp_it_up", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "amp_it_up")));
	
	public static final RegistryObject<SoundEvent> LIFE_CRYSTAL = SOUNDS.register("life_crystal", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "life_crystal")));
	
	public static final RegistryObject<SoundEvent> SALUT = SOUNDS.register("salut", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "salut")));
	
	public static final RegistryObject<SoundEvent> MAGIC_MIRROR = SOUNDS.register("magic_mirror", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "magic_mirror")));
	
	public static final RegistryObject<SoundEvent> STAR_BIT = SOUNDS.register("star_bit", () -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "star_bit")));
	
	//Musiques
	
	public static final Lazy<SoundEvent> MARIO_GALAXY_SKY_STATION = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mario_galaxy_sky_station")));
	
	public static final Lazy<SoundEvent> MARIO_GALAXY_CREDITS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "mario_galaxy_credits")));
	
	public static final Lazy<SoundEvent> HOPES_AND_DREAMS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "hopes_and_dreams")));
	
	public static final Lazy<SoundEvent> TOTO_AFRICA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "toto_africa")));
	
	public static final Lazy<SoundEvent> KIRA = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "kira")));
	
	public static final Lazy<SoundEvent> NOUNOURS = Lazy.of(() -> new SoundEvent
			(new ResourceLocation(NightSoulsMod.MOD_ID, "nounours")));
	

}
