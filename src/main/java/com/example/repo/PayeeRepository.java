package com.example.repo;

import com.example.model.Payee;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PayeeRepository extends CrudRepository<Payee, Long> {
}