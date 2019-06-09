package com.company.pdr.repos;

import com.company.pdr.domain.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TestRepo extends CrudRepository <Test, Long>{

    Optional<Test> findByTestName(String testName);
}