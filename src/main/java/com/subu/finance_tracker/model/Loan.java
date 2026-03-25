package com.subu.finance_tracker.model;

import jakarta.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loanName;
    private double principal;
    private double interestRate;
    private double emi;
    private int tenureMonths;
    private double remainingPrincipal;

    // Getters and Setters

    public Long getId() { return id; }

    public String getLoanName() { return loanName; }
    public void setLoanName(String loanName) { this.loanName = loanName; }

    public double getPrincipal() { return principal; }
    public void setPrincipal(double principal) { this.principal = principal; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public double getEmi() { return emi; }
    public void setEmi(double emi) { this.emi = emi; }

    public int getTenureMonths() { return tenureMonths; }
    public void setTenureMonths(int tenureMonths) { this.tenureMonths = tenureMonths; }

    public double getRemainingPrincipal() { return remainingPrincipal; }
    public void setRemainingPrincipal(double remainingPrincipal) { this.remainingPrincipal = remainingPrincipal; }
}
