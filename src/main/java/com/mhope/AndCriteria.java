package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria){
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> filteredListOfCustomers = new ArrayList<>();

        filteredListOfCustomers = this.firstCriteria.meetCriteria(this.secondCriteria.meetCriteria(customers));

        return filteredListOfCustomers;
    }
}
