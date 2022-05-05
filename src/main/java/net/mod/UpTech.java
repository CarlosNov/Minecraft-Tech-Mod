package net.mod;

import net.fabricmc.api.ModInitializer;
import net.mod.block.ModBlocks;
import net.mod.item.ModItems;

public class UpTech implements ModInitializer 
{
    public static final String MOD_ID = "uptech";

    @Override
    public void onInitialize()
    {
        ModItems.registerItem();
        ModBlocks.registerBlock();
    }
}
