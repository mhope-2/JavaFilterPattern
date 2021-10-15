package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> allCustomers = new ArrayList<>();

        allCustomers.add(new Customer(1, "Ariana Grande",100.00,10));
        allCustomers.add(new Customer(2, "Ama Ghana", 100_000.00, 2));
        allCustomers.add(new Customer(3, "Ato Kwamina", 10_000.00, 10));
        allCustomers.add(new Customer(4, "Kwaku Nti", 20_000.00, 15));
        allCustomers.add(new Customer(5, "Ama Kumi", 8_000.00, 5));
        allCustomers.add(new Customer(6, "Tom Jerry", 15_000.00, 2));
        allCustomers.add(new Customer(7, "Chris Ransome", 30_000.00, 7));
        allCustomers.add(new Customer(8, "Jane Mensah", 10_000.00, 15));
        allCustomers.add(new Customer(9, "Mike Brown", 20_000.00, 10));
        allCustomers.add(new Customer(10, "Yaw Hope", 10_000.00, 15));

        Criteria balanceGreaterThan20 = new CriteriaBalanceGreaterThan(20_000.00);
        Criteria balanceGreaterThan100 = new CriteriaBalanceGreaterThan(100_000.00);
        Criteria yearsGreaterThan10 = new CriteriaYearsGreaterThan(10);
        Criteria andCriteria = new AndCriteria(balanceGreaterThan20, yearsGreaterThan10);
        Criteria orCriteria = new OrCriteria(andCriteria, balanceGreaterThan100);

//        System.out.println("All customers");
//        printCustomers(allCustomers);

        System.out.println("Customers with balance greater than 20,000.00: ");
        printCustomers(balanceGreaterThan20.meetCriteria(allCustomers, 20_000.00));

//
        System.out.println("\nCustomers who have been with the institution for at least 10 years: ");
        printCustomers(yearsGreaterThan10.meetCriteria(allCustomers, 10));

        System.out.println();
//
        System.out.println("\nCustomers with at least 20,000.00 and at least 10 years: QUALIFIED");
        printCustomers(andCriteria.meetCriteria(allCustomers));


//        System.out.println();
////
//        System.out.println("\nCustomers with at least 20,000.00 and at least 10 years OR Customers with at least 100,000.00: QUALIFIED");
//        printCustomers(orCriteria.meetCriteria(allCustomers));
    }

    public static void printCustomers(List<Customer> allCustomers){

        for (Customer customer : allCustomers) {
            System.out.println("Customer : [ Name : " + customer.getName() + ", Balance : " + customer.getBalance() + ", Number of Years : " + customer.getNumberOfYears() + " ]");
        }

}

}
