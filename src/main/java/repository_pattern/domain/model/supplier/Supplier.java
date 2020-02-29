package repository_pattern.domain.model.supplier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Supplier {

    private final String id;
    private final String name;

}
