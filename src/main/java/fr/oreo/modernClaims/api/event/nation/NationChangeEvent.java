package fr.oreo.modernClaims.api.event.nation;

import fr.oreo.modernClaims.api.domain.model.Nation;
import fr.oreo.modernClaims.api.event.ModernClaimsChangeType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class NationChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final ModernClaimsChangeType changeType;
    private final Nation nation;

    public NationChangeEvent(ModernClaimsChangeType changeType, Nation nation) {
        this.changeType = changeType;
        this.nation = nation;
    }

    public ModernClaimsChangeType getChangeType() {
        return changeType;
    }

    public Nation getNation() {
        return nation;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
