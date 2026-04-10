/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calltoprayeradhanmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.calltoprayeradhanmc.block.MinaretSpeakerBlock;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

public class CallToPrayerAdhanMcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CallToPrayerAdhanMcMod.MODID);
	public static final RegistryObject<Block> MINARET_SPEAKER;
	static {
		MINARET_SPEAKER = REGISTRY.register("minaret_speaker", MinaretSpeakerBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}