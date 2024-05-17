package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.UserData;

public interface UserDataRepo extends JpaRepository<UserData,Long> {
}
