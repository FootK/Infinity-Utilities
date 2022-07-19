package infutil.init;

import infutil.infutil;
import infutil.items.*;
import infutil.items.stones.*;
import infutil.items.superpowers.heartsoup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, infutil.MOD_ID);

    public static final RegistryObject<Item> PIGSWORD = ITEMS.register("pigsword",
            () -> new PigSword(MTier.BLOODFORTHEBLOODGOD, 0, -2.4F,
                    new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).rarity(Rarity.EPIC)));

// Infinity Stone stuff
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

    public static final RegistryObject<Item> TESSERACT = ITEMS.register("tesseract",
            () -> new Tesseract(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> INFINITYGAUNTLET = ITEMS.register("infinitygauntlet",
            () -> new InfinityGauntlet(MTier.INFINITYGAUNTLET, -1, -2.4F,
                    new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES).rarity(Rarity.RARE)));


    public static final RegistryObject<Item> VIBRANIUM_SHARD = ITEMS.register("vibranium_shard",
            () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));

    public static final RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot",
            () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));

    // DNA
    public static final RegistryObject<Item> HUMAN_DNA = ITEMS.register("human_dna",
            () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));

        // Black panther
        public static final RegistryObject<Item> HEARTHERB = ITEMS.register("heartherb",
                () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));
        public static final RegistryObject<Item> HEARTSOUP = ITEMS.register("heartsoup", heartsoup::new);

        // Namor
        public static final RegistryObject<Item> ATLANTIAN_DNA = ITEMS.register("atlantian_dna",
                () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));
        public static final RegistryObject<Item> NAMOR_DNA = ITEMS.register("namor_dna",
                () -> new Item(new Item.Properties().tab(MCreativeModeTab.INFINITYUTILITIES)));
        public static final RegistryObject<Item> NAMORSOUP = ITEMS.register("namorsoup", heartsoup::new);




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}