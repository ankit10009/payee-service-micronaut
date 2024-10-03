package com.example.repo;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import com.example.model.Payee;

@Repository
public interface PayeeRepository extends CrudRepository<Payee, Long> {
}
