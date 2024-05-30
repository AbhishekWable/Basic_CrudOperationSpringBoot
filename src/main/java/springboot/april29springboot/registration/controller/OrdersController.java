package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.april29springboot.registration.dto.OrdersRequestDto;
import springboot.april29springboot.registration.entity.Orders;
import springboot.april29springboot.registration.service.OrdersService;

import java.time.LocalDate;

@RestController
@CrossOrigin("*")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @PostMapping("saveOrders")
    public Orders saveOrders(@RequestBody OrdersRequestDto ordersRequestDto){
        return ordersService.saveOrder(ordersRequestDto);
    }
    @GetMapping("fnGetOrder/{id_}/{fromDate}/{toDate}")
    ResponseEntity<?> fnGetOrder(@PathVariable("id_") Long id_, @PathVariable LocalDate fromDate,@PathVariable LocalDate toDate){
        return ordersService.fnGetOrder(id_,fromDate,toDate);
    }
}
