package com.fdmgroup.spm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.spm.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
