package springboot.april29springboot.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.onetoone.entity.Aadhar;
import springboot.april29springboot.onetoone.entity.Person;
import springboot.april29springboot.onetoone.repository.AadharRepo;
import springboot.april29springboot.onetoone.repository.PersonRepo;

import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private AadharRepo aadharRepo;

    @Autowired
    private PersonRepo personRepo;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person){

//      personRepo.save(person);

        Aadhar adhar = new Aadhar();
        adhar.setNumber(person.getAadhar().getNumber());
        aadharRepo.save(adhar);

        Person person1 = new Person();
        person1.setAadhar(adhar);
        person1.setName(person.getName());
        person1.setAddress(person.getAddress());
        personRepo.save(person1);
        return "person saved..";

    }
    @GetMapping("getPersonByIdAndName/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personRepo.findById(id);
    }
}
