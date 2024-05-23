package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.NationalityRequestDto;
import springboot.april29springboot.registration.service.NationalityService;

@RestController
@CrossOrigin("*")
public class NationalityController {
    @Autowired
    private NationalityService nationalityService;
    @PostMapping("saveNationality")
    public String saveNationality(@RequestBody NationalityRequestDto nationalityRequestDto){
        nationalityService.saveNationality(nationalityRequestDto);
        return "Nationality Saved";
    }
    @GetMapping("getNationalityDropdown")
    public ResponseEntity<?> getNationalityDropdown(){
        return nationalityService.getNationalityDropdown();
    }
}
