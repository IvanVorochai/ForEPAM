package module4.part1.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerAggregatorList {

    private List<Customer> customerList;

    public CustomerAggregatorList() {
        this.customerList = new ArrayList<>();
    }

    public CustomerAggregatorList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void showAlphabeticBySurname() {
        //  Collections.sort(customerList, Comparator.comparing(Customer::getSurname)); <-- упрощение
        //  customerList.sort(new Comparator<Customer>() {   <-- упрощение
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public void showCreditCardByRange(long start, long end) {

        for (Customer customer : customerList) {
            if (customer.getCreditCardNumber() >= start && customer.getCreditCardNumber() <= end) {
                System.out.println(customer);
            }
        }
    }

}
