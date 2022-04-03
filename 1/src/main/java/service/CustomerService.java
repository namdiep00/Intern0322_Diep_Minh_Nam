package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomerList();
    public void createCustomer(Customer customer);
}
