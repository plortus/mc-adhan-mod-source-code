/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calltoprayeradhanmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.calltoprayeradhanmc.world.inventory.MinaretSpeakerGUIMenu;
import net.mcreator.calltoprayeradhanmc.network.MenuStateUpdateMessage;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

import java.util.Map;

public class CallToPrayerAdhanMcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CallToPrayerAdhanMcMod.MODID);
	public static final RegistryObject<MenuType<MinaretSpeakerGUIMenu>> MINARET_SPEAKER_GUI = REGISTRY.register("minaret_speaker_gui", () -> IForgeMenuType.create(MinaretSpeakerGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				CallToPrayerAdhanMcMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof CallToPrayerAdhanMcModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				CallToPrayerAdhanMcMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}