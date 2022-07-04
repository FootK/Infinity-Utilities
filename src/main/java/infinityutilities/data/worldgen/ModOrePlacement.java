package infinityutilities.data.worldgen;

import infinityutilities.config.OreGenConf;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement
{
    public static final List ORE_VIBRANIUM_PLACED_FEATURE = commonOrePlacement(OreGenConf.vibraniumPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenConf.vibraniumMinHeight.get()), VerticalAnchor.absolute(OreGenConf.vibraniumMaxHeight.get())));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }


}
