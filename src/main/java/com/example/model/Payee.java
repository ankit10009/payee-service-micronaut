package com.example.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

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
