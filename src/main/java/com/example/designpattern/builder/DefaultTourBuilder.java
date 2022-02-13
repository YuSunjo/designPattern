package com.example.designpattern.builder;

import java.time.LocalDateTime;

public class DefaultTourBuilder implements TourPlanBuilder{

    private String title;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int days;

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDateTime startDate) {
        return null;
    }

    @Override
    public TourPlanBuilder endDate(LocalDateTime endDate) {
        return null;
    }

    @Override
    public TourPlanBuilder days(int days) {
        return null;
    }

    @Override
    public TourPlanBuilder abcde(String a, String b, String c, String d, String e) {
        return null;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, startDate, endDate, days, a, b, c, d, e);
    }
}
