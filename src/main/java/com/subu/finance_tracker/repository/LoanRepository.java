package com.subu.finance_tracker.repository;

import com.subu.finance_tracker.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
