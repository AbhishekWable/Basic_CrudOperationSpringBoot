package springboot.april29springboot.registration.service.serviceImpl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.dto.OrderDto;
import springboot.april29springboot.registration.entity.Customer;
import springboot.april29springboot.registration.entity.OrderTable;
import springboot.april29springboot.registration.entity.Product;
import springboot.april29springboot.registration.repository.CustomerRepo;
import springboot.april29springboot.registration.repository.OrderRepo;
import springboot.april29springboot.registration.repository.ProductRepo;
import springboot.april29springboot.registration.service.OrderService;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CustomerRepo customerRepo;


    @Transactional
    @Override
    public OrderTable saveOrder(OrderDto orderDto) {

        Customer cm=new Customer();
        cm.setCustomerName(orderDto.getCustomerName());
        cm.setAddress(orderDto.getAddress());
        Customer saveCustomer = customerRepo.save(cm);

        Product pr=new Product();
        pr.setProductName(orderDto.getProductName());
        pr.setPrice(orderDto.getPrice());
        Product saveProduct =  productRepo.save(pr);

        OrderTable or=new OrderTable();
        or.setQuantity(orderDto.getQuantity());
        or.setTotal(orderDto.getPrice() * orderDto.getQuantity());
        or.setDateOfOrder(orderDto.getDateOfOrder());

        or.setProduct(saveProduct);
        or.setCustomer(saveCustomer);
        OrderTable saveOrder = orderRepo.save(or);

        return saveOrder;
    }

    @Override
    public ResponseEntity<?> getMaxQuantity() {
        List<Map<String,Object>> getData=orderRepo.getMaxQuantity();
        return ResponseEntity.ok(getData);
    }

    @Override
    public ResponseEntity<?> getMaxPrice() {
        List<Map<String,Object>> getData=orderRepo.getMaxPrice();
        return ResponseEntity.ok(getData);
    }

    @Override
    public ResponseEntity<?> greaterThanPrice() {
        List<Map<String,Object>> getData=orderRepo.greaterThanPrice();
        return ResponseEntity.ok(getData);
    }
}
