package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.Gender;

import java.util.List;
import java.util.Map;

public interface GenderRepo extends JpaRepository<Gender,Long> {
    @Query(value = "select * from genderDropdown()",nativeQuery = true)
    List<Map<String,Object>> genderDropdown();


}
