package net.cebularz.amethystextra.item;

import net.cebularz.amethystextra.AmethystExtra;
import net.cebularz.amethystextra.item.custom.AmethystArrowItem;
import net.cebularz.amethystextra.item.custom.AmethystEnderPearlItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, AmethystExtra.MOD_ID);

    public static final DeferredHolder<Item, Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().food(ModFoods.AMETHYST_APPLE)));
    public static final DeferredHolder<Item, Item> AMETHYST_CARROT = ITEMS.register("amethyst_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.AMETHYST_CARROT)));
    public static final DeferredHolder<Item, Item> AMETHYST_ARROW = ITEMS.register("amethyst_arrow",
            () -> new AmethystArrowItem(new Item.Properties()));
    public static final DeferredHolder<Item, Item> AMETHYST_ENDER_PEARL = ITEMS.register("amethyst_ender_pearl",
            () -> new AmethystEnderPearlItem(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
