package com.re_she.mod.world;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;

import java.util.List;
import java.util.Random;

public class ChunkProviderPollute implements IChunkProvider {
    private Random rand;
    private NoiseGeneratorOctaves noiseGeneratorOctaves;
    private World worldObj;
    private WorldType field_147435_p;
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private BiomeGenBase[] biomesForGeneration;
    double[] genBuff;
    public ChunkProviderPollute(World worldObj, long seed)
    {
        this.worldObj = worldObj;
        this.field_147435_p = worldObj.getWorldInfo().getTerrainType();
        this.rand = new Random(seed);
        this.noiseGeneratorOctaves = new NoiseGeneratorOctaves(this.rand, 16);
        this.genBuff = new double[16*16];
    }
    public void generation(int x, int z, Block[] blocks)
    {
        this.genBuff = this.noiseGeneratorOctaves.generateNoiseOctaves(this.genBuff, x * 16, 0, z * 16, 16, 1, 16, 1000, 8000, 1000);
        int i = 0;
        for (double d : genBuff)
        {
            int by = (int) (60 + d / 8000);
            for (int in = 0; in < by; in++)
            {
                int bi = (i * 256) | in;
                if (in < 2)
                {
                    blocks[bi] = Blocks.bedrock;
                } else if (in >= by - 2)
                {
                    blocks[bi] = Blocks.dirt;
                } else {
                    blocks[bi] = Blocks.stone;
                }
            }
            int bi =(i * 256)| by;
            blocks[bi]=blocks[bi]=Blocks.grass;
            i++;
        }
    }
    public Chunk loadChunk(int p_73158_1_, int p_73158_2_)
    {
        return this.provideChunk(p_73158_1_, p_73158_2_);
    }
    public Chunk provideChunk(int x, int z)
    {
        this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
        Block[] ablock = new Block[65536];
        byte[] abyte = new byte[65536];
        this.generation(x, z, ablock);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, x * 16, z * 16, 16, 16);
        Chunk chunk = new Chunk(this.worldObj, ablock, abyte, x, z);
        byte[] abyte1 = chunk.getBiomeArray();
        for (int k = 0; k < abyte1.length; ++k)
        {
            abyte1[k] = (byte)this.biomesForGeneration[k].biomeID;
        }
        chunk.generateSkylightMap();
        return chunk;
    }


    public boolean chunkExists(int p_73149_1_, int p_73149_2_)
    {
        return true;
    }
    public void populate(IChunkProvider provider, int x, int z)
    {

    }
    public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_)
    {
        return true;
    }
    public void saveExtraData() {}
    public boolean unloadQueuedChunks()
    {
        return false;
    }
    public boolean canSave()
    {
        return true;
    }
    public String makeString()
    {
        return "RandomLevelSource";
    }
    public List getPossibleCreatures(EnumCreatureType p_73155_1_, int p_73155_2_, int p_73155_3_, int p_73155_4_)
    {
        BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(p_73155_2_, p_73155_4_);
        return p_73155_1_ == EnumCreatureType.monster && this.scatteredFeatureGenerator.func_143030_a(p_73155_2_, p_73155_3_, p_73155_4_) ? this.scatteredFeatureGenerator.getScatteredFeatureSpawnList() : biomegenbase.getSpawnableList(p_73155_1_);
    }

    @Override
    public ChunkPosition findClosestStructure(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_) {
        return null;
    }

    public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_)
    {
        return null;
    }
    public int getLoadedChunkCount()
    {
        return 0;
    }
    @Override
    public void recreateStructures(int p_82695_1_, int p_82695_2_) {

    }
}
