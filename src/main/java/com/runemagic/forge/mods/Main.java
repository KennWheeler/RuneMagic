package com.runemagic.forge.mods;


import com.runemagic.forge.init.ModItems;
import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;
import com.runemagic.forge.mods.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)

public class Main {
	@Instance
	public static Main instance;
	
	public static final RuneMagicTab runeMagicTab = new RuneMagicTab("runeMagicTab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		RuneEssenceBlock.init();
		RuneEssenceBlock.register();
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		GameRegistry.registerWorldGenerator(new WorldGen(),  0);
		//MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
