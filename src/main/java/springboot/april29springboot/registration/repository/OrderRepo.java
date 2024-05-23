package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import springboot.april29springboot.registration.entity.OrderTable;

public interface OrderRepo extends JpaRepository<OrderTable,Long> {
    @Query(value = "select * from getMaxQty()",nativeQuery = true)
    ResponseEntity<?> getMaxQty();
}
