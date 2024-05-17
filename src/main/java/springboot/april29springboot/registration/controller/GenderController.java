package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.GenderRequestDto;
import springboot.april29springboot.registration.service.GenderService;

@RestController
public class GenderController {
    @Autowired
    private GenderService genderService;
    @PostMapping("saveGender")
    public String saveGender(@RequestBody GenderRequestDto genderRequestDto){
        genderService.saveGender(genderRequestDto);
        return "Gender Saved";
    }
}
