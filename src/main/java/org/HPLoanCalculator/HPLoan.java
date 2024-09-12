package org.HPLoanCalculator;

public class HPLoan {
    private float loanAmount;
    private float downPayment;
    private Integer tenure;
    private float interestRate;
    private float installment;

    public float calculateInstallment(float loanAmount, Integer tenure, float interestRate) {
        Integer tenureMonth = getTenureMonth(tenure);
        float rateMonth = getRateMonth(tenure, interestRate);
        float effectiveRate = rateMonth / tenureMonth;
        return effectiveRate * loanAmount;
    };

    private Integer getTenureMonth(Integer tenure) {
        return tenure * 12;
    }

    private float getRateMonth(Integer tenure, float interestRate) {
        return  1 + tenure * interestRate;
    }
}
