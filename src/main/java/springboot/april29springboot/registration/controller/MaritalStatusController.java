package springboot.april29springboot.registration.controller;

import jdk.javadoc.doclet.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;
import springboot.april29springboot.registration.service.MaritalStatusService;

@RestController
@CrossOrigin("*")

public class MaritalStatusController {
    @Autowired
    private MaritalStatusService maritalStatusService;
    @PostMapping("saveMaritalStatus")
    public String saveMaritalStatus(@RequestBody MaritalStatusRequestDto maritalStatusRequestDto){
        maritalStatusService.saveMaritalStatus(maritalStatusRequestDto);
        return "Marital Status Added.";
    }
    @GetMapping("getMaritalStatusDropDown")
    ResponseEntity<?> getMaritalStatusDropDown(){
        return maritalStatusService.getMaritalStatusDropdown();
    }
}
