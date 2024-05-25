package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.entity.OrderTable;

import java.util.List;
import java.util.Map;

public interface OrderRepo extends JpaRepository<OrderTable,Long> {
    @Query(value = "select * from getMaxQuantity()",nativeQuery = true)
    List<Map<String,Object>> getMaxQuantity();
    @Query(value = "select * from getMaxPrice()",nativeQuery = true)
    List<Map<String,Object>> getMaxPrice();
    @Query(value = "select * from greaterThanPrice()",nativeQuery = true)
    List<Map<String,Object>> greaterThanPrice();
}
