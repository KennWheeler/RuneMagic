package com.runemagic.forge.mods;

import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)

public class Main {
	public static final String MODID = "RuneMagic";
	public static final String VERSION = "0.0.1";
	public static Block runeEssenceBlock;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		runeEssenceBlock = new RuneEssenceBlock();
		GameRegistry.registerBlock(runeEssenceBlock, "runeEssenceBlock");
	}
}