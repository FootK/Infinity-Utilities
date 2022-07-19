package infutil.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MTier {
    public static final ForgeTier POWERSTONE = new ForgeTier(2, -1, 1.5f,
            2500F, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(MItems.POWERSTONE.get()));
    public static final ForgeTier INFINITYGAUNTLET = new ForgeTier(2, -1, 1.5f,
            100F, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(MItems.INFINITYGAUNTLET.get()));

    public static final ForgeTier BLOODFORTHEBLOODGOD = new ForgeTier(2, -1, -2.4f,
            2147483646F, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(MItems.PIGSWORD.get()));
}
