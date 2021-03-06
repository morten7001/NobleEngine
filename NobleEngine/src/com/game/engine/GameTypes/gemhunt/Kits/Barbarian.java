package com.game.engine.GameTypes.gemhunt.Kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.game.engine.Game.Kit;
import com.game.engine.Util.ItemStackBuilder;

public class Barbarian extends Kit
{

	public Barbarian()
    {
	    super("Barbarian", new String[] {"Has a might sword of Iron"}, Material.DIAMOND_SWORD);
	    
	    addItem(new ItemStackBuilder(Material.IRON_SWORD, 1, "Longsword", ChatColor.GREEN).buildItem());
	    addSpecialItem(new ItemStackBuilder(Material.BOW, 1, "Elf Bow", ChatColor.GREEN).buildItem(), 1);
	    addSpecialItem(new ItemStackBuilder(Material.ARROW, 16, "Elf Arrow", ChatColor.GREEN).buildItem(), 7);
	 
	    setArmor(new ItemStack(Material.LEATHER_HELMET), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.LEATHER_LEGGINGS), new ItemStack(Material.LEATHER_BOOTS), true);
    }

	@Override
	public void loadAbilities()
	{
		// TODO Auto-generated method stub
		
	}

}
