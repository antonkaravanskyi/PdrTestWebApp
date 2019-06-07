package com.company.pdr.repos;

import com.company.pdr.domain.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepo extends CrudRepository <Test, Long>{

    List<Test> findByTestName(String testName);
}