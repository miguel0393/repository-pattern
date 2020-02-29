package repository_pattern.domain.model.product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {

    Mono<Product> getProductById(String id);

    Flux<Product> getProductByName(String name);

    Mono<Product> createProduct(Product product);
}
