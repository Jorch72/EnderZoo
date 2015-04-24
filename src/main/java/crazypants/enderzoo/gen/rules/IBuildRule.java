package crazypants.enderzoo.gen.rules;

import java.util.Random;

import net.minecraft.world.World;
import crazypants.enderzoo.gen.WorldStructures;
import crazypants.enderzoo.gen.structure.StructureTemplate;
import crazypants.enderzoo.vec.Point3i;

public interface IBuildRule {

  boolean isValidChunk(StructureTemplate template, WorldStructures structures, World world, Random random, int chunkX, int chunkZ);

  boolean isValidLocation(Point3i loc, StructureTemplate template, WorldStructures structures, World world, Random random, int chunkX, int chunkZ);

}