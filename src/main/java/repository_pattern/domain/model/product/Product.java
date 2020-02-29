package repository_pattern.domain.model.product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Product {

    private final String id;
    private final String name;
    private final Double price;
}
