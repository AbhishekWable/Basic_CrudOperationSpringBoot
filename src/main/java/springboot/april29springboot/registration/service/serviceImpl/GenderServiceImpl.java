package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.GenderRequestDto;
import springboot.april29springboot.registration.entity.Gender;
import springboot.april29springboot.registration.repository.GenderRepo;
import springboot.april29springboot.registration.service.GenderService;

import java.util.List;
import java.util.Map;

@Service
public class GenderServiceImpl implements GenderService {
    @Autowired
    private GenderRepo genderRepo;
    @Override
    public Gender saveGender(GenderRequestDto genderRequestDto) {
        Gender gn=new Gender();
        gn.setGenderName(genderRequestDto.getGenderName());
        return genderRepo.save(gn);
    }

    @Override
    public ResponseEntity<?> getGenderDropdown() {
        List<Map<String,Object>> getData=genderRepo.genderDropdown();
        return ResponseEntity.ok(getData);
    }


}
