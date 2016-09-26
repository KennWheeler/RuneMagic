package com.runemagic.forge.mods.ModBlocks;

import java.util.Random;

import com.runemagic.forge.mods.Main;
import com.runemagic.forge.mods.ModItems.RuneEssence;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RuneEssenceBlock extends Block {
	public RuneEssenceBlock(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}

	private final String name = "runeEssenceBlock";
	public static Block runeEssenceBlock;
	
	
	public static void init(){
		runeEssenceBlock = new ModBlock(Material.ROCK).setUnlocalizedName("runeEssenceBlock").setCreativeTab(Main.runeMagicTab);
	}
	
	public static void register(){
		GameRegistry.registerBlock(runeEssenceBlock, runeEssenceBlock.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(runeEssenceBlock);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

	}
	
	public String getName(){
		return name;
	}
	
	public Item getItemDropped(IBlockState state, Random random, int i2){
		return RuneEssence.runeEssence;
	}
	
	public int quantityDropped(Random random){
		return random.nextInt(2)+3;
	}
}
