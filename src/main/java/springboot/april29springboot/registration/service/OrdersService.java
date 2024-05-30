package springboot.april29springboot.registration.service;

import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.dto.OrdersRequestDto;
import springboot.april29springboot.registration.entity.Orders;

import java.time.LocalDate;

public interface OrdersService {
    Orders saveOrder(OrdersRequestDto ordersRequestDto);
    ResponseEntity<?> fnGetOrder(Long id_, LocalDate fromDate,LocalDate toDate);
}
