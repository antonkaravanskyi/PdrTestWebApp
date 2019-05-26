package com.company.pdr.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private Integer taskId;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "question")
    private String question;

    @ManyToOne
    @JoinColumn(name="test_id", nullable=false)
    private Test test;

    @OneToMany(mappedBy="task")
    private Set<Answer> answers;

    public Task() {

    }

    public Task(String taskName, String question, Test test, Set<Answer> answers) {
        this.taskName = taskName;
        this.question = question;
        this.test = test;
        this.answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}