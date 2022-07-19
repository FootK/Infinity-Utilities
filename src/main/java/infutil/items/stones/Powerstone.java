package infutil.items.stones;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;




public class Powerstone extends SwordItem {
    public Powerstone(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }


    @Override
    public void inventoryTick(ItemStack item, Level world, Entity entity, int itemSlot, boolean isSelected) {
        LivingEntity player = (LivingEntity) entity;
        double healthAmount = player.getHealth() - player.getMaxHealth() + 18;
        if (isSelected == true && world.getGameTime() % 5 == 0 && player.isInvulnerable() == false) {
            player.setHealth((float)healthAmount);
        }
        super.inventoryTick(item, world, entity, itemSlot, isSelected);
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}