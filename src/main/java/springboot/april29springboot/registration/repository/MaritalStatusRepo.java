package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.MaritalStatus;

public interface MaritalStatusRepo extends JpaRepository<MaritalStatus,Long> {
}
