package Homework_4;

import utils.ArraysUtils;

public class Chess {
    public static void main(String[] args) {
        char[][] chessTable = new char[8][8];
        chessTable = fillChessTable(chessTable);
        ArraysUtils.printArray(chessTable);
    }

    public static char[][] fillChessTable(char[][] chessTable) {
        for (int i = 0; i < chessTable.length ; i++) {
            for (int j = 0; j < chessTable[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessTable[i][j] = 'W';
                } else {
                    chessTable[i][j] = 'B';
                }
            }
        }
        return chessTable;
    }
}
