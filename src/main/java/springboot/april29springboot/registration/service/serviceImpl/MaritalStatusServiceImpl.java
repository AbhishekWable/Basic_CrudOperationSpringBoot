package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;
import springboot.april29springboot.registration.repository.MaritalStatusRepo;
import springboot.april29springboot.registration.service.MaritalStatusService;

import java.util.List;
import java.util.Map;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
    @Autowired
    private MaritalStatusRepo maritalStatusRepo;
    @Override
    public MaritalStatus saveMaritalStatus(MaritalStatusRequestDto maritalStatusRequestDto) {
        MaritalStatus ms=new MaritalStatus();
        ms.setMaritalStatus(maritalStatusRequestDto.getMaritalStatus());
        return maritalStatusRepo.save(ms);
    }

    @Override
    public ResponseEntity<?> getMaritalStatusDropdown() {
        List<Map<String,Object>> getData=maritalStatusRepo.getMaritalStatusDropdown();
        return ResponseEntity.ok(getData);
    }
}
