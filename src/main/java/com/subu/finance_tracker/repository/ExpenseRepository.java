package com.subu.finance_tracker.repository;

import com.subu.finance_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}