package com.example.designpattern.structure.decorator.after;

public class DefaultCommentServiceImpl implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println("comment = " + comment);
    }

}
