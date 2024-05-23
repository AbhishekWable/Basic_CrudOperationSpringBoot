package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.repository.CustomerRepo;
import springboot.april29springboot.registration.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public Customer saveCustomer(Customer customer) {
        Customer cs=new Customer();
        cs.setName(customer.getName());
        cs.setAddress(customer.getAddress());
        return customerRepo.save(customer);
    }
}
