package repository_pattern.infrastructure.adapters.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.product.Product;
import repository_pattern.domain.model.product.ProductRepository;

@Repository
public class ProductMongoAdapter implements ProductRepository {

    private final ProductDataRepository repository;

    @Autowired
    public ProductMongoAdapter(ProductDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Product> getProductById(String id) {
        return repository.findById(id);
    }

    @Override
    public Flux<Product> getProductByName(String name) {
        return repository.findAllByName(name);
    }

    @Override
    public Mono<Product> createProduct(Product product) {
        return repository.save(product);
    }
}
