package infutil.items;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class PigSword extends SwordItem {

    public PigSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }


    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        Level level = pTarget.getLevel();
        DamageSource source = pTarget.getLastDamageSource();
        if (level instanceof ServerLevel serverWorld) {
            pTarget.die(source);
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
