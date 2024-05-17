package springboot.april29springboot.registration.service;

import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;

public interface MaritalStatusService {
    MaritalStatus saveMaritalStatus(MaritalStatusRequestDto maritalStatusRequestDto);
}
