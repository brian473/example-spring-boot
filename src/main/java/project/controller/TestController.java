package project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.entity.TestEntity;
import project.service.TestService;
import project.service.TestServiceImpl;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestServiceImpl testService) {
        this.testService = testService;
    }

    @GetMapping("/api/test")
    public ResponseEntity<Iterable<TestEntity>> getTests() {
        return ResponseEntity.ok(testService.getTests());
    }

    @GetMapping("/api/makeTest")
    public ResponseEntity<?> makeTest(String content) {
        testService.makeTest(content);
        return ResponseEntity.ok("Done!!");
    }

}
