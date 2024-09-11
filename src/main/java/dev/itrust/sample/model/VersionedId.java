package dev.itrust.sample.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 10.09.2024
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Introspected
public class VersionedId {

    private UUID id;
    private LocalDate dateFrom;

}
