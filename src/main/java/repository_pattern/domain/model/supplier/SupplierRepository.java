package repository_pattern.domain.model.supplier;

import reactor.core.publisher.Mono;

public interface SupplierRepository {

    Mono<Supplier> getSupplierById();
}
