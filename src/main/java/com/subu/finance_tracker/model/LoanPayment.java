package com.subu.finance_tracker.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class LoanPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loan_id")
    private Long loanId;

    private LocalDate paymentDate;
    private double emiPaid;
    private double principalPaid;
    private double interestPaid;
    private double remainingPrincipal;
    

    // Getters and Setters

    public Long getId() { return id; }
    
    public Long getLoanId() { return loanId;}
    public void setLoanId(Long loanId) { this.loanId = loanId; }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public double getEmiPaid() { return emiPaid; }
    public void setEmiPaid(double emiPaid) { this.emiPaid = emiPaid; }

    public double getPrincipalPaid() { return principalPaid; }
    public void setPrincipalPaid(double principalPaid) { this.principalPaid = principalPaid;
    
    }
    public double getInterestPaid() { return interestPaid; }
    public void setInterestPaid(double interestPaid) { this.interestPaid = interestPaid; }  
    
    public double getRemainingPrincipal() { return remainingPrincipal; }
    public void setRemainingPrincipal(double remainingPrincipal) { this.remainingPrincipal = remainingPrincipal; }
}