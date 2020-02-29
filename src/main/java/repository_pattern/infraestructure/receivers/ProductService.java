package repository_pattern.infraestructure.receivers;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import repository_pattern.domain.usecase.ProductUseCase;
import repository_pattern.domain.model.product.Product;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductService {

    private final ProductUseCase productUseCase;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Product> getProductById(@PathVariable String id) {
        return productUseCase.getProductById(id);
    }

//    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/create")
    public Mono<String> createProduct(@RequestBody ProductDTO productDTO) {
        return productUseCase.createProduct(Product.builder()
                .id(productDTO.id)
                .name(productDTO.name)
                .price(productDTO.price)
                .build())
                .map(product -> "OK");
    }

    @GetMapping("/hola")
    public Mono<String> hola() {
        return Mono.just("hola");
    }

    @NoArgsConstructor
    private static class ProductDTO {

        private String id;
        private String name;
        private Double price;
    }
}
