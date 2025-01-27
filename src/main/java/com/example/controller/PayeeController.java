package com.example.controller;

import com.example.model.Payee;
import com.example.service.PayeeService;

import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.HttpResponse;

import javax.validation.Valid;
import java.util.Optional;

@Controller("/payees")
public class PayeeController {

    private final PayeeService payeeService;

    public PayeeController(PayeeService payeeService) {
        this.payeeService = payeeService;
    }

    @Post
    public HttpResponse<Payee> createPayee(@Body @Valid Payee payee) {
        return HttpResponse.status(HttpStatus.CREATED).body(payeeService.createPayee(payee));
    }

    @Get("/{payeeId}")
    public HttpResponse<Payee> getPayee(@PathVariable Long payeeId) {
        Optional<Payee> payee = payeeService.getPayeeById(payeeId);
        return payee.map(HttpResponse::ok)
                .orElse(HttpResponse.notFound());
    }

    @Get
    public Iterable<Payee> getAllPayees() {
        return payeeService.getAllPayees();
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
}
