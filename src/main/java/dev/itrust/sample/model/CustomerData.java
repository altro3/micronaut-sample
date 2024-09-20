package dev.itrust.sample.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 19.09.2024
 */
@Entity
@IdClass(VersionedId2.class)
@Getter
@Setter
@Introspected
@Serdeable
public class CustomerData extends BaseEntity {

    @Id
    @Column(name = "customer_id")
    private UUID id;

    @Id
    private long version;

    @MapsId(value = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;

    private String name;

    private String address;

}
