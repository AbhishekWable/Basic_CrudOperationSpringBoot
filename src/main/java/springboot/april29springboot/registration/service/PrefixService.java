package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;

import java.util.List;

public interface PrefixService {
    Prefix savePrefix(PrefixRequestDto prefixRequestDto);
    ResponseEntity<?> getPrefixDropdown();

}
