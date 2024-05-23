package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;
import springboot.april29springboot.registration.repository.PrefixRepo;
import springboot.april29springboot.registration.service.PrefixService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class PrefixServiceImpl implements PrefixService {
    @Autowired
    private PrefixRepo prefixRepo;

    @Override
    public Prefix savePrefix(PrefixRequestDto prefixRequestDto) {
        Prefix pf=new Prefix();
        pf.setPrefix(prefixRequestDto.getPrefix());
        return prefixRepo.save(pf);
    }

    @Override
    public ResponseEntity getPrefixDropdown() {
        List<Map<String,Object>> getData=prefixRepo.getPrefixDropdown();
        return ResponseEntity.ok(getData);
    }


}
