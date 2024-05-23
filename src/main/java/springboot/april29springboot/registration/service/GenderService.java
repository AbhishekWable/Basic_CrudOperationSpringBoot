package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.GenderRequestDto;
import springboot.april29springboot.registration.entity.Gender;

import java.util.List;

public interface GenderService {
    Gender saveGender(GenderRequestDto genderRequestDto);
    ResponseEntity<?> getGenderDropdown();
}
