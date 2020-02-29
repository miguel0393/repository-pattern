package repository_pattern.infraestructure.adapters.product;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import repository_pattern.domain.model.product.Product;

public interface ProductDataRepository extends ReactiveCrudRepository<Product, String> {

//    Flux<Product> findByName(String name);

}
