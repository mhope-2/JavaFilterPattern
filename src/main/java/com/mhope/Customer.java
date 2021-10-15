package com.mhope;

public class Customer {

    private String name;
    private Integer ID;
    private Double balance;
    private int numberOfYears;

    public Customer(Integer ID, String name, Double balance, int numberOfYears) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        this.numberOfYears = numberOfYears;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }

}
