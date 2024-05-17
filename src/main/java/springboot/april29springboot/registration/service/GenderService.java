package springboot.april29springboot.registration.service;

import springboot.april29springboot.registration.dto.GenderRequestDto;
import springboot.april29springboot.registration.entity.Gender;

public interface GenderService {
    Gender saveGender(GenderRequestDto genderRequestDto);
}
