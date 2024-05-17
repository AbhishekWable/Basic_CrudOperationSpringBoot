package springboot.april29springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("save")
    public String saveStudent(@RequestBody Student student){
      studentRepo.save(student);
      return "Student added successfully";
    }
    @GetMapping("getStudentList")
    public List<Student> getStudent( ){
      return studentRepo.findAll();
    }
    @GetMapping("getStudent/{id}")
    public Optional<Student> getStudent1(@PathVariable("id") Long id ){
        return studentRepo.findById(id);
    }
    @PutMapping("update")
    public String updateStudent(@RequestBody Student student ){
        studentRepo.save(student);
        return "Student updated successfully";
    }
    @PutMapping("update1")
    public String updateStudent1(@RequestBody Student student ){
        Optional<Student> student1=studentRepo.findById(student.getId());
        student1.get().setName(student.getName());
        student1.get().setAddress(student.getAddress());
        studentRepo.save(student1.get());
        return "Student updated successfully";
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentRepo.deleteById(id);
        return "Student deleted successfully";
    }
    @DeleteMapping("delete")
    public String deleteStudent(@RequestBody Student student){
        studentRepo.delete(student);
        return "Student deleted successfully";
    }
    @DeleteMapping("deleteAllByIds/{id}")
    public String deleteStudentById(@PathVariable("id") List<Long> id){
        studentRepo.deleteAllById(id);
        return "Student deleted successfully";
    }
    @GetMapping("search/{name}/{address}")
    public Student findByQuery(@PathVariable String name,@PathVariable("address")String address) {
        return studentRepo.findByNameAndAddress(name,address);
    }
    @GetMapping("find/{age}")
    public List<Student> findQuery(@PathVariable("age") Integer age) {
        return studentRepo.findAllByAge(age);
    }
    @GetMapping("find/{age}/{name}")
    public Student find(@PathVariable("age")Integer age,@PathVariable("name")String name){
        return studentRepo.findByAgeAndNameIgnoreCase(age,name);
    }
    @GetMapping("findName/{name}/{dob}")
    public Student findByDob(@PathVariable("name") String name, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob){
        return studentRepo.findByNameAndDob(name,dob);
    }
    @GetMapping("findByActive")
    public List<Student> findByActiveTrue() {
        return studentRepo.findByActiveTrue();
    }
    @GetMapping("findByActiveFalse")
    public List<Student> findByActiveFalse() {
        return studentRepo.findByActiveFalse();
    }
    @GetMapping("findByAgeNotIn/{age}")
    public List<Student> findByAgeNotIn(@PathVariable("age")List<Integer> age) {
        return studentRepo.findByAgeNotIn(age);
    }
    @GetMapping("findByAgeIn/{age}")
    public List<Student> findByAgeIn(@PathVariable("age")List<Integer> age) {
        return studentRepo.findByAgeIn(age);
    }
    @GetMapping("findByNameNot/{name}")
    public List<Student> findByNameNot(@PathVariable("name")String name) {
        return studentRepo.findByNameNot(name);
    }
   @GetMapping("findByDobBetween/{startDate}/{endDate}")
    public List<Student> findByDobBetween(@PathVariable("startDate")LocalDate startDate,@PathVariable("endDate")LocalDate endDate ) {
        return studentRepo.findByDobBetween(startDate,endDate);
    }
    @GetMapping("findByAgeOrderByNameDesc/{age}")
    public List<Student> findByAgeOrderByNameDesc(@PathVariable("age")Integer age) {
        return studentRepo.findByAgeOrderByNameDesc(age);
    }
    @GetMapping("findByNameContaining/{name}")
    public List<Student> findByNameContaining(@PathVariable("name")String name) {
        return studentRepo.findByNameContainingIgnoreCase(name);
    }
    @GetMapping("findByNameStartsWith/{name}")
    public List<Student> findByNameEndingWith(@PathVariable("name")String name) {
        return studentRepo.findByNameStartsWith(name);
    }
    @GetMapping("findByNameNotLike/{name}")
    public List<Student> findByNameNotLike(@PathVariable("name")String name) {
        return studentRepo.findByNameNotLike(name);
    }
    @GetMapping("findByNameLike/{name}")
    public List<Student> findByNameLike(@PathVariable("name")String name) {
        return studentRepo.findByNameLike(name);
    }
    @GetMapping("findByAgeIsNotNull")
    public List<Student> findByAgeIsNull() {
        return studentRepo.findByAgeIsNotNull();
    }
    @GetMapping("findByAgeIsNull")
    public List<Student> findByAgeIsNotNull() {
        return studentRepo.findByAgeIsNull();
    }
    @GetMapping("findByDobBefore/{dob}")
    public List<Student> findByDobBefore(@PathVariable("dob")LocalDate dob) {
        return studentRepo.findByDobBefore(dob);
    }
    @GetMapping("findByDobAfter/{dob}")
    public List<Student> findByDobAfter(@PathVariable("dob")LocalDate dob) {
        return studentRepo.findByDobAfter(dob);
    }
    @GetMapping("findByAgeGreaterThan")
    public List<Student> findByAgeGreaterThan(@RequestParam("age")Integer age) {
        return studentRepo.findByAgeGreaterThanEqual(age);
    }
    @GetMapping("findByAgeLessThanEqual/{age}")
    public List<Student> findByAgeLessThan(@PathVariable("age")Integer age) {
        return studentRepo.findByAgeLessThanEqual(age);
    }
    @GetMapping("findByNameEquals/{name}")
    public List<Student> findByNameEquals(@PathVariable("name")String name) {
        return studentRepo.findByNameEquals(name);
    }
    @GetMapping("findByNameOrAge/{name}/{age}")
    public List<Student> findByNameOrAge(@PathVariable String name,@PathVariable Integer age){
        return studentRepo.findByNameOrAge(name,age);
    }
    @GetMapping("findDistinctByNameAndAge/{name}/{age}")
    public List<Student> findDistinctByNameAndAge(@PathVariable String name,@PathVariable Integer age){
        return studentRepo.findDistinctByNameAndAge(name,age);
    }

}
