package com.runemagic.forge.mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import com.runemagic.forge.mods.ModBlocks.RuneEssenceBlock;

public class WorldGen implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()){
		case 0: //Overworld
			
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
		this.addBlockSpawn(ModBlocks.RuneEssenceBlock, world, random, x, z, 16, 16, 12, 1, 0, 32 );
	}
	
	private void generateNether(World world,Random random, int x, int z){
		
	}
	
	public void addBlockSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
		for(int i = 0; i < chancesToSpawn; i++){
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(maxY -minY);
		int posZ = blockZPos + random.nextInt(maxZ);
		new WorldGenMinable((IBlockState) block, maxVeinSize).generate(world, random, new BlockPos(posX, posY, posZ));
		}
}