package springboot.april29springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {
    Student findByNameAndAddress(String name,String address);
    List<Student> findAllByAge(Integer age);
    Student findByAgeAndNameIgnoreCase(Integer age,String name);
    Student findByNameAndDob(String name, LocalDate dob);
    List<Student> findByActiveTrue();
    List<Student> findByActiveFalse();
    List<Student> findByAgeNotIn(List<Integer>age);
    List<Student> findByAgeIn(List<Integer> age);
    List<Student> findByNameNot(String name);
    List<Student> findByDobBetween(LocalDate startDate, LocalDate endDate);
    List<Student> findByAgeOrderByNameDesc(Integer age);
    List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByNameStartsWith(String name);
    List<Student> findByNameNotLike(String name);
    List<Student> findByNameLike(String name);
    List<Student> findByAgeIsNotNull();
    List<Student> findByAgeIsNull();
    List<Student> findByDobBefore(LocalDate dob);
    List<Student> findByDobAfter(LocalDate dob);
    List<Student> findByAgeGreaterThanEqual(Integer age);
    List<Student> findByAgeLessThanEqual(Integer age);
    List<Student> findByNameEquals(String name);
    List<Student> findByNameOrAge(String name, Integer age);
    List<Student> findDistinctByNameAndAge(String name, Integer age);
    List<Student> findDistinctByName(String name);
}
