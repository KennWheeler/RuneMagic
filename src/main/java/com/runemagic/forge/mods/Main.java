package com.runemagic.forge.mods;

import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;
import com.runemagic.forge.mods.ModItems.RuneEssence;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
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
	}
}