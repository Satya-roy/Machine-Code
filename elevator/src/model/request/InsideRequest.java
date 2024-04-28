package model.request;

import model.Direction;

public class InsideRequest extends Request {
    Direction direction;
    //TODO : service layer handle the logic for finding direction
    public InsideRequest(int floorId, Direction direction) {
        super(floorId, RequestType.INSIDE);
        this.direction = direction;
    }
}
