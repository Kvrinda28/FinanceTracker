package com.financetraker.FinanceTraker;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // This repository now has all basic CRUD methods

    // Custom query to get all transactions of a specific type (e.g., income or expense)
    List<Transaction> findByType(String type);
}