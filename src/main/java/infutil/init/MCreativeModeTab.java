package infutil.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MCreativeModeTab {
    public static final CreativeModeTab INFINITYUTILITIES = new CreativeModeTab("infutil") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MItems.POWERSTONE.get());
        }
    };
}
