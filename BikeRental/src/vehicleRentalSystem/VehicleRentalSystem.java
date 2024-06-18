package vehicleRentalSystem;

import vehicle.user.User;

import java.util.List;

public class VehicleRentalSystem {
    List<User> userList;
    //CRUD operation on the users
    public VehicleRentalSystem(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
