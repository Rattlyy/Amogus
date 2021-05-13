package it.rattly.amogus.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

@UtilityClass
public class Utils {
    public ItemStack getAmogus() {
        ItemStack stack = new ItemStack(Material.STICK, 1);
        ItemMeta meta = stack.getItemMeta();

        meta.setCustomModelData(696969);
        meta.setDisplayName("§c§lAMOGUS IMPOSTER");
        meta.setLore(Arrays.asList("§fA very sussy item", "I recommend to not touch it."));

        stack.setItemMeta(meta);

        return stack;
    }
}
