package model.repository;

import model.Direction;
import model.ElevatorCar;
import model.Floor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElevatorSystemRepository {
    // Store Elevator and their number
    Map<Integer, ElevatorCar> elevatorCarMap = new HashMap<>();
    Map<Integer, Floor> elevatorFloorMap = new HashMap<>();

    public ElevatorCar addElevator(ElevatorCar elevatorCar) throws Exception {
        if(!elevatorCarMap.containsKey(elevatorCar.getElevatorId())) {
            elevatorCarMap.put(elevatorCar.getElevatorId(), elevatorCar);
        } else {
            throw new Exception("Elevator car with same Id already present");
        }
        return elevatorCar;
    }

    public List<ElevatorCar> getAllIdleElevatorsAtFloor(int floorId) {
        return elevatorCarMap.values().stream().filter(
                elevatorCar -> elevatorCar.getFloor().getFloorId()==floorId && elevatorCar.getDirection() == Direction.IDLE
        ).collect(Collectors.toList());
    }

    //TODO: similarly define the required function 

}
