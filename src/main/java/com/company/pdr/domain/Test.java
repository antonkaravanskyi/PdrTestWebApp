package com.company.pdr.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_id")
    private Integer testId;
    @Column(name = "test_name")
    private String testName;

    @OneToMany(mappedBy="test")
    private Set<Task> tasks;

    public Test() {

    }

    public Test(String testName, Set<Task> tasks) {
        this.testName = testName;
        this.tasks = tasks;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
