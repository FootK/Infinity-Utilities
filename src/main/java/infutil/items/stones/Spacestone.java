package infutil.items.stones;

import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Map;

public class Spacestone extends Item {
    public Spacestone(Properties properties) {
        super(properties);
    }

    private final Map<ResourceKey<Level>, ServerLevel> levels = Maps.newLinkedHashMap();
    @Nullable
    public ServerLevel getLevel(ResourceKey<Level> pDimension) {
        return this.levels.get(pDimension);
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand, ServerPlayer serverPlayer) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!(world instanceof ServerLevel serverWorld)) {
            return InteractionResultHolder.pass(itemstack);
        }

        return InteractionResultHolder.pass(itemstack);
    }

    //public static <T> ResourceKey<T> create(ResourceKey<? extends Registry<T>> pRegistryKey, ResourceLocation pLocation) {
    //    return create(pRegistryKey.location, pLocation);
    //}

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
