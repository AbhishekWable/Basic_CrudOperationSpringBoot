package springboot.april29springboot.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetomany.entity.State;

public interface StateRepo extends JpaRepository<State,Long> {
}
