package com.runemagic.forge.mods;

import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;
import com.runemagic.forge.mods.ModItems.RuneEssence;
import com.runemagic.forge.mods.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)

public class Main {
	public static final String MODID = "runemagic";
	public static final String VERSION = "0.0.1";
	public static final String CLIENT_PROXY_CLASS = "com.runemagic.forge.mods.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.runemagic.forge.mods.proxy.CommonProxy";
//	public static Block runeEssenceBlock;
//	public static Item runeEssence;
	public static final RuneMagicTab runeMagicTab = new RuneMagicTab("runeMagicTab");
	
	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		RuneEssenceBlock.init();
		RuneEssenceBlock.register();
		RuneEssence.init();
		RuneEssence.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		GameRegistry.registerWorldGenerator(new WorldGen(),  0);
		//MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
