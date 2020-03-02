package repository_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repository_pattern.domain.model.product.ProductRepository;
import repository_pattern.domain.model.supplier.SupplierRepository;
import repository_pattern.domain.usecase.ProductUseCase;
import repository_pattern.domain.usecase.SupplierUseCase;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository) {
        return new ProductUseCase(productRepository);
    }

    @Bean
    public SupplierUseCase supplierUseCase(SupplierRepository supplierRepository) {
        return new SupplierUseCase(supplierRepository);
    }
}
