/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calltoprayeradhanmc.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CallToPrayerAdhanMcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CallToPrayerAdhanMcMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(CallToPrayerAdhanMcModBlocks.MINARET_SPEAKER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(CallToPrayerAdhanMcModBlocks.MINARET_SPEAKER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_TORONTO_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_RAMALLAH_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_NEWYORK_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_MEDINA_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_MECCA_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_LONDON_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_KUALALUMPUR_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_JAKARTA_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_ISTANBUL_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_FEZ_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_DHAKA_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_DELHI_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_CAIRO_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_AMSTERDAM_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_ALQUDS_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_SARAJEVO_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_AKKO_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_BAGHDAD_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_BEIRUT_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_DAMASCUS_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_KHORTUM_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.DISC_ADDISABABA_ADHAN.get());
			tabData.accept(CallToPrayerAdhanMcModItems.RANDOM_ADHAN_DISC.get());
		}
	}
}