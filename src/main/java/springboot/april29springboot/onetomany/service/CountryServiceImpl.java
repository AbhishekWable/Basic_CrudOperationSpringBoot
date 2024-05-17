package springboot.april29springboot.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.onetomany.dto.CountryRequestDto;
import springboot.april29springboot.onetomany.entity.Country;
import springboot.april29springboot.onetomany.entity.State;
import springboot.april29springboot.onetomany.repository.CountryRepo;
import springboot.april29springboot.onetomany.repository.StateRepo;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepo countryRepo;

    @Autowired
    private StateRepo stateRepo;

    @Override
    public void saveCountry(CountryRequestDto countryRequestDto) {
        var country1=new Country();
        country1.setName(countryRequestDto.getName());
        country1.setC_code(countryRequestDto.getC_code());
        countryRepo.save(country1);

        var state1=new State();

        state1.setCountry(country1);
        state1.setName(state1.getName());
        state1.setS_code(state1.getS_code());
        stateRepo.save(state1);
    }
}
