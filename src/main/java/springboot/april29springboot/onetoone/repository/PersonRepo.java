package springboot.april29springboot.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.stylesheets.LinkStyle;
import springboot.april29springboot.onetoone.entity.Person;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person,Long> {
@Query(value = "select * from person where id=? and name=?", nativeQuery = true)
    Person getPersonByIdAndName(Long id,String name);
}
