package drejinx.springframework.demo.bootstrap;

import drejinx.springframework.demo.domain.Product;
import drejinx.springframework.demo.repositories.DesignerRepository;
import drejinx.springframework.demo.repositories.ProductClassificationRepository;
import drejinx.springframework.demo.repositories.ProductRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.math.BigDecimal;

public class AcuatorBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private DesignerRepository designerRepository;
    private ProductClassificationRepository productClassificationRepository;
    private ProductRepository productRepository;

    @Autowired
    public void setAuthorRepository(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }

    @Autowired
    public void setProductCategoryRepository(ProductClassificationRepository productClassificationRepository) {
        this.productClassificationRepository = productClassificationRepository;
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        if(IteratorUtils.toList(designerRepository.findAll().iterator()).size() == 0) {


        }
    }
}
