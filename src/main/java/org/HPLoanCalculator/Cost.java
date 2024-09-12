package org.HPLoanCalculator;

public class Cost {
    private float firstYear;
    private float subYear;

    public float calculateFirstYear() {
        // first year amount (loan + other cost)
        return firstYear;
    }

    public float calculateSubYear() {
        // subsequent year amount (installment + maintenance)
        return subYear;
    }
}
