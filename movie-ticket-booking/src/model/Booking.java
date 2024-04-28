package model;

import java.util.List;

public class Booking {
    private final String id;
    private final Show show;
    private final List<Seat> seats;
    private final String user;
    private BookingStatus bookingStatus;

    public Booking(final String id, final Show show, final List<Seat> seatsBooked, final String user) {
        this.id = id;
        this.show = show;
        this.seats = seatsBooked;
        this.user = user;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public String getId() {
        return id;
    }

    public Show getShow() {
        return show;
    }

    public String getUser() {
        return user;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
