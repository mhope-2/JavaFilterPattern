package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaYearsGreaterThan implements Criteria{

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, Double balance) {
        return null;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        return null;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears) {
        List<Customer> customerList = new ArrayList<>();

        for (Customer customer : customers){
            if(customer.getNumberOfYears() >= numberOfYears){
                customerList.add(customer);
            }
        }
        return customerList;
    }


}