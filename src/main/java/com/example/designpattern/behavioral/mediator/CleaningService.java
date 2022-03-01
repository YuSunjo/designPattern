package com.example.designpattern.behavioral.mediator;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumberFor = this.frontDesk.getRoomNumberFor(guestId);
    }

}
