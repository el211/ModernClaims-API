package fr.oreo.modernClaims.api;

import fr.oreo.modernClaims.api.domain.ModernClaimsDomainApi;
import fr.oreo.modernClaims.api.gui.ModernClaimsGuiApi;
import fr.oreo.modernClaims.api.platform.ModernClaimsSchedulerApi;
import fr.oreo.modernClaims.api.storage.ModernClaimsStorageApi;
import org.bukkit.plugin.Plugin;

/**
 * Public entrypoint for other plugins integrating with ModernClaims.
 *
 * <p>Public API repository: https://github.com/el211/ModernClaims-API
 * <br>Main plugin repository: https://github.com/el211/ModernClaims
 */
public interface ModernClaimsApi {

    Plugin plugin();

    String version();

    ModernClaimsGuiApi gui();

    ModernClaimsDomainApi domain();

    ModernClaimsSchedulerApi scheduler();

    ModernClaimsStorageApi storage();
}
