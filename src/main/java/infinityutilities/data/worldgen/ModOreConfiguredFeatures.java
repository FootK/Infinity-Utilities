package infinityutilities.data.worldgen;

import infinityutilities.blocks.MBlocks;
import infinityutilities.config.OreGenConf;
import net.minecraft.data.worldgen.features.OreFeatures;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public class ModOreConfiguredFeatures
{
    public static OreConfiguration ORE_VIBRANIUM_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.STONE_ORE_REPLACEABLES, MBlocks.VIBRANIUM_ORE.get().defaultBlockState(),
                    OreGenConf.vibraniumVeinSize.get());
}
