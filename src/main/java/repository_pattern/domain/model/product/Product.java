package repository_pattern.domain.model.product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Product {

    private String id;
    private String name;
    private Double price;
}
