package model;

public class Ladder {
    private final int ladderNumber;
    private final int start;
    private final int end;
    private final String color;

    public Ladder(int ladderNumber, int start, int end, String color) {
        this.ladderNumber = ladderNumber;
        this.start = start;
        this.end = end;
        this.color = color;
    }


    public int getLadderNumber() {
        return ladderNumber;
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
