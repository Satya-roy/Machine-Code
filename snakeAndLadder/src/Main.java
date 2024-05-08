import Service.PlaySnakeAndLadder;
import model.Board;
import model.Ladder;
import model.Player;
import model.Snake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer, Ladder> ladderMap = new HashMap<>();
        Map<Integer, Snake> snakeMap = new HashMap<>();

        //Ladder
        ladderMap.put(9, new Ladder(1, 9, 30, "red"));
        ladderMap.put(15, new Ladder(2, 15, 62, "blue"));
        ladderMap.put(42, new Ladder(3, 42, 89, "yellow"));

        //Snake
        snakeMap.put(98, new Snake(1, 98, 5, "Black"));
        snakeMap.put(63, new Snake(2, 63, 45, "blue"));
        snakeMap.put(34, new Snake(3, 34, 17, "violet"));

        //Players
        List<Player> listOfPlayers = new ArrayList<>();
        Player player1 = new Player(1, "Naruto");
        Player player2 = new Player(2, "Sasuke");

        listOfPlayers.add(player1);
        listOfPlayers.add(player2);

        Board board = new Board(ladderMap, snakeMap);
        PlaySnakeAndLadder playSnakeAndLadder = new PlaySnakeAndLadder(board, listOfPlayers);
        playSnakeAndLadder.playGame();
    }
}