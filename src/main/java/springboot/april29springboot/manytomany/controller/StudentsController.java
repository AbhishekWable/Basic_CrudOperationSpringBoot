package springboot.april29springboot.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.manytomany.entity.Students;
import springboot.april29springboot.manytomany.repository.StudentsRepo;

@RestController
public class StudentsController {
    @Autowired
    private StudentsRepo studentsRepo;
    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody Students students){
        studentsRepo.save(students);
        return "Student saved";
    }
}
// {
//             "rollNumber":1,
//             "name":"Raj",
//             "coursesList":[
//                 {
//                     "id":1
//                 },
//                 {
//                     "id":2
//                 }
//             ]
//         }
