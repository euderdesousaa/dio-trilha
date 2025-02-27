package br.com.dio.service;

import br.com.dio.SudokuGenerator;
import br.com.dio.model.Board;
import br.com.dio.model.GameStatusEnum;
import br.com.dio.model.Space;

import java.util.*;

public class BoardService {

    private final static int BOARD_LIMIT = 9;

    private final Board board;

    private final SudokuGenerator generator = new SudokuGenerator();

    public BoardService() {
        int[][] generatedBoard = generator.generateSudoku(30); // Mantém 30 dicas
        Map<String, String> gameConfig = convertBoardToConfig(generatedBoard);
        this.board = new Board(initBoard(gameConfig));
    }


    public List<List<Space>> getSpaces(){
        return board.getSpaces();
    }

    public void reset(){
        board.reset();
    }

    public boolean hasErrors(){
        return board.hasErrors();
    }

    public GameStatusEnum getStatus(){
        return board.getStatus();
    }

    public boolean gameIsFinished(){
        return board.gameIsFinished();
    }
    private Map<String, String> convertBoardToConfig(int[][] generatedBoard) {
        Map<String, String> gameConfig = new HashMap<>();
        for (int r = 0; r < BOARD_LIMIT; r++) {
            for (int c = 0; c < BOARD_LIMIT; c++) {
                int value = generatedBoard[r][c];
                boolean fixed = value != 0;
                gameConfig.put("%s,%s".formatted(r, c), value + "," + fixed);
            }
        }
        return gameConfig;
    }
    private List<List<Space>> initBoard(final Map<String, String> gameConfig) {
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = gameConfig.getOrDefault("%s,%s".formatted(i, j), "0,false");
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        return spaces;
    }
}
