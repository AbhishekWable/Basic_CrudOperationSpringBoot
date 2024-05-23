package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.NationalityRequestDto;
import springboot.april29springboot.registration.entity.Nationality;

public interface NationalityService {

    Nationality saveNationality(NationalityRequestDto nationalityRequestDto);

    ResponseEntity<?> getNationalityDropdown();
}
