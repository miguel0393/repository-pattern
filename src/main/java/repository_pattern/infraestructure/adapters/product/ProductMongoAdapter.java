package repository_pattern.infraestructure.adapters.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.product.Product;
import repository_pattern.domain.model.product.ProductRepository;
import repository_pattern.infraestructure.helpers.AdapterOperations;

@Repository
public class ProductMongoAdapter extends AdapterOperations<Product, String, ProductDataRepository>
        implements ProductRepository {

    @Autowired
    public ProductMongoAdapter(ProductDataRepository repository) {
        super(repository);
    }

    @Override
    public Mono<Product> getProductById(String id) {
        return repository.findById(id);
    }

    @Override
    public Flux<Product> getProductByName(String name) {
        return Flux.empty();
    }

    @Override
    public Mono<Product> createProduct(Product product) {
        return repository.save(product);
    }
}
