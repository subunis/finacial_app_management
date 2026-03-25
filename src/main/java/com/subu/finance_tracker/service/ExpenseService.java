package com.subu.finance_tracker.service;

import com.subu.finance_tracker.model.Expense;
import com.subu.finance_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    // Add expense
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // Get all expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}