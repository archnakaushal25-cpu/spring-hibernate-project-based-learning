package com.nimbus.tx.service;

import org.springframework.transaction.annotation.Transactional;

public class BankingService {
    @Transactional
    public void transfer(int fromAccountId, int toAccountId, double amount) {
        // Implement: deduct, add, save transaction (atomic)
    }
}
