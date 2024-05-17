package springboot.april29springboot.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.manytomany.entity.Students;

public interface StudentsRepo extends JpaRepository<Students,Long> {
}
