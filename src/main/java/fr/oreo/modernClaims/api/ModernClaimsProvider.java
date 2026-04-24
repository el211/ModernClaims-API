package fr.oreo.modernClaims.api;

import org.bukkit.Bukkit;

import java.util.Optional;

/**
 * Static helper used by external plugins to locate the active ModernClaims API.
 *
 * <p>Public API repository: https://github.com/el211/ModernClaims-API
 * <br>Main plugin repository: https://github.com/el211/ModernClaims
 */
public final class ModernClaimsProvider {

    private static volatile ModernClaimsApi current;

    private ModernClaimsProvider() {
    }

    public static Optional<ModernClaimsApi> find() {
        ModernClaimsApi cached = current;
        if (cached != null) {
            return Optional.of(cached);
        }

        return Optional.ofNullable(Bukkit.getServicesManager().load(ModernClaimsApi.class));
    }

    public static ModernClaimsApi get() {
        return find().orElseThrow(() -> new IllegalStateException("ModernClaims API is not available."));
    }

    public static boolean isAvailable() {
        return find().isPresent();
    }

    public static void setCurrent(ModernClaimsApi api) {
        current = api;
    }

    public static void clear() {
        current = null;
    }
}
