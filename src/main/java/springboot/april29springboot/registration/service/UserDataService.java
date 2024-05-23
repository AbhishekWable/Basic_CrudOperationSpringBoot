package springboot.april29springboot.registration.service;

import org.apache.catalina.User;
import springboot.april29springboot.registration.dto.UserRequestDto;
import springboot.april29springboot.registration.entity.UserData;

import java.util.List;


public interface UserDataService {

    UserData saveUser(UserRequestDto userRequestDto);
    List<UserData> getAllUser();
}
