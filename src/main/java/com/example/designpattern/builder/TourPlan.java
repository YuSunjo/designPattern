package com.example.designpattern.builder;

import java.time.LocalDateTime;

public class TourPlan {

    private String title;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int days;

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public TourPlan(String title, LocalDateTime startDate, LocalDateTime endDate, int days, String a, String b, String c, String d, String e) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.days = days;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

}
