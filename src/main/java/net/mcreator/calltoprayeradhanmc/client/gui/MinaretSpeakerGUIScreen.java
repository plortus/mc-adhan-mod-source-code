package net.mcreator.calltoprayeradhanmc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.calltoprayeradhanmc.world.inventory.MinaretSpeakerGUIMenu;
import net.mcreator.calltoprayeradhanmc.procedures.ReturnComputerTimeProcedure;
import net.mcreator.calltoprayeradhanmc.network.MinaretSpeakerGUIButtonMessage;
import net.mcreator.calltoprayeradhanmc.init.CallToPrayerAdhanMcModScreens;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class MinaretSpeakerGUIScreen extends AbstractContainerScreen<MinaretSpeakerGUIMenu> implements CallToPrayerAdhanMcModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_test;

	public MinaretSpeakerGUIScreen(MinaretSpeakerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("call_to_prayer_adhan_mc:textures/screens/minaret_speaker_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_minaret_speaker"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_insert_adhan_disc"), 42, 34, -12829636, false);
		guiGraphics.drawString(this.font, ReturnComputerTimeProcedure.execute(world), 6, -11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_prayer_times"), -93, -11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_fajr_0500_before_sunrise"), -93, -2, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_dhuhr_1230"), -93, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_asr_1545"), -93, 16, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_maghrib_1815"), -93, 25, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.label_isha_2000"), -93, 34, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_test = Button.builder(Component.translatable("gui.call_to_prayer_adhan_mc.minaret_speaker_gui.button_test"), e -> {
			int x = MinaretSpeakerGUIScreen.this.x;
			int y = MinaretSpeakerGUIScreen.this.y;
			if (true) {
				CallToPrayerAdhanMcMod.PACKET_HANDLER.sendToServer(new MinaretSpeakerGUIButtonMessage(0, x, y, z));
				MinaretSpeakerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 61, 46, 20).build();
		this.addRenderableWidget(button_test);
	}
}