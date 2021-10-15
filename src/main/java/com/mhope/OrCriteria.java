package com.mhope;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;
//
    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> firstCriteriaList = this.firstCriteria.meetCriteria(customers);
        List<Customer> secondCriteriaList = this.secondCriteria.meetCriteria(customers);

        for (Customer customer : secondCriteriaList) {
            if(!firstCriteriaList.contains(customer)){
                firstCriteriaList.add(customer);
            }
        }
        return firstCriteriaList;
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
