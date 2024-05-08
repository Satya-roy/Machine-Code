package Service;

import model.Board;
import model.Ladder;
import model.Player;
import model.Snake;
import model.dice.Dice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaySnakeAndLadder {
    private Board board;
    private Dice dice;
    private List<Player> playerList;
    private Map<Integer, Integer> playerLastPosition;
    public PlaySnakeAndLadder(Board board, List<Player> playerList) {
        this.board = board;
        this.dice = new Dice();
        this.playerList = playerList;
        this.playerLastPosition = new HashMap<>();
    }

    public void playGame() {
        int i = -1;
        initializePlayerStartValue();
        do {
            i++; //ith player
            if(i>=playerList.size()) {
                i=0;
            }
            StringBuilder sb = new StringBuilder();
            Player player = playerList.get(i);
            int playerId = player.getId();
            String playerName = player.getName();
            sb.append(playerName);

            int diceNumber = dice.roll();
            int endPosition = playerLastPosition.get(playerId) + diceNumber;

            Map<Integer, Snake> snakeMap = board.getSnakesMap();
            Map<Integer, Ladder> ladderMap = board.getLaddersMap();

            String sl = "";
            if(!checkIfEndPositionIsGreaterThan100(endPosition)) {
                //snake
                sb.append(" rolled a ").append(diceNumber);
                sb.append(" and moved from ").append(playerLastPosition.get(playerId));

                int newPosition = endPosition;
                if(snakeMap.get(endPosition)!=null) {
                    sl = " after snake dinner ";
                    newPosition = snakeMap.get(endPosition).getEnd();
                    playerLastPosition.put(playerId, newPosition);
                } else if(ladderMap.get(endPosition)!=null) {
                    sl = " after ladder ride ";
                    newPosition = ladderMap.get(endPosition).getEnd();
                    playerLastPosition.put(playerId, newPosition);
                } else {
                    playerLastPosition.put(playerId, newPosition);
                }
                sb.append(" to ").append(playerLastPosition.get(playerId));
                sb.append(sl);
            }
            System.out.println(sb);
        } while(!isPlayerWon(playerList.get(i).getId()));
    }

    private boolean isPlayerWon(int playerId) {
        return playerLastPosition.get(playerId) == 100;
    }

    private boolean checkIfEndPositionIsGreaterThan100(int endPosition) {
        return endPosition>100;
    }

    private void initializePlayerStartValue() {
        for(Player player : playerList) {
            playerLastPosition.put(player.getId(), 0);
        }
    }
}
