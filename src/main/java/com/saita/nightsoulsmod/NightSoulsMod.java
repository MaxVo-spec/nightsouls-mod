package com.saita.nightsoulsmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.saita.nightsoulsmod.common.world.*;
import com.saita.nightsoulsmod.core.init.*;


@Mod(NightSoulsMod.MOD_ID)
public class NightSoulsMod
{
	public static final String MOD_ID = "nightsouls";
    public static final Logger LOGGER = LogManager.getLogger();

    public NightSoulsMod() {
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		SoundInit.SOUNDS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	LOGGER.info("Hello from NightSouls Mod 0.2!");
    	LOGGER.info("Loading Saita's powers...");
    	LOGGER.info("Loading Miizeal's reign...");
    	LOGGER.info("Loading Crane's might...");
    	LOGGER.info("Loading Basti's script...");
    	OreGen.generateOres();
    	StructureInit.addToBiomes();
    	    	
    }
       
    public static class NightSoulsItemGroup extends ItemGroup
    {
    	public static final NightSoulsItemGroup instance = new NightSoulsItemGroup(ItemGroup.GROUPS.length, "NightSoulsTab");
    	private NightSoulsItemGroup (int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.NIGHT_SOUL.get());
    	}
    }
    
    
    public static class PlayerSoulsItemGroup extends ItemGroup
    {
    	public static final PlayerSoulsItemGroup instance = new PlayerSoulsItemGroup(ItemGroup.GROUPS.length, "PlayerSoulsTab");
    	private PlayerSoulsItemGroup (int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.MIIZEAL_SOUL.get());
    	}
    }
    
    public static class NightSoulsDiscsItemGroup extends ItemGroup
    {
    	public static final NightSoulsDiscsItemGroup instance = new NightSoulsDiscsItemGroup(ItemGroup.GROUPS.length, "NightSoulsDiscsTab");
    	private NightSoulsDiscsItemGroup (int index, String label)
    	{
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.MARIO_GALAXY_SKY_STATION_MUSIC_DISC.get());
    	}
    }

}
