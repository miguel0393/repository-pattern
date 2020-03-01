package repository_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repository_pattern.domain.model.product.ProductRepository;
import repository_pattern.domain.usecase.ProductUseCase;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository) {
        return new ProductUseCase(productRepository);
    }
}
