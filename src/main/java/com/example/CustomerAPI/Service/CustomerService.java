package com.example.CustomerAPI.Service;

import com.example.CustomerAPI.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getALlCustomers();
}
