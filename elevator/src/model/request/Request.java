package model.request;

public class Request implements Comparable<Request>{
    RequestType type;
    int floor;

    public Request(int floor, RequestType type) {
        this.floor = floor;
        this.type = type;
    }

    @Override
    public int compareTo(Request o) {
        return this.floor - o.floor;
    }

    public int getFloor() {
        return floor;
    }

    public RequestType getType() {
        return type;
    }
}
