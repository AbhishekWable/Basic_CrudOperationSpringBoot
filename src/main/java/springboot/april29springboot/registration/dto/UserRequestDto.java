package springboot.april29springboot.registration.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.registration.entity.BloodGroup;
import springboot.april29springboot.registration.entity.Gender;
import springboot.april29springboot.registration.entity.MaritalStatus;

import java.time.LocalDate;
@Getter
@Setter
public class UserRequestDto {

    private Long id;
    private String email;
    private String fName;
    private String mName;
    private String lName;
    private LocalDate dob;
    private Integer age;
    private Gender gender;
    private Long mob;

    private MaritalStatus maritalStatusId;

    private String nationality;

    private BloodGroup bloodGroupId;

}
