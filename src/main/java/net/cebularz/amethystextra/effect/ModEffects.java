package net.cebularz.amethystextra.effect;

import net.minecraft.core.Holder;
import net.cebularz.amethystextra.AmethystExtra;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AmethystExtra.MOD_ID);

    public static final RegistryObject<MobEffect> PURIFICATION = MOB_EFFECTS.register("purification",
            () -> new PurificationEffect(MobEffectCategory.BENEFICIAL,14194136));

    public static Holder<MobEffect> purificationHolder() {
        return PURIFICATION.getHolder().orElseThrow();
    }

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }

}
