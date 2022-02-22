package com.example.designpattern.behavioral;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request();
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LogginRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);
        client.doWork();
    }

    // 대표적인 예제가 filter

}
