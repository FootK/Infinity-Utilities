package infinityutilities.data.worldgen;

import infinityutilities.infinityutilities;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class Ore_RL {

    private static String MODID = infinityutilities.MOD_ID;

    public static final String VIBRANIUM_ORE_FEATURE_ID = "ore_vibranium";

    public static final ResourceLocation VIBRANIUM_ORE_RL = new ResourceLocation(MODID, Ore_RL.VIBRANIUM_ORE_FEATURE_ID);


    public static final  ResourceKey<PlacedFeature> VIBRANIUM_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, VIBRANIUM_ORE_RL);

}

