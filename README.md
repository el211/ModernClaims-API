# ModernClaims-API

Repository: https://github.com/el211/ModernClaims-API

## Purpose

`ModernClaims-API` contains the public Java contracts used by plugins that integrate with `ModernClaims`.

This repository is intended for:

- API interfaces
- domain models
- repositories
- API events
- GUI and scheduler abstractions

It is not intended for the plugin implementation itself.

## Build

```powershell
./gradlew build
```

Artifacts:

- `build/libs/ModernClaims-API-1.0-SNAPSHOT.jar`
- `build/libs/ModernClaims-API-1.0-SNAPSHOT-sources.jar`

## Usage

A consumer plugin should compile against this API jar and depend on the `ModernClaims` plugin at runtime.

Example:

```java
import fr.oreo.modernClaims.api.ModernClaimsApi;
import fr.oreo.modernClaims.api.ModernClaimsProvider;
import fr.oreo.modernClaims.api.gui.ModernClaimsMenu;
import org.bukkit.entity.Player;

public final class ExampleUsage {

    public void openClaimMenu(Player player) {
        ModernClaimsApi api = ModernClaimsProvider.get();
        api.gui().openMenu(player, ModernClaimsMenu.CLAIM_MAIN);
    }
}
```

Example consumer `plugin.yml`:

```yml
name: ExampleAddon
main: com.example.addon.ExampleAddon
version: 1.0.0
api-version: "1.21"
depend:
  - ModernClaims
```
