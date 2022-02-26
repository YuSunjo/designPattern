package com.example.designpattern.behavioral.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

//        List<Post> posts = board.getPosts();
//        for (int i = 0 ; i < posts.size() ; i++) {
//            Post post = posts.get(i);
//            System.out.println(post.getTitle());
//        }
//
//        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
//        for (int i = 0 ; i < posts.size() ; i++) {
//            Post post = posts.get(i);
//            System.out.println(post.getTitle());
//        }

        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // Post의 안에 있는 것들을 상관하지 않아도 된다.
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

}
