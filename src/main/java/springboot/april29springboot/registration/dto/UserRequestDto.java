package springboot.april29springboot.registration.dto;

import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.registration.entity.BloodGroup;
import springboot.april29springboot.registration.entity.Gender;
import springboot.april29springboot.registration.entity.MaritalStatus;
import springboot.april29springboot.registration.entity.Prefix;

import java.time.LocalDate;
@Getter
@Setter
public class UserRequestDto {

    private String email;
    private String fName;
    private String mName;
    private String lName;
    private LocalDate dob;
    private Integer age;
    private Gender gender;
    private Long mob;
    private Prefix prefix;
    private MaritalStatus maritalStatusId;

    private String nationality;

    private BloodGroup bloodGroup;

}
