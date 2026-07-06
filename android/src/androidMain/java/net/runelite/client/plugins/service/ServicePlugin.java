package net.runelite.client.plugins.service;

import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
        name = "Service",
        description = "Ensures Android doesn't kill the client in the background while logged in",
        tags = {"android"}
)
public class ServicePlugin extends Plugin {
    boolean running = false;
    @Subscribe
    public void onGameStateChanged(GameStateChanged gameState) {
/*        if (!running)
            if (gameState.getGameState() == GameState.LOGGED_IN) {
                System.out.println("Starting Service");
                GameSessionService.Companion.start();
            }

        if (running)
            if (gameState.getGameState() == GameState.LOGIN_SCREEN) {
                System.out.println("Stopping Service");
                GameSessionService.Companion.stop();
            }*/
    }
}
