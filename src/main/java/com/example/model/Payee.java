package com.example.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.model.naming.NamingStrategies;
import jakarta.persistence.Id;


@MappedEntity(value = "payees", namingStrategy = NamingStrategies.UnderScoreSeparatedLowerCase.class)
public class Payee {

    @Id
    @GeneratedValue
    private Long id;

    private String payeeName;
    private String accountNumber;
    private String address;

    public Payee(Long id, String payeeName, String accountNumber, String address) {
        this.id = id;
        this.payeeName = payeeName;
        this.accountNumber = accountNumber;
        this.address = address;
    }

    public Payee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Payee{" +
                "id=" + id +
                ", payeeName='" + payeeName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

