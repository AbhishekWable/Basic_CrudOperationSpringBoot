package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;
import springboot.april29springboot.registration.service.MaritalStatusService;

@RestController
public class MaritalStatusController {
    @Autowired
    private MaritalStatusService maritalStatusService;
    @PostMapping("saveMaritalStatus")
    public String saveMaritalStatus(@RequestBody MaritalStatusRequestDto maritalStatusRequestDto){
        maritalStatusService.saveMaritalStatus(maritalStatusRequestDto);
        return "Marital Status Added.";
    }
}
