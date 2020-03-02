package repository_pattern.infrastructure.adapters.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.supplier.Supplier;
import repository_pattern.domain.model.supplier.SupplierRepository;

@Repository
public class SupplierMongoAdapter implements SupplierRepository {

    private final SupplierDataRepository repository;

    @Autowired
    public SupplierMongoAdapter(SupplierDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Supplier> getSupplierById(String id) {
        return repository.findById(id);
    }
}
