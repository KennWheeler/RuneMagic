package com.runemagic.forge.mods.proxy;

import com.runemagic.forge.init.ModItems;
import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init(){
		ModItems.registerRenders();

	}
	public void registerRenders(){
		RuneEssenceBlock.registerRenders();
	}
}
