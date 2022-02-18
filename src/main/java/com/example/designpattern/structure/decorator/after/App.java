package com.example.designpattern.structure.decorator.after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentServiceImpl();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        // 단순 상속만을 사용하게 되면 두가지를 조합을 할 수가 없음
        //  단일책임 원칙을 따름 -> 어떤 데코레이터는 하나의 기능만 수행을 한다.
        Client client = new Client(commentService);
        client.writeComment("오징어게임...");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
