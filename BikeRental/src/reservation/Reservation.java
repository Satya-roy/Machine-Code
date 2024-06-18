package reservation;

import vehicle.bike.Bike;
import vehicle.user.User;

import java.time.LocalDateTime;

public class Reservation {
    private int id;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Bike bike;
    private User user;
    private int currBalance;
    private int totalCost;

    public Reservation(int id, LocalDateTime fromDate, LocalDateTime toDate, Bike bike, User user, int currBalance, int totalCost) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.bike = bike;
        this.user = user;
        this.currBalance = currBalance;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCurrBalance() {
        return currBalance;
    }

    public void setCurrBalance(int currBalance) {
        this.currBalance = currBalance;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
