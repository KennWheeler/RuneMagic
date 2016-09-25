package com.runemagic.forge.mods.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RuneEssenceBlock extends Block {
	public RuneEssenceBlock() {
		super(Material.IRON);
		this.setUnlocalizedName("runeEssenceBlock");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setLightLevel(0.2F);
	}

}
