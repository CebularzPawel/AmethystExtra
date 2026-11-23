package net.cebularz.amethystextra;

import com.mojang.logging.LogUtils;
import net.cebularz.amethystextra.block.ModBlocks;

import net.cebularz.amethystextra.client.renderer.entity.AmethystArrowRenderer;
import net.cebularz.amethystextra.effect.ModEffects;
import net.cebularz.amethystextra.item.ModCreativeModTabs;
import net.cebularz.amethystextra.item.ModItems;
import net.cebularz.amethystextra.particle.ModParticles;
import net.cebularz.amethystextra.particle.custom.AmethystShineParticle;
import net.cebularz.amethystextra.world.entity.ModEntityType;
import net.cebularz.amethystextra.world.entity.projectile.AmethystArrow;
import net.cebularz.amethystextra.world.entity.projectile.ThrownAmethystEnderPearl;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.block.DispenserBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import org.slf4j.Logger;

@Mod(AmethystExtra.MOD_ID)
public class AmethystExtra
{
    public static final String MOD_ID = "amethystextra";
    private static final Logger LOGGER = LogUtils.getLogger();



    public AmethystExtra(IEventBus modEventBus)
    {
        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntityType.Register(modEventBus);
        ModParticles.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModEffects.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {



        //event.enqueueWork(()->{
            //((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CINNAMON_FERN.getId(),ModBlocks.POTTED_CINNAMON_FERN);
        //});

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntityType.AMETHYST_ARROW.get(), AmethystArrowRenderer::new);
            EntityRenderers.register(ModEntityType.THROWN_AMETHYST_ENDER_PEARL.get(), ThrownItemRenderer::new);

        }
        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent event){
            event.registerSpriteSet(ModParticles.AMETHYST_SHINE_PARTICLE.get(),
                    AmethystShineParticle.Provider::new);
        }
    }
}
