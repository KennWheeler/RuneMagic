package com.runemagic.forge.mods;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)

public class Main {
	public static final String MODID = "RuneMagic";
	public static final String VERSION = "0.0.1";
	public static Block runeEssence;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		runeEssence = new RuneEssence();
		GameRegistry.registerBlock(runeEssence, "runeEssence");
	}
}
