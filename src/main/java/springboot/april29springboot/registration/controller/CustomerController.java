package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer Saved";
    }
}
