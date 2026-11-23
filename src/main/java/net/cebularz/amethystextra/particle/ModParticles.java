package net.cebularz.amethystextra.particle;

import net.cebularz.amethystextra.AmethystExtra;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AmethystExtra.MOD_ID);

    public static final RegistryObject<SimpleParticleType> AMETHYST_SHINE_PARTICLE =
            PARTICLES_TYPES.register("amethyst_shine", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLES_TYPES.register(eventBus);
    }
}
