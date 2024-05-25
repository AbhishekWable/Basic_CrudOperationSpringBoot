package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.dto.OrderDto;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.entity.OrderTable;
import springboot.april29springboot.registration.entity.Product;
import springboot.april29springboot.registration.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("saveOrder")
    public String saveOrder(@RequestBody OrderDto orderDto){
       orderService.saveOrder(orderDto);
        return "Order Saved";
    }
    @GetMapping("getMaxQty")
    public ResponseEntity<?> getMaxQuantity(){
        return orderService.getMaxQuantity();
    }
    @GetMapping("getMaxPrice")
    public ResponseEntity<?> getMaxPrice(){
        return orderService.getMaxPrice();
    }
    @GetMapping("greaterThanPrice")
    public ResponseEntity<?> greaterThanPrice(){
        return orderService.greaterThanPrice();
    }
}
