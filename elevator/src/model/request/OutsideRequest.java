package model.request;

import model.Direction;

public class OutsideRequest extends Request {
    //floor in outside request -> floor the person wants to enter the lift
    //                         -> hence open the lift so that the person get in the lift
    Direction direction;

    public OutsideRequest(int floorId, Direction direction) {
        super(floorId, RequestType.OUTSIDE);
        this.direction = direction;
    }
}
