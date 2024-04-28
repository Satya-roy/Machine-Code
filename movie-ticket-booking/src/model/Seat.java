package model;

public class Seat {
    private final String id;
    private final int rowNumber;
    private final int seatNumber;

    public Seat(final String id, final int rowNumber, final int seatNumber) {
        this.id = id;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
    }

    public String getId() {
        return id;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
