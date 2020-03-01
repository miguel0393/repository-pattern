package repository_pattern.infrastructure.helpers.jpa;

import org.springframework.data.repository.CrudRepository;

public abstract class AdapterOperations<D, I, R extends CrudRepository<D, I>> {

    protected R repository;

    public AdapterOperations(R repository) {
        this.repository = repository;
    }
}
