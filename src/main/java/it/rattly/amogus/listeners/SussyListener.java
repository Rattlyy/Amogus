package it.rattly.amogus.listeners;

import it.rattly.amogus.utils.Utils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SussyListener implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta() == null)
                return;

            if (!event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasCustomModelData())
                return;

            if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getCustomModelData() == 696969) {
                event.setCancelled(true);

                Player player = event.getPlayer();
                if (player.getInventory().getItemInMainHand().getAmount() > 1) {
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                } else {
                    player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
                }

                Zombie stand = player.getWorld().spawn(event.getClickedBlock().getLocation().add(0, 1, 0), Zombie.class);
                stand.setInvulnerable(false);
                stand.setHealth(20);
                stand.setCustomName("AMOGUS");
                stand.getEquipment().setHelmet(Utils.getAmogus());
                stand.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
                stand.setShouldBurnInDay(false);
                stand.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9999999, 9999999));
            }
        }
    }
}
