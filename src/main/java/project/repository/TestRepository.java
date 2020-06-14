package project.repository;

import org.springframework.data.repository.CrudRepository;
import project.entity.TestEntity;

public interface TestRepository extends CrudRepository<TestEntity, Long> {
}
