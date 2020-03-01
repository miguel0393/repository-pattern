package repository_pattern.infrastructure.helpers;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public abstract class AdapterOperations<D, I, R extends ReactiveCrudRepository<D, I> & ReactiveQueryByExampleExecutor<D>> {

    protected R repository;

    public AdapterOperations(R repository) {
        this.repository = repository;
    }
}
