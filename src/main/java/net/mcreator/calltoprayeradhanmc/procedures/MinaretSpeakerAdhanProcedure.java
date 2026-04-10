package net.mcreator.calltoprayeradhanmc.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.calltoprayeradhanmc.network.CallToPrayerAdhanMcModVariables;
import net.mcreator.calltoprayeradhanmc.init.CallToPrayerAdhanMcModItems;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Calendar;

public class MinaretSpeakerAdhanProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String ahdan_type = "";
		boolean adhan_allowed = false;
		ItemStack adhan_disc = ItemStack.EMPTY;
		adhan_disc = (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).copy();
		if (!(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 5 && Calendar.getInstance().get(Calendar.MINUTE) == 0)) {
			if (!(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 12 && Calendar.getInstance().get(Calendar.MINUTE) == 30)) {
				if (!(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 15 && Calendar.getInstance().get(Calendar.MINUTE) == 45)) {
					if (!(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 18 && Calendar.getInstance().get(Calendar.MINUTE) == 15)) {
						if (!(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 20 && Calendar.getInstance().get(Calendar.MINUTE) == 0)) {
							adhan_allowed = false;
						} else {
							adhan_allowed = true;
							CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = true;
							CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
						}
					} else {
						adhan_allowed = true;
						CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = true;
						CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
					}
				} else {
					adhan_allowed = true;
					CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = true;
					CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
				}
			} else {
				adhan_allowed = true;
				CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = true;
				CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
			}
		} else {
			adhan_allowed = true;
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = true;
			CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_TORONTO_ADHAN.get()) {
			ahdan_type = "toronto";
		} else {
			if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_RAMALLAH_ADHAN.get()) {
				ahdan_type = "ramallah";
			} else {
				if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_NEWYORK_ADHAN.get()) {
					ahdan_type = "newyork";
				} else {
					if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_MEDINA_ADHAN.get()) {
						ahdan_type = "medina";
					} else {
						if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_MECCA_ADHAN.get()) {
							ahdan_type = "mecca";
						} else {
							if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_LONDON_ADHAN.get()) {
								ahdan_type = "london";
							} else {
								if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_KUALALUMPUR_ADHAN.get()) {
									ahdan_type = "kuala_lumpur";
								} else {
									if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_JAKARTA_ADHAN.get()) {
										ahdan_type = "jakarta";
									} else {
										if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_ISTANBUL_ADHAN.get()) {
											ahdan_type = "istanbul";
										} else {
											if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_FEZ_ADHAN.get()) {
												ahdan_type = "fez";
											} else {
												if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_DHAKA_ADHAN.get()) {
													ahdan_type = "dhaka";
												} else {
													if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_DELHI_ADHAN.get()) {
														ahdan_type = "delhi";
													} else {
														if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_CAIRO_ADHAN.get()) {
															ahdan_type = "cairo";
														} else {
															if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_AMSTERDAM_ADHAN.get()) {
																ahdan_type = "amsterdam";
															} else {
																if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_ALQUDS_ADHAN.get()) {
																	ahdan_type = "alquds";
																} else {
																	if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_SARAJEVO_ADHAN.get()) {
																		ahdan_type = "sarajevo";
																	} else {
																		if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_AKKO_ADHAN.get()) {
																			ahdan_type = "akko";
																		} else {
																			if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_BAGHDAD_ADHAN.get()) {
																				ahdan_type = "baghdad";
																			} else {
																				if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_BEIRUT_ADHAN.get()) {
																					ahdan_type = "beirut";
																				} else {
																					if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_DAMASCUS_ADHAN.get()) {
																						ahdan_type = "damascus";
																					} else {
																						if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_KHORTUM_ADHAN.get()) {
																							ahdan_type = "khortum";
																						} else {
																							if (adhan_disc.getItem() == CallToPrayerAdhanMcModItems.DISC_ADDISABABA_ADHAN.get()) {
																								ahdan_type = "addisababa";
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (adhan_allowed == true && CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown == true) {
			adhan_allowed = false;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("/playsound call_to_prayer_adhan_mc:" + ahdan_type + "_prayer record @a ~ ~ ~ 10 1 1"));
			CallToPrayerAdhanMcMod.queueServerWork(200, () -> {
				CallToPrayerAdhanMcModVariables.MapVariables.get(world).adhan_block_cooldown = false;
				CallToPrayerAdhanMcModVariables.MapVariables.get(world).markSyncDirty();
			});
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor level, BlockPos pos, int slot) {
		AtomicReference<ItemStack> result = new AtomicReference<>(ItemStack.EMPTY);
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity != null)
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> result.set(capability.getStackInSlot(slot)));
		return result.get();
	}
}