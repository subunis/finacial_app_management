package com.subu.finance_tracker.controller;

import com.subu.finance_tracker.model.Loan;
import com.subu.finance_tracker.model.LoanPayment;
import com.subu.finance_tracker.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;
    // Add Loan API
    @PostMapping
    public Loan addLoan(@RequestBody Loan loan) {
        return loanService.addLoan(loan);
    }
    // Pay EMI API
    @PostMapping("/{loanId}/pay")
    public LoanPayment payEmi(@PathVariable Long loanId, @RequestParam double emiPaid) {
        return loanService.payEmi(loanId, emiPaid);
    }
}
