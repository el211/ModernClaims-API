package fr.oreo.modernClaims.api.domain.repository;

import fr.oreo.modernClaims.api.domain.model.Nation;
import fr.oreo.modernClaims.api.domain.model.NationDefinition;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface NationRepository {

    Collection<Nation> findAll();

    Optional<Nation> findById(UUID id);

    Optional<Nation> findByName(String name);

    Collection<Nation> findByKing(UUID kingId);

    Nation create(NationDefinition definition);

    Nation update(UUID id, NationDefinition definition);

    boolean delete(UUID id);
}
