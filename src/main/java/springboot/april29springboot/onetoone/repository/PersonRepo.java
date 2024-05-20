package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.onetoone.entity.Person;

import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person,Long> {
@Query(value = "select * from person where id=?", nativeQuery = true)
Optional<Person> findById(Long id);
}
