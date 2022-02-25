package com.example.designpattern.behavioral.interpreter.after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));

    }

}
