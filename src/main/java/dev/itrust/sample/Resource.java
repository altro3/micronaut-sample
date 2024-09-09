package dev.itrust.sample;

import dev.itrust.sample.repository.InvoiceItemRepository;
import dev.itrust.sample.repository.InvoiceRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 9.09.2024
 */
@Controller("/sample")
@RequiredArgsConstructor
public class Resource {

    private final InvoiceItemRepository invoiceItemRepository;
    private final InvoiceRepository invoiceRepository;

    @Get
    void test() {
        invoiceRepository.findById(1L);
    }



}
