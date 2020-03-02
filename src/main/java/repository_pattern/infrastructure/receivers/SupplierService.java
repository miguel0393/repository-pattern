package repository_pattern.infrastructure.receivers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import repository_pattern.domain.model.supplier.Supplier;
import repository_pattern.domain.usecase.SupplierUseCase;

@RestController
@RequiredArgsConstructor
@RequestMapping("/supplier")
public class SupplierService {

    private final SupplierUseCase supplierUseCase;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Supplier> getProductById(@PathVariable String id) {
        return supplierUseCase.getSupplierById(id);
    }

}
