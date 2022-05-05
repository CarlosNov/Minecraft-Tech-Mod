package net.mod.block;

import net.mod.UpTech;
import net.mod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block MOD_BLOCK = registerBlock("base_building_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)));
    
    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(UpTech.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registry.ITEM, new Identifier(UpTech.MOD_ID, name), 
        new BlockItem(block, new FabricItemSettings().group(ModItemGroup.UPTECH_GROUP)));
    }

    public static void registerBlock()
    {
        System.out.println("Registering Blocks...");
    }
}
