package repository_pattern.applications;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository_pattern.domain.model.product.ProductRepository;
import repository_pattern.domain.usecase.ProductUseCase;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository) {
        return new ProductUseCase(productRepository);
    }
}
