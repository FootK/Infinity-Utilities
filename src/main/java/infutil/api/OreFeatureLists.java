package infutil.api;

import infutil.infutil;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class OreFeatureLists
{
    private static String MODID = infutil.MOD_ID;

    public static final String VIBRANIUM_LARGE_ORE_FEATURE_ID = "ore_vibranium_large";
    public static final String VIBRANIUM_SMALL_ORE_FEATURE_ID = "ore_vibranium_small";

    public static final ResourceLocation VIBRANIUM_LARGE_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.VIBRANIUM_LARGE_ORE_FEATURE_ID);
    public static final ResourceLocation VIBRANIUM_SMALL_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.VIBRANIUM_SMALL_ORE_FEATURE_ID);

    public static final  ResourceKey<PlacedFeature> VIBRANIUM_LARGE_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, VIBRANIUM_LARGE_ORE_RL);
    public static final  ResourceKey<PlacedFeature> VIBRANIUM_SMALL_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, VIBRANIUM_SMALL_ORE_RL);

}