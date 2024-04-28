package model;

import java.util.List;

public class Screen {
    private final String id;
    private final Theater theater;
    private final List<Seat> seats;

    public Screen(final String id, final Theater theater, final List<Seat> seats) {
        this.id = id;
        this.theater = theater;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public Theater getTheater() {
        return theater;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
