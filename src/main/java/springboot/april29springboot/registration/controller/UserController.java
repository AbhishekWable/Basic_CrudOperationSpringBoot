package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.UserRequestDto;
import springboot.april29springboot.registration.entity.UserData;
import springboot.april29springboot.registration.service.UserDataService;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("registration")
public class UserController {
    @Autowired
    private UserDataService userDataService;
    @PostMapping("saveUser")
    public String saveData(@RequestBody UserRequestDto userRequestDto){
         userDataService.saveUser(userRequestDto);
         return "User Added Successfully...";
    }
    @GetMapping("getAllUsers")
    public List<UserData> getAllUser(){
        return userDataService.getAllUser();
    }
}
