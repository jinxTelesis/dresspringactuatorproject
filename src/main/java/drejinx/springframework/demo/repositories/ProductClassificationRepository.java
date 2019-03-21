package drejinx.springframework.demo.repositories;

import drejinx.springframework.demo.domain.ProductClassification;
import org.springframework.data.repository.CrudRepository;

public interface ProductClassificationRepository extends CrudRepository<ProductClassification,Long> {

}
