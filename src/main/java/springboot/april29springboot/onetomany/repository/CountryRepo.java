package springboot.april29springboot.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springboot.april29springboot.onetomany.entity.Country;

import java.util.List;

public interface CountryRepo extends JpaRepository<Country,Long> {
    @Query(value = "select * from country where id=? and name=?",nativeQuery = true)
    List<Country> findByIdAndName(Long id,String name);
    @Query(value = "select * from addTwoNumber(?1,?2)",nativeQuery = true)
    Long getFunctionData(@Param("a")Long a,@Param("b")Long b);
}
