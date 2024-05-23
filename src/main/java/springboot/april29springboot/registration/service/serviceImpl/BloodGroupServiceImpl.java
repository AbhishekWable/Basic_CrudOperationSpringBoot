package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.BloodGroupRequestDto;
import springboot.april29springboot.registration.entity.BloodGroup;
import springboot.april29springboot.registration.repository.BloodGroupRepo;
import springboot.april29springboot.registration.service.BloodGroupService;

import java.util.List;
import java.util.Map;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {
    @Autowired
    private BloodGroupRepo bloodGroupRepo;

    @Override
    public BloodGroup saveBloodGroup(BloodGroupRequestDto bloodGroupRequestDto) {
        BloodGroup bg=new BloodGroup();
        bg.setBloodGroup(bloodGroupRequestDto.getBloodGroup());
        return bloodGroupRepo.save(bg);
    }

    @Override
    public ResponseEntity<?> getBloodGroupDropdown() {
        List<Map<String,Object>> getData=bloodGroupRepo.bloodGroupDropdown();
        return ResponseEntity.ok(getData);
    }
}
