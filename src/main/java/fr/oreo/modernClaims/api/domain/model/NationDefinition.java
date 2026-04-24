package fr.oreo.modernClaims.api.domain.model;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public record NationDefinition(
        UUID id,
        String name,
        UUID kingId,
        Set<UUID> townIds,
        Set<UUID> memberIds,
        double balance,
        String status
) {
    public NationDefinition {
        townIds = townIds == null ? Set.of() : Set.copyOf(new LinkedHashSet<>(townIds));
        memberIds = memberIds == null ? Set.of() : Set.copyOf(new LinkedHashSet<>(memberIds));
    }
}
