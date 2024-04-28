package model.request;

import model.Direction;

public class InsideRequest extends Request {
    //floor in inside Request -> which floor to person want to exit
    //                        -> open the door at the floor
    Direction direction;
    //TODO : service layer handle the logic for finding direction
    public InsideRequest(int floorId, Direction direction) {
        super(floorId, RequestType.INSIDE);
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
