package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.registration.entity.Prefix;

public interface PrefixRepo extends JpaRepository<Prefix,Long> {
}
