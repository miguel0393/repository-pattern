package repository_pattern.infrastructure.adapters.product;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import repository_pattern.domain.model.product.Product;

public interface ProductDataRepository extends ReactiveCrudRepository<Product, String> {

    Flux<Product> findAllByName(String name);

}
