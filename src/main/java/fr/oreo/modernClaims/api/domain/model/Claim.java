package fr.oreo.modernClaims.api.domain.model;

import java.util.Map;
import java.util.UUID;

public interface Claim {

    UUID id();

    String name();

    UUID ownerId();

    String world();

    int chunkCount();

    String status();

    double taxRate();

    UUID townId();

    UUID nationId();

    Map<UUID, String> memberRoles();
}
