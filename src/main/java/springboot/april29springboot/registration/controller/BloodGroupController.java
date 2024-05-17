package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.BloodGroupRequestDto;
import springboot.april29springboot.registration.entity.BloodGroup;
import springboot.april29springboot.registration.service.BloodGroupService;

@RestController
public class BloodGroupController {
    @Autowired
    private BloodGroupService bloodGroupService;
    @PostMapping("saveBloodGroup")
    public String saveBloodGroup(@RequestBody BloodGroupRequestDto bloodGroupRequestDto){
        bloodGroupService.saveBloodGroup(bloodGroupRequestDto);
        return "Blood Group Saved!!!";
    }
}
