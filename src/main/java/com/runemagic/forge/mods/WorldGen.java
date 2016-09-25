package com.runemagic.forge.mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()){
		case 0: //Overworld
			this.generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		case -1: //Nether
			
			break;
		case 1: //End
			
			break;	
		default:		
		}
	}
	
	
	private void generateEnd(World world,Random random, int x, int z){
		
	}
	
	private void generateSurface(World world,Random random, int x, int z){
		this.addBlockSpawn(Main.runeEssenceBlock.getDefaultState(), world, random, x, z, 16, 16, 16, 128, 15, 160 );
	}
	
	private void generateNether(World world,Random random, int x, int z){
		
	}
	
	public void addBlockSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
		for(int i = 0; i < chancesToSpawn; i++){
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(maxY -minY);
		int posZ = blockZPos + random.nextInt(maxZ);
		new WorldGenMinable(block, maxVeinSize).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}