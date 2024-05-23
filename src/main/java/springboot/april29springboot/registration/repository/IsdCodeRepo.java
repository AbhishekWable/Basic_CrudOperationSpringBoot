package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.IsdCode;

import java.util.List;
import java.util.Map;

public interface IsdCodeRepo extends JpaRepository<IsdCode,Long> {
    @Query(value = "select * from getIsdCodeDropdown()",nativeQuery = true)
    List<Map<String,Object>> getIsdCodeDropdown();
}
