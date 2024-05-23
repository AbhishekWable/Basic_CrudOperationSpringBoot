package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.entity.OrderTable;
import springboot.april29springboot.registration.repository.OrderRepo;
import springboot.april29springboot.registration.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Override
    public OrderTable saveOrder(OrderTable orderTable) {

        OrderTable or=new OrderTable();
        or.setQuantity(orderTable.getQuantity());
        or.setTotal(orderTable.getTotal());
        or.setProduct(orderTable.getProduct());
        or.setCustomer(orderTable.getCustomer());
        return orderRepo.save(or);
    }

    @Override
    public ResponseEntity<?> getMaxQty() {
        return orderRepo.getMaxQty();


    }
}
