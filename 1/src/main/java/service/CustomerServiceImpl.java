package service;
import model.Customer;
import repository.CustomerRepository;

import java.util.List;
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> getCustomerList() {
        return customerRepository.getCustomerList();
    }

    @Override
    public void createCustomer(Customer customer) {
    customerRepository.createCustomer(customer);
    }
}
