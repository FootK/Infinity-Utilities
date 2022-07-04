package infinityutilities.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConf {
    public static ForgeConfigSpec.IntValue vibraniumVeinSize;
    public static ForgeConfigSpec.IntValue vibraniumPerChunk;
    public static ForgeConfigSpec.IntValue vibraniumMinHeight;
    public static ForgeConfigSpec.IntValue vibraniumMaxHeight;


    public static ForgeConfigSpec.BooleanValue vibraniumGeneration;



    public static void Init(ForgeConfigSpec.Builder builder) {

        //vibranium Ore Values
        vibraniumVeinSize = builder
                .comment("Set Max vibranium Vein Size (Default = 15)")
                .defineInRange("ore_generation.vibranium.vibraniumVeinSize", 15, 0, 36);

        vibraniumPerChunk = builder
                .comment("Set vibranium Spawn Chance (Default = 1)")
                .defineInRange("ore_generation.vibranium.vibraniumChance", 16, 0, 32);

        vibraniumMinHeight = builder
                .comment("Set vibranium Min Spawn Height (Default = 30)")
                .defineInRange("ore_generation.vibranium.vibraniumMinHeight", 30, -63, 319);

        vibraniumMaxHeight = builder
                .comment("Set vibranium Max Spawn Height (Default = 100)")
                .defineInRange("ore_generation.vibranium.vibraniumMaxHeight", 100, -63, 319);
    }
}
