package dev.itrust.sample;

import dev.itrust.sample.fk.api.InvoiceApi;
import dev.itrust.sample.fk.api.model.CreateInvoiceRequest;
import dev.itrust.sample.fk.api.model.InvoiceIdDto;
import io.micronaut.http.HttpResponse;
import jakarta.validation.Valid;

import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 27.09.2024
 */
public class InvoiceResource implements InvoiceApi {
    @Override
    public HttpResponse<@Valid InvoiceIdDto> createInvoice(CreateInvoiceRequest createInvoiceRequest) {
        return HttpResponse.created(new InvoiceIdDto().docNumber("123").id(UUID.randomUUID()));
    }
}
