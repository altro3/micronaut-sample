package dev.itrust.sample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 9.09.2024
 */
@Entity
@Getter
@Setter
public class InvoiceItem extends GenericBaseEntity<Long> {

    private String name;

    protected int volume;

    @Column(precision = 15, scale = 2, nullable = false)
    protected BigDecimal price;

    @ManyToOne
    @JoinColumn(name="invoice_id", nullable=false)
    private Invoice invoice;

}
