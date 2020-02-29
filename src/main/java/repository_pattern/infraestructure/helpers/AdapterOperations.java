package repository_pattern.infraestructure.helpers;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public abstract class AdapterOperations<D, I, R extends ReactiveCrudRepository<D, I>> {

    protected R repository;

    public AdapterOperations(R repository) {
        this.repository = repository;
    }
}
