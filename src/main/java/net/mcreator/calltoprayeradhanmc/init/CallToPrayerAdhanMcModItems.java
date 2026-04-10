/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calltoprayeradhanmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.calltoprayeradhanmc.item.*;
import net.mcreator.calltoprayeradhanmc.CallToPrayerAdhanMcMod;

public class CallToPrayerAdhanMcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CallToPrayerAdhanMcMod.MODID);
	public static final RegistryObject<Item> DISC_TORONTO_ADHAN;
	public static final RegistryObject<Item> DISC_RAMALLAH_ADHAN;
	public static final RegistryObject<Item> DISC_NEWYORK_ADHAN;
	public static final RegistryObject<Item> DISC_MEDINA_ADHAN;
	public static final RegistryObject<Item> DISC_MECCA_ADHAN;
	public static final RegistryObject<Item> DISC_LONDON_ADHAN;
	public static final RegistryObject<Item> DISC_KUALALUMPUR_ADHAN;
	public static final RegistryObject<Item> DISC_JAKARTA_ADHAN;
	public static final RegistryObject<Item> DISC_ISTANBUL_ADHAN;
	public static final RegistryObject<Item> DISC_FEZ_ADHAN;
	public static final RegistryObject<Item> DISC_DHAKA_ADHAN;
	public static final RegistryObject<Item> DISC_DELHI_ADHAN;
	public static final RegistryObject<Item> DISC_CAIRO_ADHAN;
	public static final RegistryObject<Item> DISC_AMSTERDAM_ADHAN;
	public static final RegistryObject<Item> DISC_ALQUDS_ADHAN;
	public static final RegistryObject<Item> RANDOM_ADHAN_DISC;
	public static final RegistryObject<Item> MINARET_SPEAKER;
	public static final RegistryObject<Item> DISC_SARAJEVO_ADHAN;
	public static final RegistryObject<Item> DISC_AKKO_ADHAN;
	public static final RegistryObject<Item> DISC_BAGHDAD_ADHAN;
	public static final RegistryObject<Item> DISC_BEIRUT_ADHAN;
	public static final RegistryObject<Item> DISC_DAMASCUS_ADHAN;
	public static final RegistryObject<Item> DISC_KHORTUM_ADHAN;
	public static final RegistryObject<Item> DISC_ADDISABABA_ADHAN;
	static {
		DISC_TORONTO_ADHAN = REGISTRY.register("disc_toronto_adhan", DiscTorontoAdhanItem::new);
		DISC_RAMALLAH_ADHAN = REGISTRY.register("disc_ramallah_adhan", DiscRamallahAdhanItem::new);
		DISC_NEWYORK_ADHAN = REGISTRY.register("disc_newyork_adhan", DiscNewyorkAdhanItem::new);
		DISC_MEDINA_ADHAN = REGISTRY.register("disc_medina_adhan", DiscMedinaAdhanItem::new);
		DISC_MECCA_ADHAN = REGISTRY.register("disc_mecca_adhan", DiscMeccaAdhanItem::new);
		DISC_LONDON_ADHAN = REGISTRY.register("disc_london_adhan", DiscLondonAdhanItem::new);
		DISC_KUALALUMPUR_ADHAN = REGISTRY.register("disc_kualalumpur_adhan", DiscKualalumpurAdhanItem::new);
		DISC_JAKARTA_ADHAN = REGISTRY.register("disc_jakarta_adhan", DiscJakartaAdhanItem::new);
		DISC_ISTANBUL_ADHAN = REGISTRY.register("disc_istanbul_adhan", DiscIstanbulAdhanItem::new);
		DISC_FEZ_ADHAN = REGISTRY.register("disc_fez_adhan", DiscFezAdhanItem::new);
		DISC_DHAKA_ADHAN = REGISTRY.register("disc_dhaka_adhan", DiscDhakaAdhanItem::new);
		DISC_DELHI_ADHAN = REGISTRY.register("disc_delhi_adhan", DiscDelhiAdhanItem::new);
		DISC_CAIRO_ADHAN = REGISTRY.register("disc_cairo_adhan", DiscCairoAdhanItem::new);
		DISC_AMSTERDAM_ADHAN = REGISTRY.register("disc_amsterdam_adhan", DiscAmsterdamAdhanItem::new);
		DISC_ALQUDS_ADHAN = REGISTRY.register("disc_alquds_adhan", DiscAlqudsAdhanItem::new);
		RANDOM_ADHAN_DISC = REGISTRY.register("random_adhan_disc", RandomAdhanDiscItem::new);
		MINARET_SPEAKER = block(CallToPrayerAdhanMcModBlocks.MINARET_SPEAKER);
		DISC_SARAJEVO_ADHAN = REGISTRY.register("disc_sarajevo_adhan", DiscSarajevoAdhanItem::new);
		DISC_AKKO_ADHAN = REGISTRY.register("disc_akko_adhan", DiscAkkoAdhanItem::new);
		DISC_BAGHDAD_ADHAN = REGISTRY.register("disc_baghdad_adhan", DiscBaghdadAdhanItem::new);
		DISC_BEIRUT_ADHAN = REGISTRY.register("disc_beirut_adhan", DiscBeirutAdhanItem::new);
		DISC_DAMASCUS_ADHAN = REGISTRY.register("disc_damascus_adhan", DiscDamascusAdhanItem::new);
		DISC_KHORTUM_ADHAN = REGISTRY.register("disc_khortum_adhan", DiscKhortumAdhanItem::new);
		DISC_ADDISABABA_ADHAN = REGISTRY.register("disc_addisababa_adhan", DiscAddisababaAdhanItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}