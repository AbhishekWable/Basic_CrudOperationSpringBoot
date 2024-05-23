package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.BloodGroupRequestDto;
import springboot.april29springboot.registration.entity.BloodGroup;
import springboot.april29springboot.registration.entity.Gender;
import springboot.april29springboot.registration.service.BloodGroupService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class BloodGroupController {
    @Autowired
    private BloodGroupService bloodGroupService;
    @PostMapping("saveBloodGroup")
    public String saveBloodGroup(@RequestBody BloodGroupRequestDto bloodGroupRequestDto){
        bloodGroupService.saveBloodGroup(bloodGroupRequestDto);
        return "Blood Group Saved!!!";
    }
    @GetMapping("getBloodGroupDropDown")
    public ResponseEntity<?> getBloodGroupDropdown(){
        return bloodGroupService.getBloodGroupDropdown();
    }
}
