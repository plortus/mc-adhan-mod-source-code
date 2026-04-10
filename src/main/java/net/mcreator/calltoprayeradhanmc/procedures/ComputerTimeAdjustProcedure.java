package net.mcreator.calltoprayeradhanmc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.calltoprayeradhanmc.network.CallToPrayerAdhanMcModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class ComputerTimeAdjustProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 10) {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_hour = 0 + "" + new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_hour = new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (Calendar.getInstance().get(Calendar.MINUTE) < 10) {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_minute = 0 + "" + new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.MINUTE));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_minute = new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.MINUTE));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (Calendar.getInstance().get(Calendar.SECOND) < 10) {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_second = 0 + "" + new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.SECOND));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_second = new java.text.DecimalFormat("##").format(Calendar.getInstance().get(Calendar.SECOND));
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}