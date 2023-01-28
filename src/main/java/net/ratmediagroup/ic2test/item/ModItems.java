package net.ratmediagroup.ic2test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.*;



public class ModItems {

    public static final Item Forged_Hammer = new Item(new FabricItemSettings());
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(Forged_Hammer));
    }
}


