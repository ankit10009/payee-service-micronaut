package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import io.micronaut.core.annotation.Introspected;

@Introspected
@Entity
@Table(name = "payees")
public class Payee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String payeeName;

	@NotBlank
	private String accountNumber;

	@NotBlank
	private String address;

	public Payee() {
		super();
	}

	public Payee(Long id, @NotBlank String payeeName, @NotBlank String accountNumber, @NotBlank String address) {
		super();
		this.id = id;
		this.payeeName = payeeName;
		this.accountNumber = accountNumber;
		this.address = address;
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

}
