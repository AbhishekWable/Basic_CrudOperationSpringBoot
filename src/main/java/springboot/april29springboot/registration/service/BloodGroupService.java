package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.BloodGroupRequestDto;
import springboot.april29springboot.registration.entity.BloodGroup;

public interface BloodGroupService {
    BloodGroup saveBloodGroup(BloodGroupRequestDto bloodGroupRequestDto);
    ResponseEntity<?> getBloodGroupDropdown();
}
