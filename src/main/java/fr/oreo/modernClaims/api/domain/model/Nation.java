package fr.oreo.modernClaims.api.domain.model;

import java.util.Set;
import java.util.UUID;

public interface Nation {

    UUID id();

    String name();

    UUID kingId();

    Set<UUID> townIds();

    Set<UUID> memberIds();

    double balance();

    String status();
}
