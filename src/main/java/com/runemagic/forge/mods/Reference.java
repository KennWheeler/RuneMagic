package com.runemagic.forge.mods;

public class Reference {
	public static final String MODID = "runemagic";
	public static final String VERSION = "0.0.1";
	public static final String MOD_NAME = "Rune Magic";
	
	public static final String CLIENT_PROXY_CLASS = "com.runemagic.forge.mods.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.runemagic.forge.mods.proxy.CommonProxy";

	public static enum RuneMagicItems {
		RUNEESSENCE("runeEssence", "RuneEssence");
		
		private String unlocalizedName;
		private String registryName;
		
		RuneMagicItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
