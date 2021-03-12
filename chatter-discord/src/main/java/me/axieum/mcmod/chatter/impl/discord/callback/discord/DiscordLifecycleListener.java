package me.axieum.mcmod.chatter.impl.discord.callback.discord;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.ShutdownEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import static me.axieum.mcmod.chatter.impl.discord.ChatterDiscord.LOGGER;

public class DiscordLifecycleListener extends ListenerAdapter
{
    @Override
    public void onReady(@NotNull ReadyEvent event)
    {
        LOGGER.info("Logged into Discord as @{}", event.getJDA().getSelfUser().getAsTag());
    }

    @Override
    public void onShutdown(@NotNull ShutdownEvent event)
    {
        LOGGER.info("Logged out of Discord!");
    }
}
