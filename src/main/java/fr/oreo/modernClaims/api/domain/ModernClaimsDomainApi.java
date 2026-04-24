package fr.oreo.modernClaims.api.domain;

import fr.oreo.modernClaims.api.domain.repository.ClaimRepository;
import fr.oreo.modernClaims.api.domain.repository.NationRepository;
import fr.oreo.modernClaims.api.domain.repository.TownRepository;

public interface ModernClaimsDomainApi {

    ClaimRepository claims();

    TownRepository towns();

    NationRepository nations();
}
