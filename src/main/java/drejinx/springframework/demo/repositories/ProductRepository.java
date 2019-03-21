package drejinx.springframework.demo.repositories;

import drejinx.springframework.demo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
