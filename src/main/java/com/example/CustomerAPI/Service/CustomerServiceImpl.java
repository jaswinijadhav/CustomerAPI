package com.example.CustomerAPI.Service;

import com.example.CustomerAPI.Entity.Customer;
import com.example.CustomerAPI.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getALlCustomers() {
        return customerRepository.findAll();
    }
}
