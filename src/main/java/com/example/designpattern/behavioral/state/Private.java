package com.example.designpattern.behavioral.state;

public class Private implements State{

    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("프라이빗코스를 수강하는 사람만 리뷰 가능");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.addStudents(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강 할 수 없음");
        }
    }
}
