package infinityutilities.init;

import infinityutilities.infinityutilities;
import infinityutilities.items.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, infinityutilities.MOD_ID);


    public static final RegistryObject<Item> POWERSTONE = ITEMS.register("powerstone",
            () -> new Powerstone(MTier.POWERSTONE, -1, 0F,
                    new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TIMESTONE = ITEMS.register("timestone",
            () -> new Timestone(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soulstone",
            () -> new Soulstone(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> REALITYSTONE = ITEMS.register("realitystone",
            () -> new Realitystone(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SPACESTONE = ITEMS.register("spacestone",
            () -> new Spacestone(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> MINDSTONE = ITEMS.register("mindstone",
            () -> new Mindstone(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> INFINITYGAUNTLET = ITEMS.register("infinitygauntlet",
            () -> new InfinityGauntlet(MTier.INFINITYGAUNTLET, -1, -2.4F,
                    new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).rarity(Rarity.RARE)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}