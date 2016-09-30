package com.runemagic.forge.init;

import com.runemagic.forge.mods.Main;
import com.runemagic.forge.mods.Reference;
import com.runemagic.forge.mods.ModItems.RuneEssence;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item runeEssence;
	
	public static void init(){
		runeEssence =  new RuneEssence();
	}
	
	public static void register(){
		GameRegistry.register(runeEssence);
	}
	
	public static void registerRenders(){
		registerRender(runeEssence);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));

	}
}
