package springboot.april29springboot.registration.dto;

import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.registration.entity.*;

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
    private IsdCode isdCode;
    private MaritalStatus maritalStatusId;

    private Nationality nationality;

    private BloodGroup bloodGroup;

}
