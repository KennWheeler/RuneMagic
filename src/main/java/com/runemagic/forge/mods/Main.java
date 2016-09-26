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
	
	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static Block runeEssenceBlock;
	public static Item runeEssence;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		RuneEssence.init();
		RuneEssence.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		runeEssenceBlock = new RuneEssenceBlock();
		GameRegistry.registerBlock(runeEssenceBlock, "runeEssenceBlock");
		
/*		runeEssence = new RuneEssence();
		GameRegistry.registerItem(runeEssence, "runeEssence");*/
		
		//MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}

/*	@EventHandler
public void preInit(FMLPreInitializationEvent event){
	
	Item runeEssenceBlock = GameRegistry.findItem("runemagic", "runeEssenceBlock");
	ModelResourceLocation runeEssenceBlockModel = new ModelResourceLocation("runemagic:runeEssenceBlock", "inventory");
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(runeEssenceBlock, 0, runeEssenceBlockModel);
	
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(runeEssence, 0, new ModelResourceLocation(MODID+":"+"runeEssence", "inventory"));
	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	
			Item runeEssence = GameRegistry.findItem("runemagic", "runeEssence");
	ModelResourceLocation runeEssenceModel = new ModelResourceLocation("runemagic:runeEssence", "inventory");
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(runeEssence, 0, runeEssenceBlockModel);
}*/