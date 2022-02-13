package com.example.designpattern.builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        TourPlanBuilder builder = new DefaultTourBuilder();
        builder.title("여행가자")
                .startDate(LocalDateTime.of(2022, 1, 10, 10, 10))
                .endDate(LocalDateTime.of(2022, 1, 10, 10, 10))
                .days(1)
                .abcde("a", "b", "c", "d", "e")
                .getPlan();

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan trip = tourDirector.trip();
    }
}
