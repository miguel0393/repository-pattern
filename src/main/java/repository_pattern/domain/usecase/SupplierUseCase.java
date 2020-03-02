package repository_pattern.domain.usecase;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.supplier.Supplier;
import repository_pattern.domain.model.supplier.SupplierRepository;

@RequiredArgsConstructor
public class SupplierUseCase {

    private final SupplierRepository supplierRepository;

    public Mono<Supplier> getSupplierById(String id) {
        return supplierRepository.getSupplierById(id);
    }
}
