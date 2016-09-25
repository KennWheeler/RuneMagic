package com.runemagic.forge.mods;

import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;
import com.runemagic.forge.mods.ModItems.RuneEssence;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)

public class Main {
	public static final String MODID = "RuneMagic";
	public static final String VERSION = "0.0.1";
	
	public static Block runeEssenceBlock;
	public static Item runeEssence;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		runeEssenceBlock = new RuneEssenceBlock();
		GameRegistry.registerBlock(runeEssenceBlock, "runeEssenceBlock");
		
		runeEssence = new RuneEssence();
		GameRegistry.registerItem(runeEssence, "runeEssence");
		
		Item runeEssenceBlock = GameRegistry.findItem("runemagic", "runeEssenceBlock");
		ModelResourceLocation runeEssenceBlockModel = new ModelResourceLocation("runemagic:runeEssenceBlock", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(runeEssenceBlock, 0, runeEssenceBlockModel);
		
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}
}