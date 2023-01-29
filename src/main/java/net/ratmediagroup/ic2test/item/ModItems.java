package net.ratmediagroup.ic2test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ratmediagroup.ic2test.ic2hammer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.*;


public class ModItems {

    public static final Item Forged_Hammer = registerItem("forged_hammer",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ic2hammer.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Item For " + ic2hammer.MOD_ID);


    }
}

