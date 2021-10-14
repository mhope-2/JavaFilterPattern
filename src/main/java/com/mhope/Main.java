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
        allCustomers.add(new Customer(6, "Tom Jerry", 20_000_000.00, 2));
        allCustomers.add(new Customer(7, "Chris Ransome", 30_000.00, 7));
        allCustomers.add(new Customer(8, "Jane Mensah", 10_000.00, 15));

        allCustomers.add(new Customer(9, "Mike Brown", 20_000.00, 8));
        allCustomers.add(new Customer(10, "Yaw Hope", 10_000.00, 15));

        Criteria balanceGreaterThan20 = new CriteriaBalanceGreaterThan();
        Criteria balanceGreaterThan100 = new CriteriaBalanceGreaterThan();
        Criteria yearsGreaterThan10 = new CriteriaYearsGreaterThan();
        Criteria premiumCustomers = new AndCriteria(balanceGreaterThan20, yearsGreaterThan10);
        Criteria dedicatedCustomers = new OrCriteria(balanceGreaterThan100,yearsGreaterThan10);

        System.out.println("Balance Greater Than 20,000: ");
        printPersons(balanceGreaterThan20.meetCriteria(allCustomers));

        System.out.println("\nYears Greater Than 10: ");
        printPersons(yearsGreaterThan10.meetCriteria(allCustomers));

        System.out.println("\nPremium Customers: ");
        printPersons(premiumCustomers.meetCriteria(allCustomers));

        System.out.println("\nDedicated Customers: ");
        printPersons(dedicatedCustomers.meetCriteria(allCustomers));
    }

    public static void printPersons(List<Customer> customers){

        for (Customer customer : customers) {
            System.out.println("Customer : [ Name : " + customer.getName() + ", Balance : " + customer.getBalance() + ", Number of Years : " + customer.getNumberOfYears() + " ]");
        }

}

}
