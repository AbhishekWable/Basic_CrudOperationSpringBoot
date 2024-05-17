package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.Gender;

public interface GenderRepo extends JpaRepository<Gender,Long> {
}
