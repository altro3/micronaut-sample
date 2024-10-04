package dev.itrust.sample;

import dev.itrust.sample.fk.api.InvoiceApi;
import dev.itrust.sample.fk.api.model.CreateInvoiceRequest;
import dev.itrust.sample.fk.api.model.CurrencyInvoiceCreateDto;
import dev.itrust.sample.fk.api.model.DocType;
import dev.itrust.sample.fk.api.model.InvoiceIdDto;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.validation.Valid;
import lombok.val;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 27.09.2024
 */
@Controller
public class InvoiceResource implements InvoiceApi {
    @Override
    public HttpResponse<@Valid InvoiceIdDto> createInvoice(CreateInvoiceRequest createInvoiceRequest) {
        return HttpResponse.created(new InvoiceIdDto().docNumber("123").id(UUID.randomUUID()));
    }

    @Override
    public CreateInvoiceRequest loadInvoice(UUID id) {

        val invoice = new CurrencyInvoiceCreateDto("EUR", BigDecimal.valueOf(4.75), LocalDate.now(), "12345678");
        invoice.setDocType(DocType.FW);

        return invoice;
    }

}
