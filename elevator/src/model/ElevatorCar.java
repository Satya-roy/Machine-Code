package model;

import model.buttonPanel.ButtonPanel;
import model.request.Request;

public class ElevatorCar {
    private final int elevatorId;
    Floor floor;
    Door door;
    Direction direction;
    ButtonPanel buttonPanel;

    public ElevatorCar(int elevatorId, Floor floor, Door door, Direction direction, ButtonPanel buttonPanel) {
        this.elevatorId = elevatorId;
        this.floor = floor;
        this.door = door;
        this.direction = direction;
        this.buttonPanel = buttonPanel;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public Floor getFloor() {
        return floor;
    }

    public Door getDoor() {
        return door;
    }

    public Direction getDirection() {
        return direction;
    }

    public void call(Request request) {
        if(request.getFloor() == floor.getFloorId()) {
            door.open();
        } else {
            //TODO: move to the floor
        }
    }
}
