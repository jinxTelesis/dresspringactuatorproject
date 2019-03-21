package drejinx.springframework.demo.services.jms;

import drejinx.springframework.demo.domain.Product;
import drejinx.springframework.demo.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository ProductRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.ProductRepository = productRepository;
    }


    @Override
    public Product getProduct(Integer id) {
        // has to wait

        return null;
    }

    @Override
    public List<Product> listProducts() {
        // has to wait
        return null;
    }
}
