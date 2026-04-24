package fr.oreo.modernClaims.api.domain.model;

import java.util.Set;
import java.util.UUID;

public interface Town {

    UUID id();

    String name();

    UUID mayorId();

    Set<UUID> memberIds();

    Set<UUID> claimIds();

    UUID nationId();

    double balance();

    String status();
}
