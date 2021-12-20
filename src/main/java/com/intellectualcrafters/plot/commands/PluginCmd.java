package com.intellectualcrafters.plot.commands;

import com.intellectualcrafters.plot.PS;
import com.intellectualcrafters.plot.object.PlotPlayer;
import com.intellectualcrafters.plot.util.MainUtil;
import com.intellectualcrafters.plot.util.TaskManager;
import com.plotsquared.general.commands.CommandDeclaration;

@CommandDeclaration(command = "plugin",
        permission = "plots.use",
        description = "Show plugin information",
        usage = "/plot plugin",
        aliases = "version",
        category = CommandCategory.INFO)
public class PluginCmd extends SubCommand {

    @Override
    public boolean onCommand(final PlotPlayer player, String[] args) {
        TaskManager.IMP.taskAsync(new Runnable() {
            @Override
            public void run() {
                MainUtil.sendMessage(player, "$2>> $1&lAuthors$2: $1Citymonstret $2& $1Empire92 $2& $1MattBDev $2& $1dordsor21 $2& $1NotMyFault");
                MainUtil.sendMessage(player, "$2>> $1&lWiki$2: $1https://github.com/IntellectualSites/PlotSquared-Legacy/wiki/");
            }
        });
        return true;
    }
}
