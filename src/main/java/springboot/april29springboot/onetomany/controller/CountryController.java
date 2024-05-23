package springboot.april29springboot.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.onetomany.dto.CountryRequestDto;
import springboot.april29springboot.onetomany.entity.Country;
import springboot.april29springboot.onetomany.repository.CountryRepo;
import springboot.april29springboot.onetomany.service.CountryService;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;
    @Autowired
    private CountryRepo countryRepo;

@PostMapping("saveCountry")
    public String saveCountry(@RequestBody CountryRequestDto countryRequestDto){
      countryService.saveCountry(countryRequestDto);
        return "Country saved";
    }
    @GetMapping("findByIdAndName/{id}/{name}")
    public List<Country> findByIdAndName(@PathVariable Long id,@PathVariable String name){
    return countryRepo.findByIdAndName(id,name);
    }
    @GetMapping("getFunctionData")
    Long getFunctionData(@RequestParam("a")Long a,@RequestParam("b") Long b){
    return countryRepo.getFunctionData(a,b);
    }
}
