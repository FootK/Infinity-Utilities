package infinityutilities.data.worldgen.placedfeatures;

import infinityutilities.data.worldgen.ModOrePlacement;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import infinityutilities.data.worldgen.Ore_RL;
import infinityutilities.infinityutilities;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.Map;


public class PlacedFeatureGenerator
{
    private static String MODID = infinityutilities.MOD_ID;

    public static void onGatherData(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        final Holder<ConfiguredFeature<?,?>> configuredVibraniumFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, Ore_RL.VIBRANIUM_ORE_KEY.location()));

        final PlacedFeature vibraniumOreFeature = new PlacedFeature(configuredVibraniumFeatureHolder, ModOrePlacement.ORE_VIBRANIUM_PLACED_FEATURE);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, Registry.PLACED_FEATURE_REGISTRY, Map.of(
                        Ore_RL.VIBRANIUM_ORE_RL, vibraniumOreFeature)));

    }
}
