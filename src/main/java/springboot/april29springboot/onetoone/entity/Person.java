package springboot.april29springboot.onetoone.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @OneToOne
    @JoinColumn(name = "aadhar_id")
//    @JsonManagedReference
    private Aadhar aadhar;
}


