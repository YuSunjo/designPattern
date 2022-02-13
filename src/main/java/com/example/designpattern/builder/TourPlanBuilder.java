package com.example.designpattern.builder;

import java.time.LocalDateTime;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDateTime startDate);

    TourPlanBuilder endDate(LocalDateTime endDate);

    TourPlanBuilder days(int days);

    TourPlanBuilder abcde(String a, String b, String c, String d, String e);

    TourPlan getPlan();

}
