package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
