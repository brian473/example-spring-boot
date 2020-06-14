package project.service;

import project.entity.TestEntity;

public interface TestService {
    void makeTest(String content);
    Iterable<TestEntity> getTests();
}
