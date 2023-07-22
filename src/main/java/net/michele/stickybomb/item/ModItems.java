package net.michele.stickybomb.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.michele.stickybomb.stickybomb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_AUSTRALIUM = registerItem("raw_australium",
            new Item(new FabricItemSettings()));
    public static final Item AUSTRALIUM = registerItem("australium",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return item;
    }

    private static Item registerItem(String name, Item item, ItemGroup group) {
         return Registry.register(Registries.ITEM, new Identifier(stickybomb.MOD_ID, name), item);
     }

     public static void registerModiItem() {
         stickybomb.LOGGER.debug("Registering Mod Items for " + stickybomb.MOD_ID);
     }

    public static void registerModItems() {
    }
}
