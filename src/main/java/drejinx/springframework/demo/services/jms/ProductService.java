package drejinx.springframework.demo.services.jms;

import drejinx.springframework.demo.domain.Product;

import java.util.List;

public interface ProductService {

    // no access modifier on an interface you dummmy

    Product getProduct(Integer id);

    List<Product> listProducts();
}
