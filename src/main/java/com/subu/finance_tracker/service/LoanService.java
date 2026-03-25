package com.subu.finance_tracker.service;

import com.subu.finance_tracker.model.Loan;
import com.subu.finance_tracker.model.LoanPayment;
import com.subu.finance_tracker.repository.LoanPaymentRepository;
import com.subu.finance_tracker.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private LoanPaymentRepository paymentRepository;

     // Add Loan
    public Loan addLoan(Loan loan) {
        loan.setRemainingPrincipal(loan.getPrincipal());
        return loanRepository.save(loan);
    }
        // Pay EMI
    public LoanPayment payEmi(Long loanId, double emiPaid) {

        Loan loan = loanRepository.findById(loanId).get();

        double monthlyRate = loan.getInterestRate() / 100 / 12;
        double interest = loan.getRemainingPrincipal() * monthlyRate;
        double principal = emiPaid - interest;
        double newBalance = loan.getRemainingPrincipal() - principal;

        LoanPayment payment = new LoanPayment();
        payment.setLoanId(loanId);
        payment.setPaymentDate(LocalDate.now());
        payment.setEmiPaid(emiPaid);
        payment.setInterestPaid(interest);
        payment.setPrincipalPaid(principal);
        payment.setRemainingPrincipal(newBalance);

        loan.setRemainingPrincipal(newBalance);

        loanRepository.save(loan);

        return paymentRepository.save(payment);
    }
}
