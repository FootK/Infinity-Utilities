package infutil.items.stones;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;


public class Soulstone extends Item {
    public Soulstone(Properties Properties) {
        super(new Properties());
    }
    //public static boolean isSelected;

    //@Override
    //public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
    //    super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    //    isSelected = pIsSelected;
    //}
//
    //public static float onLivingHurt(LivingEntity entity) {
    //LivingHurtEvent event = LivingHurtEvent;
    //DamageSource source = event.getSource();
    //float amount = event.getAmount();
//
    //if (entity.getHealth() - amount < 1 && source != source.OUT_OF_WORLD && isSelected) {
    //    event.setCanceled(true);
    //    entity.setHealth(entity.getMaxHealth());
    //}
    //return 1;
//
    //}


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}