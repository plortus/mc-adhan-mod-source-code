package net.mcreator.calltoprayeradhanmc.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.calltoprayeradhanmc.network.CallToPrayerAdhanMcModVariables;

public class ReturnComputerTimeProcedure {
	public static String execute(LevelAccessor world) {
		return "Computer Time: " + CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_hour + ":" + CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_minute + ":"
				+ CallToPrayerAdhanMcModVariables.MapVariables.get(world).computer_time_second;
	}
}