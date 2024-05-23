package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;
import springboot.april29springboot.registration.service.PrefixService;

import java.util.List;

@RestController
@CrossOrigin("*")

public class PrefixController {
    @Autowired
    private PrefixService prefixService;

    @PostMapping("SavePrefix")
    public String savePrefix(@RequestBody PrefixRequestDto prefixRequestDto) {
        prefixService.savePrefix(prefixRequestDto);
        return "Prefix Saved";
    }

    @GetMapping("prefixDropdown")
    public ResponseEntity<?> getPrefixDropdown() {
        return prefixService.getPrefixDropdown();
    }
}
