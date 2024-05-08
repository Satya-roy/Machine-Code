package model;

import java.util.Map;

public class Board {
    private final int numberBlocks;
    private final Map<Integer, Ladder> laddersMap;
    private final Map<Integer, Snake> snakesMap;

    public Board(int numberBlocks, Map<Integer, Ladder> laddersMap,  Map<Integer, Snake> snakesMap) {
        this.numberBlocks = numberBlocks;
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
