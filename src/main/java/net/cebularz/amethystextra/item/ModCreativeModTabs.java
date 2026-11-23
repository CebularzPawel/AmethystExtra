package net.cebularz.amethystextra.item;


import net.cebularz.amethystextra.AmethystExtra;
import net.cebularz.amethystextra.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmethystExtra.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AMETHYST_TAB = CREATIVE_MODE_TABS.register("amethyst_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMETHYST_BRICKS.get()))
                    .title(Component.translatable("creativetab.amethyst_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.AMETHYST_SLAB.get());
                        pOutput.accept(ModBlocks.AMETHYST_WALL.get());
                        pOutput.accept(ModBlocks.AMETHYST_STAIRS.get());
                        pOutput.accept(ModBlocks.AMETHYST_BRICKS.get());
                        pOutput.accept(ModBlocks.AMETHYST_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.AMETHYST_BRICKS_WALL.get());
                        pOutput.accept(ModBlocks.AMETHYST_BRICKS_STAIRS.get());
                        pOutput.accept(ModBlocks.CHISELED_AMETHYST_BRICKS.get());
                        pOutput.accept(ModBlocks.POLISHED_AMETHYST.get());
                        pOutput.accept(ModBlocks.POLISHED_AMETHYST_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_AMETHYST_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_AMETHYST_STAIRS.get());
                        pOutput.accept(ModBlocks.AMETHYST_SPIRAL.get());
                        pOutput.accept(ModBlocks.AMETHYST_MOSAIC.get());
                        pOutput.accept(ModBlocks.AMETHYST_PILLAR.get());
                        pOutput.accept(ModBlocks.AMETHYST_BALL.get());
                        pOutput.accept(ModBlocks.AMETHYST_SPIKE.get());
                        pOutput.accept(ModItems.AMETHYST_APPLE.get());
                        pOutput.accept(ModItems.AMETHYST_CARROT.get());
                        pOutput.accept(ModItems.AMETHYST_ARROW.get());
                        pOutput.accept(ModItems.AMETHYST_ENDER_PEARL.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
