package repository_pattern.infrastructure.adapters.supplier;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.supplier.Supplier;
import repository_pattern.domain.model.supplier.SupplierRepository;

@Repository
public class SupplierMongoAdapter implements SupplierRepository {

    @Override
    public Mono<Supplier> getSupplierById() {
        return null;
    }
}
