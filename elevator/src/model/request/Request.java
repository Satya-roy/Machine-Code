package model.request;

public class Request {
    RequestType type;
    int floor;

    public Request(int floor, RequestType type) {
        this.floor = floor;
        this.type = type;
    }
}
