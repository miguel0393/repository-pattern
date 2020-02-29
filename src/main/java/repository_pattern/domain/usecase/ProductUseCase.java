package repository_pattern.domain.usecase;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.product.Product;
import repository_pattern.domain.model.product.ProductRepository;

@RequiredArgsConstructor
public class ProductUseCase {

    private final ProductRepository productRepository;

    public Mono<Product> createProduct(Product product) {
        return productRepository.createProduct(product);
    }

    public Mono<Product> getProductById(String id) {
        return productRepository.getProductById(id);
    }

    public Flux<Product> getProductByName(String name) {
        return productRepository.getProductByName(name);
    }
}
