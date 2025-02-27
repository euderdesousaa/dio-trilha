package br.com.dio;

import java.util.*;

public class SudokuGenerator {

    private static final int SIZE = 9;
    private static final int SUBGRID = 3;
    private static final Random RANDOM = new Random();
    private int[][] board = new int[SIZE][SIZE];

    public int[][] generateSudoku(int clues) {
        fillBoard(); // Gera um tabuleiro completo válido
        removeNumbers(clues); // Remove números para criar desafio
        return board;
    }

    private boolean fillBoard() {
        return solve(0, 0);
    }

    private boolean solve(int row, int col) {
        if (row == SIZE) return true; // Tabuleiro preenchido

        int nextRow = col == SIZE - 1 ? row + 1 : row;
        int nextCol = col == SIZE - 1 ? 0 : col + 1;

        List<Integer> numbers = getShuffledNumbers();
        for (int num : numbers) {
            if (isValid(row, col, num)) {
                board[row][col] = num;
                if (solve(nextRow, nextCol)) return true;
                board[row][col] = 0; // Backtracking
            }
        }
        return false;
    }

    private boolean isValid(int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }

        int boxRow = (row / SUBGRID) * SUBGRID;
        int boxCol = (col / SUBGRID) * SUBGRID;
        for (int i = 0; i < SUBGRID; i++) {
            for (int j = 0; j < SUBGRID; j++) {
                if (board[boxRow + i][boxCol + j] == num) return false;
            }
        }
        return true;
    }

    private void removeNumbers(int clues) {
        int cellsToRemove = SIZE * SIZE - clues;
        while (cellsToRemove > 0) {
            int row = RANDOM.nextInt(SIZE);
            int col = RANDOM.nextInt(SIZE);
            if (board[row][col] != 0) {
                board[row][col] = 0;
                cellsToRemove--;
            }
        }
    }

    private List<Integer> getShuffledNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= SIZE; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }
}
