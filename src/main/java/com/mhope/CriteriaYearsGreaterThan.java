package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaYearsGreaterThan implements Criteria{

//    List<Customer> customers;
//    int numberOfYears;
//
//    public CriteriaYearsGreaterThan(int numberOfYears) {
//        this.numberOfYears = numberOfYears;
//    }

//    @Override
//    public List<Customer> meetCriteria(List<Customer> customers, Double balance) {
//        return null;
//    }

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

//    @Override
//    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears) {
//        List<Customer> customerList = new ArrayList<>();
//
//        for (Customer customer : customers){
//            if(customer.getNumberOfYears() >= numberOfYears){
//                customerList.add(customer);
//            }
//        }
//        return customerList;
//    }


}
