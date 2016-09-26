package com.runemagic.forge.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiExample extends Gui {

	String text = "Hello, World!";
	
	public GuiExample(Minecraft mc){
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		drawCenteredString(mc.fontRendererObj, text, width / 2, (height / 2) - 4, Integer.parseInt("FF0000", 16));
	}
	
}
