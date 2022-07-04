package infinityutilities.event;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LivingHurtEvent extends LivingEvent {
    public LivingHurtEvent(LivingEntity entity, DamageSource source, float amount) {

        super(entity);
        if (entity.getHealth() - amount < 1 && source != source.OUT_OF_WORLD)  {
            setCanceled(true);
            entity.setHealth(entity.getMaxHealth());
        }
    }
}
