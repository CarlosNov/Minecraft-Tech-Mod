package net.mod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mod.UpTech;

public class ModItemGroup 
{
    public static final ItemGroup UPTECH_GROUP = FabricItemGroupBuilder.build(new Identifier(UpTech.MOD_ID, "up_tech_group"), () -> new ItemStack(ModItems.InventoryBag));
}
