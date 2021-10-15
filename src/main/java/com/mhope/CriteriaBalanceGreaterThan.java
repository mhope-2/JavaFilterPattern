package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaBalanceGreaterThan implements Criteria {

    List<Customer> customers;
    Double balance;

    public CriteriaBalanceGreaterThan(Double balance) {

        this.balance = balance;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> listOfCustomers, Double balance) {
       List<Customer> customerList = new ArrayList<>();

       for (Customer customer : listOfCustomers){
           if(customer.getBalance() >= balance){
               customerList.add(customer);
           }
       }
       return customerList;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        return null;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears) {
        return null;
    }
}
