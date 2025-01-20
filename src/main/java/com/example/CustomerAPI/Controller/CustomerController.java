package com.example.CustomerAPI.Controller;

import com.example.CustomerAPI.Entity.Customer;
import com.example.CustomerAPI.Service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Operation(summary = "Get All Customers" , description = "Fetch a list of all Customers")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Customer fetched successfully")
    })
    @GetMapping("/getNewCustomers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return ResponseEntity.ok(customerService.getALlCustomers());
    }

    @Operation(summary = "Add Customers",description = "Add Customers to the Server")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Customer added successfully")
    })
    @PostMapping("/newCustomers")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer addCustomer =customerService.addCustomer(customer);
        return ResponseEntity.ok(addCustomer);
    }
}
