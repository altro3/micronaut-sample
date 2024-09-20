package dev.itrust.sample.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.ReflectiveAccess;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 19.09.2024
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Introspected
@ReflectiveAccess
public class VersionedId2 {

    private UUID id;

    private long version;
}


