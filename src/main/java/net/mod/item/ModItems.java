package net.mod.item;

import net.mod.UpTech;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item InventoryBag = registerItem("inventory_bag", new Item(new Item.Settings().group(ModItemGroup.UPTECH_GROUP)));
    
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(UpTech.MOD_ID, name), item);
    }

    public static void registerItem()
    {
        System.out.println("Registering Items...");
    }
}
