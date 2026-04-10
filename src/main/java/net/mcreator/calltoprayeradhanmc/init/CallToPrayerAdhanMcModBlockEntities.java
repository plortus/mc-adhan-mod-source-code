/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calltoprayeradhanmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.calltoprayeradhanmc.block.entity.MinaretSpeakerBlockEntity;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

public class CallToPrayerAdhanMcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CallToPrayerAdhanMcMod.MODID);
	public static final RegistryObject<BlockEntityType<MinaretSpeakerBlockEntity>> MINARET_SPEAKER = register("minaret_speaker", CallToPrayerAdhanMcModBlocks.MINARET_SPEAKER, MinaretSpeakerBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}