package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaYearsGreaterThan10 implements Criteria{

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> customerList = new ArrayList<>();

        for (Customer customer : customers){
            if(customer.getNumberOfYears() >= 10){
                customerList.add(customer);
            }
        }
        return customerList;
    }

}
