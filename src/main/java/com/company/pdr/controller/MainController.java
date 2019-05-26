package com.company.pdr.controller;

import com.company.pdr.domain.Test;
import com.company.pdr.repos.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private TestRepo testRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Test> tests = testRepo.findAll();

        model.put("tests", tests);

        return "main";
    }

    @PostMapping("filter")
    public String add(@RequestParam Integer testId, @RequestParam String testName, Map<String, Object> model) {
        Test test = new Test(testId, testName);

        testRepo.save(test);

        Iterable<Test> tests = testRepo.findAll();

        model.put("tests", tests);

        return "main";
    }
}