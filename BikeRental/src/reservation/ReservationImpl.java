package reservation;

import vehicle.bike.Bike;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationImpl {
    List<Reservation> reservationList;

    public ReservationImpl(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }
    //is Due
    public int dueReservations() {
        int count=0;
        int n = reservationList.size();
        for(int i=0; i<n; i++) {
            Reservation reservation = reservationList.get(i);
            if(reservation.getToDate().isBefore(LocalDateTime.now())) {
                count++;
            }
        }
        return count;
    }

    //is balance due
}
