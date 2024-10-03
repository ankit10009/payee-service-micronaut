package com.example.service;

import com.example.model.Payee;
import com.example.repo.PayeeRepository;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class PayeeService {

	private final PayeeRepository payeeRepository;

	public PayeeService(PayeeRepository payeeRepository) {
		this.payeeRepository = payeeRepository;
	}

	public Payee createPayee(Payee payee) {
		return payeeRepository.save(payee);
	}

	public Optional<Payee> getPayeeById(Long id) {
		return payeeRepository.findById(id);
	}

	public Iterable<Payee> getAllPayees() {
		return payeeRepository.findAll();
	}

	public Optional<Payee> updatePayee(Long payeeId, Payee updatedPayee) {
		return payeeRepository.findById(payeeId).map(payee -> {
			payee.setPayeeName(updatedPayee.getPayeeName());
			payee.setAccountNumber(updatedPayee.getAccountNumber());
			payee.setAddress(updatedPayee.getAddress());
			return payeeRepository.update(payee);
		});
	}

	public void deletePayee(Long id) {
		payeeRepository.deleteById(id);
	}
}
