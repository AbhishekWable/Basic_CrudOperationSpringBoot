package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;

import java.util.List;
import java.util.Map;

public interface PrefixRepo extends JpaRepository<Prefix,Long> {
    @Query(value = "SELECT * FROM prefixdropdown()", nativeQuery = true)
    List<Map<String,Object>> getPrefixDropdown();
}
