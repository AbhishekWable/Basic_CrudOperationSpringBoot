package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetoone.entity.Aadhar;

public interface AadharRepo extends JpaRepository<Aadhar,Long> {
}
