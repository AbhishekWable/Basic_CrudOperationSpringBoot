package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.IsdCodeRequestDto;
import springboot.april29springboot.registration.service.IsdCodeService;

@RestController
@CrossOrigin("*")
public class IsdCodeController {
    @Autowired
    private IsdCodeService isdCodeService;
    @PostMapping("saveIsdCode")
    public String saveIsdCode(@RequestBody IsdCodeRequestDto isdCodeRequestDto){
        isdCodeService.saveIsdCode(isdCodeRequestDto);
        return "Isd code saved";
    }
    @GetMapping("getIsdCodeDropdown")
    public ResponseEntity<?> getIsdCodeDropdown(){
        return isdCodeService.getIsdCodeDropdown();
    }

}
