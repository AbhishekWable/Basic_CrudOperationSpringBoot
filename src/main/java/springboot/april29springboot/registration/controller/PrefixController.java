package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;
import springboot.april29springboot.registration.service.PrefixService;

@RestController
public class PrefixController {
    @Autowired
    private PrefixService prefixService;
    @PostMapping("SavePrefix")
    public String savePrefix(@RequestBody PrefixRequestDto prefixRequestDto){
        prefixService.savePrefix(prefixRequestDto);
        return "Prefix Saved";
    }
}
