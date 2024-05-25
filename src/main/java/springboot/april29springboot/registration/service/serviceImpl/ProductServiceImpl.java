package springboot.april29springboot.registration.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.april29springboot.registration.entity.Product;
import springboot.april29springboot.registration.repository.ProductRepo;
import springboot.april29springboot.registration.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
    public Product saveProduct(Product product) {
        Product pd=new Product();
        pd.setProductName(product.getProductName());
        pd.setPrice(product.getPrice());
        return productRepo.save(pd);
    }
}
