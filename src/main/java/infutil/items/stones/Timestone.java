package infutil.items.stones;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class Timestone extends Item {
    public Timestone(Properties p_41383_) {
        super(p_41383_);
    }


    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!(world instanceof ServerLevel serverWorld)) {
            return InteractionResultHolder.pass(itemstack);
        }

        if (serverWorld.dimensionType().hasFixedTime()) {
            return InteractionResultHolder.pass(itemstack);
        }

        serverWorld.setDayTime(world.getDayTime() + 200);
        return InteractionResultHolder.consume(itemstack);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
