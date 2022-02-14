package com.example.designpattern.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("sdf");
        repository.setName("sdf");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1L);
        githubIssue.setTitle("title");

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        // clone 은 기본적으로 얉은 복사 - repository에서 이름을 변경해버리면 영향이 간다.
        // 그래서 clone 메서드에서 깊은 복사를 해준다.
        repository.setName("dsfsf");

    }
}
