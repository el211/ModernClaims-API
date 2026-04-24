package fr.oreo.modernClaims.api.domain.repository;

import fr.oreo.modernClaims.api.domain.model.Town;
import fr.oreo.modernClaims.api.domain.model.TownDefinition;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface TownRepository {

    Collection<Town> findAll();

    Optional<Town> findById(UUID id);

    Optional<Town> findByName(String name);

    Collection<Town> findByMayor(UUID mayorId);

    Town create(TownDefinition definition);

    Town update(UUID id, TownDefinition definition);

    boolean delete(UUID id);
}
