package com.example.designpattern.behavioral.mediator;

public class FrontDesk {

    // 중재자 역할
    // 의존성이 몰리게 되는 단점이 존재함
    private CleaningService cleaningService = new CleaningService();

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "0";
    }

}
