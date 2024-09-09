package dev.itrust.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 9.09.2024
 */
@Entity
@Getter
@Setter
public class Invoice extends GenericBaseEntity<Long> {

    @Size(max = 255)
    protected String docNumber;

    @Size(max = 255)
    protected String placeOfIssue;

    protected LocalDate sellDate;

    @OneToMany(mappedBy = "invoice")
    protected List<InvoiceItem> items;


}
