package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetoone.entity.Driver;

public interface DriverRepo extends JpaRepository<Driver,Long> {
}
