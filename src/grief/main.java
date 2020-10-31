package grief;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new cmds(), this);
        getServer().getConsoleSender().sendMessage("§aDas §3Grief-Plugin §awurde erfolgreich aktiviert!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§4Das §3Grief-Plugin §4wurde erfolgreich deaktiviert!");
    }
}
