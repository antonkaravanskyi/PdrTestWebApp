package com.company.pdr.controller;

import com.company.pdr.domain.Test;
import com.company.pdr.repos.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private TestRepo testRepo;
   
    @PostMapping("/tests")
    public String greeting(Map<String, Object> model) {
        return "main";
    }

    @GetMapping("/tests")
    public String main(Map<String, Object> model) {
        Iterable<Test> tests = testRepo.findAll();

        model.put("tests", tests);

        return "main";
    }
}