package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.dto.NationalityRequestDto;
import springboot.april29springboot.registration.entity.Nationality;

import java.util.List;
import java.util.Map;

public interface NationalityRepo extends JpaRepository<Nationality,Long> {
    @Query(value = "select * from getNationalityDropdown()",nativeQuery = true)
    List<Map<String,Object>> getNationalityDropdown();


}
