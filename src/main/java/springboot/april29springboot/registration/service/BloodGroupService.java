package springboot.april29springboot.registration.service;

import springboot.april29springboot.registration.dto.BloodGroupRequestDto;
import springboot.april29springboot.registration.entity.BloodGroup;

public interface BloodGroupService {
    BloodGroup saveBloodGroup(BloodGroupRequestDto bloodGroupRequestDto);
}
