package infinityutilities.data.worldgen.biomemodifier;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import infinityutilities.data.worldgen.Ore_RL;
import infinityutilities.infinityutilities;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class BiomeModifierGenerator
{
    private static String MOD_ID = infinityutilities.MOD_ID;

    public static void onGatherData(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        final HolderSet.Named<Biome> savannaTag = new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_SAVANNA);

        final BiomeModifier addVibraniumOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                savannaTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, Ore_RL.VIBRANIUM_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MOD_ID, ops, ForgeRegistries.Keys.BIOME_MODIFIERS, Map.of(
                        Ore_RL.VIBRANIUM_ORE_RL, addVibraniumOre)));
    }
}
