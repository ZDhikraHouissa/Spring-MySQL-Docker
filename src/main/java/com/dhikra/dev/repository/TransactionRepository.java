package com.dhikra.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhikra.dev.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
