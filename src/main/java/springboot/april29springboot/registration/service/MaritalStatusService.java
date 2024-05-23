package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;

public interface MaritalStatusService {
    MaritalStatus saveMaritalStatus(MaritalStatusRequestDto maritalStatusRequestDto);

    ResponseEntity<?> getMaritalStatusDropdown();
}
