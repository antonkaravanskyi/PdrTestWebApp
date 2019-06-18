package com.company.pdr.repos;

import com.company.pdr.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Integer> {
}
