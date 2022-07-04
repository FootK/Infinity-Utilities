package infinityutilities.data.tags;

import infinityutilities.blocks.MBlocks;
import infinityutilities.infinityutilities;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Predicate;

public class BlockTagGenerator extends BlockTagsProvider
{
    protected final Predicate<Block> ORE_BLOCKS = registry -> infinityutilities.MOD_ID.equals(registry.asItem().toString());

    public static final TagKey<Block> ORES_VIBRANIUM = tagForge("ores/vibranium");

    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
        super(generator, infinityutilities.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                MBlocks.VIBRANIUM_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                MBlocks.VIBRANIUM_ORE.get());

        this.tag(BlockTags.WITHER_IMMUNE).add(
                MBlocks.VIBRANIUM_ORE.get());
    }


    private static TagKey<Block> tagForge(String name)
    {
        return BlockTags.create(new ResourceLocation("forge", name));
    }
}
