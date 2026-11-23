package net.cebularz.amethystextra.effect;

import net.minecraft.core.Holder;
import net.cebularz.amethystextra.AmethystExtra;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, AmethystExtra.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> PURIFICATION = MOB_EFFECTS.register("purification",
            () -> new PurificationEffect(MobEffectCategory.BENEFICIAL,14194136));

    public static Holder<MobEffect> purificationHolder() {
        return PURIFICATION;
    }

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }

}
