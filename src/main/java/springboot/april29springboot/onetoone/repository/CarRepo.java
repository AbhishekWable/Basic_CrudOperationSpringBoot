package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetoone.entity.Car;
import springboot.april29springboot.onetoone.entity.Person;

public interface CarRepo extends JpaRepository<Car,Long> {
    Car getCarByCarName(String carName);
}
