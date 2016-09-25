package com.runemagic.forge.mods.ModBlocks;

import java.util.Random;

import com.runemagic.forge.mods.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RuneEssenceBlock extends Block {
	public RuneEssenceBlock() {
		super(Material.IRON);
		this.setUnlocalizedName("runeEssenceBlock");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setLightLevel(0.2F);
	}
	
	public Item getItemDropped(IBlockState state, Random random, int i2){
		return Main.runeEssence;
	}
	
	public int quantityDropped(Random random){
		return random.nextInt(2)+3;
	}
}
