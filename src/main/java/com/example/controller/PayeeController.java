package com.example.controller;

import com.example.model.Payee;
import com.example.service.PayeeService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

@Controller("/payees")
public class PayeeController {

    private final PayeeService payeeService;

    public PayeeController(PayeeService payeeService) {
        this.payeeService = payeeService;
    }

    @Post
    public HttpResponse<Payee> addPayee(@Body Payee payee) {
        return HttpResponse.created(payeeService.addPayee(payee));
    }

    @Put("/{payeeId}")
    public HttpResponse<Payee> updatePayee(@PathVariable Long payeeId, @Body Payee payee) {
        return payeeService.updatePayee(payeeId, payee)
                .map(HttpResponse::ok)
                .orElse(HttpResponse.notFound());
    }

    @Delete("/{payeeId}")
    public HttpResponse<?> deletePayee(@PathVariable Long payeeId) {
        payeeService.deletePayee(payeeId);
        return HttpResponse.noContent();
    }

    @Get("/{payeeId}")
    public HttpResponse<Payee> getPayeeById(@PathVariable Long payeeId) {
        return payeeService.getPayeeById(payeeId)
                .map(HttpResponse::ok)
                .orElse(HttpResponse.notFound());
    }
}

