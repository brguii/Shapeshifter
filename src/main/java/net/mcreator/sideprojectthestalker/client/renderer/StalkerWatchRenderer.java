
package net.mcreator.sideprojectthestalker.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.sideprojectthestalker.entity.StalkerWatchEntity;

public class StalkerWatchRenderer extends HumanoidMobRenderer<StalkerWatchEntity, HumanoidModel<StalkerWatchEntity>> {
	public StalkerWatchRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(StalkerWatchEntity entity) {
		return new ResourceLocation("sideproject_the_stalker:textures/entities/old_steve.png");
	}
}
