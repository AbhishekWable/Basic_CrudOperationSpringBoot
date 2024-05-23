package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.BloodGroup;

import java.util.List;
import java.util.Map;

public interface BloodGroupRepo extends JpaRepository<BloodGroup,Long> {
    @Query(value = "select * from bloodGroupDropdown()" ,nativeQuery = true)
    List<Map<String,Object>> bloodGroupDropdown();

}
