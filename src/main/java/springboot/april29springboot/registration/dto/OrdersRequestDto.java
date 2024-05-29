package springboot.april29springboot.registration.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.entity.Product;

import java.time.LocalDate;
@Getter
@Setter

public class OrdersRequestDto {
    private Long quantity;
    private Long total;
    private LocalDate dateOfOrder;

    private Product product;


    private Customer customer;
}
