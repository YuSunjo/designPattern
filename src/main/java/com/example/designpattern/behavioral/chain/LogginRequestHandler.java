package com.example.designpattern.behavioral.chain;

public class LogginRequestHandler extends RequestHandler{

    public LogginRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        super.handle(request);
    }

}
