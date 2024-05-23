package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.entity.OrderTable;
import springboot.april29springboot.registration.entity.Product;

public interface OrderService {

    OrderTable saveOrder(OrderTable orderTable);
    ResponseEntity<?> getMaxQty();
}
