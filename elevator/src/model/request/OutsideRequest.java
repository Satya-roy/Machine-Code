package model.request;

import model.Direction;

public class OutsideRequest extends Request {
    Direction direction;

    public OutsideRequest(int floorId, Direction direction) {
        super(floorId, RequestType.OUTSIDE);
        this.direction = direction;
    }
}
