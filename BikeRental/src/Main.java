import reservation.Reservation;
import reservation.ReservationImpl;
import vehicle.bike.*;
import vehicle.user.User;
import vehicleRentalSystem.VehicleRentalSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bike b1 = new SmallBike(1, 123, true, false);
        Bike b2 = new MediumBike(2, 234, true, false);
        Bike b3 = new LargeBike(3, 345, false, false);
        Bike b4 = new SmallBike(4, 456, true, false);

        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(b1);
        bikeList.add(b2);
        bikeList.add(b3);
        bikeList.add(b4);

        BikeManager bikeManager = new BikeManagerImpl(bikeList);

//        int totalcount = bikeManager.getBikeCount();
//        System.out.println(totalcount);

        int availableBike = bikeManager.getCountForAvailableBike();
        System.out.println(availableBike);

        bikeManager.removeBike(b2);
        int totalcount = bikeManager.getBikeCount();
        System.out.println(totalcount);

        User u1 = new User(1, 1234);
        User u2 = new User(2, 2345);
        User u3 = new User(3, 3456);
        User u4 = new User(4, 4567);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(new ArrayList<>());

        vehicleRentalSystem.addUser(u1);
        vehicleRentalSystem.addUser(u2);
        vehicleRentalSystem.addUser(u3);
        vehicleRentalSystem.addUser(u4);

        Reservation r1 = new Reservation(1, LocalDateTime.now().minusDays(5), LocalDateTime.now().minusDays(1), b1, u1, 2000, 5000);
        Reservation r2 = new Reservation(2, LocalDateTime.now().minusDays(5), LocalDateTime.now().minusDays(2), b2, u2, 2000, 4000);
        Reservation r3 = new Reservation(3, LocalDateTime.now().minusDays(5), LocalDateTime.now().plusDays(3), b3, u3, 2000, 2500);
        Reservation r4 = new Reservation(4, LocalDateTime.now().minusDays(5), LocalDateTime.now().plusDays(4), b4, u4, 1500, 5000);

        ReservationImpl reservationImpl = new ReservationImpl(new ArrayList<>());
        reservationImpl.addReservation(r1);
        reservationImpl.addReservation(r2);
        reservationImpl.addReservation(r3);
        reservationImpl.addReservation(r4);

        System.out.println(reservationImpl.dueReservations());
    }
}