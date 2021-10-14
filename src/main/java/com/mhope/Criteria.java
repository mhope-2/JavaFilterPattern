package com.mhope;

import java.util.List;

public interface Criteria {
    public List<Customer> meetCriteria(List<Customer> customers);

    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears);

    public List<Customer> meetCriteria(List<Customer> customers, Double balance);

}
