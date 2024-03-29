package com.example.designpattern.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state = new Draft(this);

    private final List<Student> students = new ArrayList<>();

    private final List<String> reviews = new ArrayList<>();

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void changeState(State state) {
        this.state = state;
    }

}
