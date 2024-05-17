package springboot.april29springboot.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.onetomany.entity.Country;

public interface CountryRepo extends JpaRepository<Country,Long> {
}
