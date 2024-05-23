package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.entity.OrderTable;
import springboot.april29springboot.registration.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("saveOrder")
    public String saveOrder(@RequestBody OrderTable orderTable){
        orderService.saveOrder(orderTable);
        return "Order Saved";
    }
    @GetMapping("getMaxQty")
    public ResponseEntity<?> getMaxQty(){
        return orderService.getMaxQty();
    }
}
