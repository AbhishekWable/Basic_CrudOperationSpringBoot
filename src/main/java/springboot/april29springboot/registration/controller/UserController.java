package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.UserRequestDto;
import springboot.april29springboot.registration.entity.UserData;
import springboot.april29springboot.registration.service.UserDataService;


@RestController
@RequestMapping("registration")
public class UserController {
    @Autowired
    private UserDataService userDataService;
    @PostMapping("saveUser")
    public String saveData(@RequestBody UserRequestDto userRequestDto){
         userDataService.saveUser(userRequestDto);
         return "User Added Successfully...";
    }
}
