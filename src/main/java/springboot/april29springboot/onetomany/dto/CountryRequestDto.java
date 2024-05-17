package springboot.april29springboot.onetomany.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.onetomany.entity.State;

import java.util.Set;

@Getter
@Setter
public class CountryRequestDto {
    private Long id;
    private String name;
    private Integer c_code;

    private Set<State> states;
}
