package fr.oreo.modernClaims.api.event.claim;

import fr.oreo.modernClaims.api.domain.model.Claim;
import fr.oreo.modernClaims.api.event.ModernClaimsChangeType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class ClaimChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final ModernClaimsChangeType changeType;
    private final Claim claim;

    public ClaimChangeEvent(ModernClaimsChangeType changeType, Claim claim) {
        this.changeType = changeType;
        this.claim = claim;
    }

    public ModernClaimsChangeType getChangeType() {
        return changeType;
    }

    public Claim getClaim() {
        return claim;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
