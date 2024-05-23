package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.NationalityRequestDto;
import springboot.april29springboot.registration.entity.Nationality;
import springboot.april29springboot.registration.repository.NationalityRepo;
import springboot.april29springboot.registration.service.NationalityService;

import java.util.List;
import java.util.Map;

@Service
public class NationalityServiceImpl implements NationalityService {
    @Autowired
    private NationalityRepo nationalityRepo;
    @Override
    public Nationality saveNationality(NationalityRequestDto nationalityRequestDto) {
        Nationality na=new Nationality();
        na.setNationality(nationalityRequestDto.getNationality());
        return nationalityRepo.save(na);
    }

    @Override
    public ResponseEntity<?> getNationalityDropdown() {
        List<Map<String,Object>> getData=nationalityRepo.getNationalityDropdown();
        return ResponseEntity.ok(getData);
    }
}
