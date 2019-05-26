package com.company.pdr.domain;


import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answer_id")
    private Integer answerId;
    @Column(name = "answer_name")
    private String answerName;
    @Column(name = "ans")
    private boolean ans;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable=false)
    private Task task;

    public Answer() {

    }

    public Answer(String answerName, boolean ans, Task task) {
        this.answerName = answerName;
        this.ans = ans;
        this.task = task;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public boolean isAns() {
        return ans;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
