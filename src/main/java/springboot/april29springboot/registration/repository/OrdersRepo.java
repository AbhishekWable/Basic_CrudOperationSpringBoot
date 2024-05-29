package springboot.april29springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersRepo extends JpaRepository<Orders,Long> {
    @Query(value = "select * from fnGetOrder(:id_)",nativeQuery = true)
    public List<Map<String,Object>> fnGetOrder(Long id_);
}
