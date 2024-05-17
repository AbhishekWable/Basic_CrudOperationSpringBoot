package springboot.april29springboot.registration.service;

import springboot.april29springboot.registration.dto.UserRequestDto;
import springboot.april29springboot.registration.entity.UserData;


public interface UserDataService {

    UserData saveUser(UserRequestDto userRequestDto);
}
