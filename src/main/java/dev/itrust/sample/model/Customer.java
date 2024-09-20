package dev.itrust.sample.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 19.09.2024
 */
@Entity
@Setter
@Getter
@Introspected
@Serdeable
public class Customer extends BaseEntity {

    @Id
    private UUID id;

    private String vatId;

}
