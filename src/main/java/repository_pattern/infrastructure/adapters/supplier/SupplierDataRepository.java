package repository_pattern.infrastructure.adapters.supplier;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import repository_pattern.domain.model.supplier.Supplier;

public interface SupplierDataRepository extends ReactiveCrudRepository<Supplier, String> {


}
