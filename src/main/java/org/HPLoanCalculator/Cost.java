package org.HPLoanCalculator;

public class Cost {
    private float downPayment;
    private Integer tenureMonth;
    private float subYear;
    private float costMonth;

    public float calculateFirstYear(float downPayment, float maintenance) {
        return downPayment + maintenance;
    }

    public float calculateSubYear(float maintenance, float installmentAmountYear) {
        subYear = installmentAmountYear + maintenance;
        return subYear;
    }

    public float calculateMonthlyCost(float subYear) {
        costMonth = subYear / 12;
        return costMonth;
    }

    public float calculateSalary(float percentage) {
        return costMonth * 100 / percentage;
    }
}
