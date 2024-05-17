package springboot.april29springboot.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.manytomany.entity.Courses;
import springboot.april29springboot.manytomany.repository.CoursesRepo;

@RestController
public class CoursesController {
    @Autowired
    private CoursesRepo coursesRepo;
    @PostMapping("saveCourse")
    public String saveCourses(@RequestBody Courses courses){
        coursesRepo.save(courses);
        return "Course saved";
    }
}
