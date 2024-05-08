package model;

import java.util.Map;

public class Board {
    //TODO : make the board class singleton using double locking
    private final int numberBlocks;
    private final Map<Integer, Ladder> laddersMap;
    private final Map<Integer, Snake> snakesMap;

    public Board(Map<Integer, Ladder> laddersMap,  Map<Integer, Snake> snakesMap) {
        this.numberBlocks = 100;
        this.laddersMap = laddersMap;
        this.snakesMap = snakesMap;
    }

    public int getNumberBlocks() {
        return numberBlocks;
    }

    public Map<Integer, Ladder> getLaddersMap() {
        return laddersMap;
    }

    public Map<Integer, Snake> getSnakesMap() {
        return snakesMap;
    }
}
