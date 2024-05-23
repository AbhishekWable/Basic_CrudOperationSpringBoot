package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.MaritalStatus;

import java.util.List;
import java.util.Map;

public interface MaritalStatusRepo extends JpaRepository<MaritalStatus,Long> {
    @Query(value = "select * from maritalstatusdropdown()",nativeQuery = true)
    List<Map<String,Object>> getMaritalStatusDropdown();
}
