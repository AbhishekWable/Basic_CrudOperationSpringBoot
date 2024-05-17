package springboot.april29springboot.onetomany.service;

import springboot.april29springboot.onetomany.dto.CountryRequestDto;
import springboot.april29springboot.onetomany.entity.Country;

public interface CountryService {
    void saveCountry(CountryRequestDto countryRequestDto);
}
