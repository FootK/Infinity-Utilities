package infinityutilities.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class Soulstone extends Item {
    public Soulstone(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        Multimap<Attribute, AttributeModifier> attributes = HashMultimap.create();
        attributes.put(Attributes.MAX_HEALTH,
                new AttributeModifier("soulstone", 20, AttributeModifier.Operation.MULTIPLY_TOTAL));
        return attributes;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
