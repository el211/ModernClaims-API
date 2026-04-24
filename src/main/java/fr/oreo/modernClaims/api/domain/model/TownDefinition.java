package fr.oreo.modernClaims.api.domain.model;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public record TownDefinition(
        UUID id,
        String name,
        UUID mayorId,
        Set<UUID> memberIds,
        Set<UUID> claimIds,
        UUID nationId,
        double balance,
        String status
) {
    public TownDefinition {
        memberIds = memberIds == null ? Set.of() : Set.copyOf(new LinkedHashSet<>(memberIds));
        claimIds = claimIds == null ? Set.of() : Set.copyOf(new LinkedHashSet<>(claimIds));
    }
}
