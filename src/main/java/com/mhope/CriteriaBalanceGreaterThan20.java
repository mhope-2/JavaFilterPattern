package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaBalanceGreaterThan20 implements Criteria {


    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        List<Customer> customerList = new ArrayList<>();

        for (Customer customer : customers){
            if(customer.getBalance() >= 20_000.00){
                customerList.add(customer);
            }
        }
        return customerList;
    }

}
