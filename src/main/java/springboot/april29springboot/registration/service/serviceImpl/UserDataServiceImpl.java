package springboot.april29springboot.registration.service.serviceImpl;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.UserRequestDto;
import springboot.april29springboot.registration.entity.UserData;
import springboot.april29springboot.registration.repository.UserDataRepo;
import springboot.april29springboot.registration.service.UserDataService;


@Service
public class UserDataServiceImpl implements UserDataService {
    @Autowired
    private UserDataRepo userDataRepo;
    @Override
    public UserData saveUser(UserRequestDto userRequestDto) {
        UserData usr=new UserData();
        usr.setEmail(userRequestDto.getEmail());
        usr.setFName(userRequestDto.getFName());
        usr.setMName(userRequestDto.getMName());
        usr.setLName(userRequestDto.getLName());
        usr.setDob(userRequestDto.getDob());
        usr.setAge(userRequestDto.getAge());
        usr.setGender(userRequestDto.getGender());
        usr.setMob(userRequestDto.getMob());
        usr.setMaritalStatus(userRequestDto.getMaritalStatusId());
        usr.setNationality(userRequestDto.getNationality());
        usr.setBloodGroup(userRequestDto.getBloodGroup());
        usr.setPrefix(userRequestDto.getPrefix());
        return userDataRepo.save(usr);
    }
}
