package com.mhope;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> firstCriteriaList = firstCriteria.meetCriteria(customers);

        return secondCriteria.meetCriteria(firstCriteriaList);
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
