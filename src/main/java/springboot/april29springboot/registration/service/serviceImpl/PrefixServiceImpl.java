package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.PrefixRequestDto;
import springboot.april29springboot.registration.entity.Prefix;
import springboot.april29springboot.registration.repository.PrefixRepo;
import springboot.april29springboot.registration.service.PrefixService;
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
}
