package com.runemagic.forge.mods.proxy;

import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;
import com.runemagic.forge.mods.ModItems.RuneEssence;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders(){
		RuneEssenceBlock.registerRenders();
		RuneEssence.registerRenders();
	}
}
