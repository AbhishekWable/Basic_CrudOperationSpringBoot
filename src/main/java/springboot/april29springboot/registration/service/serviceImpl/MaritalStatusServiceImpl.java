package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.MaritalStatusRequestDto;
import springboot.april29springboot.registration.entity.MaritalStatus;
import springboot.april29springboot.registration.repository.MaritalStatusRepo;
import springboot.april29springboot.registration.service.MaritalStatusService;
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
}
