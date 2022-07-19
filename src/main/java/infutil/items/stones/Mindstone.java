package infutil.items.stones;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Mindstone extends Item {
    public Mindstone(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
