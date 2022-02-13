package com.example.designpattern.builder;

import java.time.LocalDateTime;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan trip() {
        return tourPlanBuilder.title("여행가자")
                .startDate(LocalDateTime.of(2022, 1, 10, 10, 10))
                .endDate(LocalDateTime.of(2022, 1, 10, 10, 10))
                .days(1)
                .abcde("a", "b", "c", "d", "e")
                .getPlan();
    }

}
