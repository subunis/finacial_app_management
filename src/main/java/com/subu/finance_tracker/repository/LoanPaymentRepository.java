package com.subu.finance_tracker.repository;

import com.subu.finance_tracker.model.LoanPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanPaymentRepository extends JpaRepository<LoanPayment, Long> {
}