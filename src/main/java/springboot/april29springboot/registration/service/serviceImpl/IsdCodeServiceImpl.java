package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.IsdCodeRequestDto;
import springboot.april29springboot.registration.entity.IsdCode;
import springboot.april29springboot.registration.repository.IsdCodeRepo;
import springboot.april29springboot.registration.service.IsdCodeService;

import java.util.List;
import java.util.Map;

@Service
public class IsdCodeServiceImpl implements IsdCodeService {
    @Autowired
    private IsdCodeRepo isdCodeRepo;

    @Override
    public IsdCode saveIsdCode(IsdCodeRequestDto isdCodeRequestDto) {
        IsdCode is=new IsdCode();
        is.setIsdCode(isdCodeRequestDto.getIsdCode());
        return isdCodeRepo.save(is);
    }

    @Override
    public ResponseEntity<?> getIsdCodeDropdown() {
        List<Map<String,Object>> getData=isdCodeRepo.getIsdCodeDropdown();
        return ResponseEntity.ok(getData);
    }
}
