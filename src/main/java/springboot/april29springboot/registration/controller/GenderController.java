package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.GenderRequestDto;
import springboot.april29springboot.registration.entity.Gender;
import springboot.april29springboot.registration.service.GenderService;

import java.util.List;

@RestController
@CrossOrigin("*")

public class GenderController {
    @Autowired
    private GenderService genderService;
    @PostMapping("saveGender")
    public String saveGender(@RequestBody GenderRequestDto genderRequestDto){
        genderService.saveGender(genderRequestDto);
        return "Gender Saved";
    }
    @GetMapping("getGender")
    public ResponseEntity<?> genderDropdown(){
        return genderService.getGenderDropdown();
    }
}
