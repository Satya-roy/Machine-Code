package model;

import model.buttonPanel.ButtonPanel;

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
}
