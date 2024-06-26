package springboot.april29springboot.registration.dto;

import lombok.Getter;
import lombok.Setter;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.entity.Product;

import java.time.LocalDate;

@Getter
@Setter
public class OrderDto {

    private String CustomerName;
    private String address;

    private String productName;
    private Long price;

    private Long quantity;
    private Long total;
    private LocalDate dateOfOrder;


}
