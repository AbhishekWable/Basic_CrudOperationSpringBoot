package springboot.april29springboot.registration.service;

import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;

public interface PrefixService {
    Prefix savePrefix(PrefixRequestDto prefixRequestDto);
}
