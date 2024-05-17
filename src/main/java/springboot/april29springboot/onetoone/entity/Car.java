package springboot.april29springboot.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carName;
    private Integer carNo;
    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}
