package dev.itrust.sample;

import dev.itrust.sample.model.CustomerData;
import dev.itrust.sample.model.VersionedId2;
import dev.itrust.sample.repository.CustomerDataRepository;
import dev.itrust.sample.repository.InvoiceItemRepository;
import dev.itrust.sample.repository.InvoiceRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;
import lombok.val;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 9.09.2024
 */
@Controller("/sample")
@RequiredArgsConstructor
public class Resource {

    private final InvoiceItemRepository invoiceItemRepository;
    private final InvoiceRepository invoiceRepository;

    private final CustomerDataRepository customerDataRepository;

    @Get
    void test() {
        invoiceRepository.findById(1L);
    }


    @Get("/customer/{id}/{version}")
    Optional<CustomerData> test2(UUID id, long version) {
        val tmp = customerDataRepository.findById(new VersionedId2(id, version));
        System.out.println(tmp);
        return tmp;
    }

    @Get("/customer")
    List<CustomerData> listCustomers() {
        return customerDataRepository.findAll();
    }


}
