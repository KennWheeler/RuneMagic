package com.runemagic.forge.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RuneEssence extends Block {
	public RuneEssence() {
		super(Material.IRON);
		this.setUnlocalizedName("runeEssence");
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setResistance(5.0F);
		this.setHardness(2.0F);
		this.setLightLevel(0.2F);
	}

}
