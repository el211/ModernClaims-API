# ModernClaims-API

Repository: https://github.com/el211/ModernClaims-API

[![JitPack](https://jitpack.io/v/el211/ModernClaims-API.svg)](https://jitpack.io/#el211/ModernClaims-API)

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

## JitPack

This repository is configured for JitPack with `maven-publish`, and the root contains `jitpack.yml` for Java 21 builds.

Based on JitPack's documentation:

- add `https://jitpack.io` as a repository
- use `com.github.Username:Repo:Version` coordinates
- prefer a GitHub release tag for stable versions
- a commit hash also works as the version if needed

Gradle:

```gradle
repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
        content {
            includeGroup("com.github.el211")
        }
    }
}

dependencies {
    implementation("com.github.el211:ModernClaims-API:TAG")
}
```

Gradle Kotlin DSL:

```kotlin
repositories {
    mavenCentral()
    maven("https://jitpack.io") {
        content {
            includeGroup("com.github.el211")
        }
    }
}

dependencies {
    implementation("com.github.el211:ModernClaims-API:TAG")
}
```

Maven:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.el211</groupId>
    <artifactId>ModernClaims-API</artifactId>
    <version>TAG</version>
</dependency>
```

Replace `TAG` with:

- a GitHub release tag such as `v1.0.0`
- or a commit hash if you want to consume a specific commit immediately

Once a tag is pushed, JitPack will build it on first request. You can inspect builds at:

- `https://jitpack.io/#el211/ModernClaims-API`

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
