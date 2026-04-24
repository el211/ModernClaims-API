package fr.oreo.modernClaims.api.domain.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public record ClaimDefinition(
        UUID id,
        String name,
        UUID ownerId,
        String world,
        int chunkCount,
        String status,
        double taxRate,
        UUID townId,
        UUID nationId,
        Map<UUID, String> memberRoles
) {
    public ClaimDefinition {
        memberRoles = memberRoles == null ? Map.of() : Map.copyOf(new LinkedHashMap<>(memberRoles));
    }
}
