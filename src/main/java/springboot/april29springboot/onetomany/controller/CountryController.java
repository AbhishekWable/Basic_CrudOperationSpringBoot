package springboot.april29springboot.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.onetomany.dto.CountryRequestDto;
import springboot.april29springboot.onetomany.entity.Country;
import springboot.april29springboot.onetomany.repository.CountryRepo;
import springboot.april29springboot.onetomany.service.CountryService;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

@PostMapping("saveCountry")
    public String saveCountry(@RequestBody CountryRequestDto countryRequestDto){
      countryService.saveCountry(countryRequestDto);
        return "Country saved";
    }
}
