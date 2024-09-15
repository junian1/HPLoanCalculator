package org.HPLoanCalculator;

public class HPLoan {
    private float loanAmount;
    private float downPayment;
    private Integer tenureYear;
    private float interestRate;
    private float installmentAmountMonth;
    private float installmentAmountYear;

    public float calculateInstallmentMonth(float loanAmount, Integer tenure, float interestRate) {
        Integer tenureMonth = getTenureMonth(tenure);
        float rateMonth = getRateMonth(tenure, interestRate);
        float effectiveRate = rateMonth / tenureMonth;
        installmentAmountMonth = effectiveRate * loanAmount;
        return installmentAmountMonth;
    };

    public float getInstallmentAmountMonth() {
        return installmentAmountMonth;
    }

    public float getInstallmentAmountYear() {
        return installmentAmountMonth * 12;
    }

    private Integer getTenureMonth(Integer tenureYear) {
        return tenureYear * 12;
    }

    private float getRateMonth(Integer tenureYear, float interestRate) {
        return  1 + tenureYear * interestRate; // or interestrate/12;
    }
}
