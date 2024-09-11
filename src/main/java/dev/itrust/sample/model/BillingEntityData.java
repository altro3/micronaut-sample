package dev.itrust.sample.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 10.09.2024
 */
@Entity
@IdClass(VersionedId.class)
@Setter
@Getter
@ToString(callSuper = true)
@Introspected
public class BillingEntityData extends BaseEntity {

    @Id
    private UUID id;

    @Id
    private LocalDate dateFrom;

    @Size(max = 5)
    @NotBlank
    private String invoicePrefix;

    @NotBlank
    @Email
    private String email;

    @Size(max = 256)
    @NotBlank
    private String companyName;

    @Size(max = 60)
    @NotBlank
    private String street;

    @Size(max = 10)
    private String buildingNumber;

    @Size(max = 10)
    private String apartmentNumber;

    @Size(max = 32)
    @NotBlank
    private String postCode;

    @Size(max = 64)
    @NotBlank
    private String city;

    @Size(max = 34)
    @NotBlank
    private String bankAccount;

    @Size(max = 256)
    @NotBlank
    private String bankName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillingEntityData that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
