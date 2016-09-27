package com.runemagic.forge.mods.ModItems;

import com.runemagic.forge.mods.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RuneEssence extends Item {
	public static Item runeEssence;
	public RuneEssence(){
		super();
	}

	public static void init(){
		runeEssence =  new Item().setUnlocalizedName("runeEssence").setCreativeTab(Main.runeMagicTab);
	}
	
	public static void register(){
		GameRegistry.registerItem(runeEssence, runeEssence.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(runeEssence);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
}
