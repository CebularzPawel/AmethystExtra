package net.cebularz.amethystextra.particle;

import net.cebularz.amethystextra.AmethystExtra;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES_TYPES = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, AmethystExtra.MOD_ID);

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> AMETHYST_SHINE_PARTICLE =
            PARTICLES_TYPES.register("amethyst_shine", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLES_TYPES.register(eventBus);
    }
}
