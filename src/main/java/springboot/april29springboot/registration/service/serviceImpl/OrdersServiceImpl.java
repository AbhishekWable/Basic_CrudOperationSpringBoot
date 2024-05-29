package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.OrdersRequestDto;
import springboot.april29springboot.registration.entity.Orders;
import springboot.april29springboot.registration.entity.Product;
import springboot.april29springboot.registration.repository.OrdersRepo;
import springboot.april29springboot.registration.repository.ProductRepo;
import springboot.april29springboot.registration.service.OrdersService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepo ordersRepo;

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Orders saveOrder(OrdersRequestDto ordersRequestDto) {
        Orders or=new Orders();
        or.setQuantity(ordersRequestDto.getQuantity());
        Optional<Product> getData = productRepo.findById(ordersRequestDto.getProduct().getId());
        if(getData.isPresent())
            or.setTotal(getData.get().getPrice() * ordersRequestDto.getQuantity());
        or.setDateOfOrder(ordersRequestDto.getDateOfOrder());
        or.setCustomer(ordersRequestDto.getCustomer());
        or.setProduct(ordersRequestDto.getProduct());
        return ordersRepo.save(or);
    }

    @Override
    public ResponseEntity<?> fnGetOrder(Long id_) {
       List<Map<String,Object>> getData= ordersRepo.fnGetOrder(id_);
        return ResponseEntity.ok(getData);
    }
}
