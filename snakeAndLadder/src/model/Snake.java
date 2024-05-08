package model;

public class Snake {
    private final int snakeNumber;
    private final int start;
    private final int end;
    private final String color;

    public Snake(int snakeNumber, int start, int end, String color) {
        this.snakeNumber = snakeNumber;
        this.start = start;
        this.end = end;
        this.color = color;
    }


    public int getSnakeNumber() {
        return snakeNumber;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getColor() {
        return color;
    }
}
