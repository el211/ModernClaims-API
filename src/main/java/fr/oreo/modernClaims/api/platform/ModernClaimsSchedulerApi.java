package fr.oreo.modernClaims.api.platform;

import org.bukkit.entity.Player;

public interface ModernClaimsSchedulerApi {

    boolean isFolia();

    void runGlobal(Runnable task);

    void runPlayer(Player player, Runnable task);
}
