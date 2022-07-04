package infinityutilities.data.worldgen;

import infinityutilities.data.worldgen.biomemodifier.BiomeModifierGenerator;
import infinityutilities.data.worldgen.configuredfeatures.ConfiguredFeatureGenerator;
import infinityutilities.data.worldgen.placedfeatures.PlacedFeatureGenerator;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class WorldDataGenerator
{
    public static void generateWorldData(GatherDataEvent event)
    {
        ConfiguredFeatureGenerator.onGatherData(event);
        PlacedFeatureGenerator.onGatherData(event);
        BiomeModifierGenerator.onGatherData(event);
    }
}
