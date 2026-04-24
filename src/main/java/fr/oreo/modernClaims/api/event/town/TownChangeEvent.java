package fr.oreo.modernClaims.api.event.town;

import fr.oreo.modernClaims.api.domain.model.Town;
import fr.oreo.modernClaims.api.event.ModernClaimsChangeType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class TownChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final ModernClaimsChangeType changeType;
    private final Town town;

    public TownChangeEvent(ModernClaimsChangeType changeType, Town town) {
        this.changeType = changeType;
        this.town = town;
    }

    public ModernClaimsChangeType getChangeType() {
        return changeType;
    }

    public Town getTown() {
        return town;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
