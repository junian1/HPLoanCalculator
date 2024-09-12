package org.HPLoanCalculator;

public class Car {
    private String model;
    private Integer year;
    private Integer price;

    public Car(String model, Integer year, Integer price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
