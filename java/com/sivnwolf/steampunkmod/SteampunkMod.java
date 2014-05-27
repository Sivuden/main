package com.sivnwolf.steampunkmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SteampunkMod.MODID, version = SteampunkMod.VERSION)
public class SteampunkMod
{
    public static final String MODID = "steampunkmod";
    public static final String VERSION = "0.0";
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	
    	
    //Crafting Recipes
    GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[] {
    	"AAA",
    	"AAA",
    	"AAA",
    	'A', Items.cookie
    });
    	
    }
}
