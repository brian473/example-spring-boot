package project.service;

import org.springframework.stereotype.Service;
import project.entity.TestEntity;
import project.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void makeTest(String content) {
        testRepository.save(new TestEntity(content));
    }

    public Iterable<TestEntity> getTests() {
        return testRepository.findAll();
    }
}
