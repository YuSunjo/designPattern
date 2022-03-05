package com.example.designpattern.behavioral.state;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student hello = new Student("hello");

        onlineCourse.addStudents(hello);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", hello);

    }

}
