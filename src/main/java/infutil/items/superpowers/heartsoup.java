package infutil.items.superpowers;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import infutil.infutil;
import infutil.init.MCreativeModeTab;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;

import javax.annotation.Nonnull;
import java.util.UUID;

public class heartsoup extends Item {
    public heartsoup() {
        super(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).defaultDurability(0));
    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundTag unused) {
        return CurioItemCapability.createProvider(new ICurio() {
            @Override
            public void curioTick(SlotContext slotContext) {
                LivingEntity livingEntity = slotContext.entity();
                Player player = (Player) slotContext.entity();
                System.out.println(player.getFoodData().getFoodLevel());

                if (!livingEntity.level.isClientSide() && livingEntity.tickCount % 10 == 0 && player.getFoodData().getFoodLevel() <= 10) {
                    livingEntity.heal(2F);
                }
            }

            @Override
            public ItemStack getStack() {
                return stack;
            }

            @Override
            public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid) {
                Multimap<Attribute, AttributeModifier> atts = LinkedHashMultimap.create();
                atts.put(Attributes.MOVEMENT_SPEED,
                        new AttributeModifier(uuid, infutil.MOD_ID + ":speed_bonus", 0.3,
                                AttributeModifier.Operation.MULTIPLY_TOTAL));
                atts.put(Attributes.ARMOR,
                        new AttributeModifier(uuid, infutil.MOD_ID + ":armor_bonus", 6,
                                AttributeModifier.Operation.ADDITION));
                atts.put(Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(uuid, infutil.MOD_ID + ":attack_damage", 10,
                                AttributeModifier.Operation.ADDITION));
                atts.put(Attributes.KNOCKBACK_RESISTANCE,
                        new AttributeModifier(uuid, infutil.MOD_ID + ":knockback_resist", 0.2,
                                AttributeModifier.Operation.ADDITION));
                atts.put(Attributes.MAX_HEALTH,
                        new AttributeModifier(uuid, infutil.MOD_ID + ":max_health", 20,
                                AttributeModifier.Operation.ADDITION));
                CuriosApi.getCuriosHelper();
                return atts;
            }

            @Nonnull
            @Override
            public SoundInfo getEquipSound(SlotContext slotContext) {
                return new SoundInfo(SoundEvents.FLOWERING_AZALEA_BREAK, 1.0f, 1.0f);
            }

            @Override
            public boolean canEquipFromUse(SlotContext slot) {
                return true;
            }
        });
    }
}
