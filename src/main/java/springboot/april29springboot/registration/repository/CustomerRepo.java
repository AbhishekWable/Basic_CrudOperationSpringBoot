package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
