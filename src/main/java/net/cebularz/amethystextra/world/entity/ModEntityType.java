package net.cebularz.amethystextra.world.entity;

import net.cebularz.amethystextra.AmethystExtra;
import net.cebularz.amethystextra.world.entity.projectile.AmethystArrow;
import net.cebularz.amethystextra.world.entity.projectile.ThrownAmethystEnderPearl;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AmethystExtra.MOD_ID);


    //ENDER_PEARL = register("ender_pearl", EntityType.Builder.of(ThrownEnderpearl::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10));
    public static final RegistryObject<EntityType<AmethystArrow>> AMETHYST_ARROW = ENTITIES.register("amethyst_arrow",()->EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5f,0.5f).clientTrackingRange(4).updateInterval(20).build("amethyst_arrow"));

    public static final RegistryObject<EntityType<ThrownAmethystEnderPearl>> THROWN_AMETHYST_ENDER_PEARL =
            ENTITIES.register("thrown_amethyst_ender_pearl" , () -> EntityType.Builder.<ThrownAmethystEnderPearl>of(ThrownAmethystEnderPearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(10)
                    .build("thrown_amethyst_ender_pearl"));

    public static void Register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
