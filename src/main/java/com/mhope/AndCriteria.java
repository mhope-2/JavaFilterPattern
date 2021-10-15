package com.mhope;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    public Criteria getFirstCriteria() {
        return this.firstCriteria;
    }

    public Criteria getSecondCriteria() {
        return this.secondCriteria;
    }


    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> firstCustomerList = this.firstCriteria.meetCriteria(customers);
        return this.secondCriteria.meetCriteria(firstCustomerList);
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, Double balance) {

        return null;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears) {
        return null;
    }
}
