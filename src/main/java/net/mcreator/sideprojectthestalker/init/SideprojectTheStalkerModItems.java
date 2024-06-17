
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sideprojectthestalker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.sideprojectthestalker.SideprojectTheStalkerMod;

public class SideprojectTheStalkerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SideprojectTheStalkerMod.MODID);
	public static final RegistryObject<Item> STALKER_WATCH_SPAWN_EGG = REGISTRY.register("stalker_watch_spawn_egg",
			() -> new ForgeSpawnEggItem(SideprojectTheStalkerModEntities.STALKER_WATCH, -6684673, -16750849, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
