package repository_pattern.domain.model.supplier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Supplier {

    private String id;
    private String name;
    private String email;

}
