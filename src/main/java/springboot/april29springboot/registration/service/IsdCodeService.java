package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.IsdCodeRequestDto;
import springboot.april29springboot.registration.entity.IsdCode;

public interface IsdCodeService {
    IsdCode saveIsdCode(IsdCodeRequestDto isdCodeRequestDto);
    ResponseEntity<?> getIsdCodeDropdown();
}
