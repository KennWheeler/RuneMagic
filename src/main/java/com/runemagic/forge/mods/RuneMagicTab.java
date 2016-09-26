package com.runemagic.forge.mods;

import com.runemagic.forge.mods.ModItems.RuneEssence;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RuneMagicTab extends CreativeTabs{

	public RuneMagicTab(String label) {
		super(label);
		this.setBackgroundImageName("runemagic.png");
	}

	@Override
	public Item getTabIconItem() {
		return RuneEssence.runeEssence;
	}

}
