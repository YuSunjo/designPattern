package com.example.designpattern.behavioral.templateMethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process((sum, number) -> sum += number);
        System.out.println(result);
    }
    // 추상클래스로 구현할 부분만 만듦
}
