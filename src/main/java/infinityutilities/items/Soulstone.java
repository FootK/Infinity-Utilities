package infinityutilities.items;

import infinityutilities.event.LivingHurtEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class Soulstone extends Item {
    public Soulstone(Properties p_41383_) {
        super(p_41383_);
    }

    // Implement LivingHurtEvent
    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}