package springboot.april29springboot.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.april29springboot.manytomany.entity.Courses;

public interface CoursesRepo extends JpaRepository<Courses,Long> {
}
