
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sideprojectthestalker.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sideprojectthestalker.client.renderer.StalkerWatchRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SideprojectTheStalkerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SideprojectTheStalkerModEntities.STALKER_WATCH.get(), StalkerWatchRenderer::new);
	}
}
