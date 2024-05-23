package springboot.april29springboot.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.april29springboot.registration.entity.Product;
import springboot.april29springboot.registration.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("saveProduct")
    public String saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "product saved";
    }
}
