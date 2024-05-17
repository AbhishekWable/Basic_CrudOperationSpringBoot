package springboot.april29springboot.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.onetoone.entity.Aadhar;
import springboot.april29springboot.onetoone.entity.Person;
import springboot.april29springboot.onetoone.repository.AadharRepo;
import springboot.april29springboot.onetoone.repository.PersonRepo;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private AadharRepo aadharRepo;

    @Autowired
    private PersonRepo personRepo;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person){

        personRepo.save(person);
        return "person saved..";



    }
    @GetMapping("getPersonByIdAndName/{id}/{name}")
    public Person getPerson(@PathVariable Long id,@PathVariable String name){
        return personRepo.getPersonByIdAndName(id,name);
    }
}
