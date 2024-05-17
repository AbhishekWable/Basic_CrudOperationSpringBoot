package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetoone.entity.Car;

public interface CarRepo extends JpaRepository<Car,Long> {
}
