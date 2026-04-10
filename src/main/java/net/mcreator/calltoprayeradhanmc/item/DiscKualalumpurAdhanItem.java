package net.mcreator.calltoprayeradhanmc.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscKualalumpurAdhanItem extends RecordItem {
	public DiscKualalumpurAdhanItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("call_to_prayer_adhan_mc:kuala_lumpur_prayer")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6000);
	}
}