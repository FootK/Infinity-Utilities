package infinityutilities.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class Soulstone extends Item {
    public Soulstone(Properties p_41383_) {
        super(p_41383_);
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}