package infinityutilities.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class InfinityGauntlet extends SwordItem {
    public InfinityGauntlet(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        Multimap<Attribute, AttributeModifier> attributes = HashMultimap.create();
        attributes.put(Attributes.MAX_HEALTH,
                new AttributeModifier("soulstone", 25, AttributeModifier.Operation.MULTIPLY_TOTAL));

        attributes.put(Attributes.ATTACK_DAMAGE,
                new AttributeModifier("powerstone", 3000, AttributeModifier.Operation.ADDITION));
        return attributes;
    }

    @Override
    public void inventoryTick(ItemStack item, Level world, Entity entity, int itemSlot, boolean isSelected) {
        LivingEntity player = (LivingEntity) entity;
        float healthAmount = player.getHealth() + 2;
        if (isSelected == true) {
            player.setHealth(healthAmount);
        }
        super.inventoryTick(item, world, entity, itemSlot, isSelected);
    }
}
