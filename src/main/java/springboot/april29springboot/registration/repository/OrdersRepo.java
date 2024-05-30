package springboot.april29springboot.registration.repository;

import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.april29springboot.registration.entity.Orders;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface OrdersRepo extends JpaRepository<Orders,Long> {
    @Query(value = "select * from fnGetOrder(:id_,:fromDate,:toDate)",nativeQuery = true)
    public List<Map<String,Object>> fnGetOrder(Long id_, LocalDate fromDate,LocalDate toDate);
}
