package com.problemsolving.company.zalando;

import java.util.Arrays;

public class Assassins {

    public boolean Solution(String[] B) {
        char[][] charArray = new char[B.length][B[0].length()];
        char[][] sol = new char[B.length][B[0].length()];
        int i = 0, j = 0;
        for (String str : B) {
            charArray[i++] = str.toCharArray();
        }
        printArray(charArray);
        System.out.println("======");
        fillArray(charArray);
        printArray(charArray);
        i = -1;
        boolean flag = true;
        while (i < B.length && flag) {
            ++i;
            j = 0;
            while (j < B[0].length()) {
                if (charArray[i][j] == 'A') {
                    flag = false;
                    break;
                }
                ++j;
            }
        }
        return solveMazeUtil(charArray, i, j, sol);
    }

    private void printArray(char[][] charArray) {
        for (char[] ch : charArray) {
            System.out.println(Arrays.toString(ch));
        }
    }

    private void fillArray(char[][] charArray) {
        int M = charArray.length;
        int N = charArray[0].length;
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < N; y++) {
                if (charArray[x][y] == '>') {
                    charArray[x][y] = 'Y';
                    int j = y+1;
                    while (j < N && isEmptyCell(x,j, charArray)) {
                        charArray[x][j] = 'Y';
                        ++j;
                    }
                }

                if (x < M - 1 && charArray[x][y] == 'v') {
                    charArray[x][y] = 'Y';
                    int i = x+1;
                    while (i < M && isEmptyCell(i,y, charArray)) {
                        charArray[i][y] = 'Y';
                        ++i;
                    }
                }
                if (y > 0 && charArray[x][y] == '<' ) {
                    charArray[x][y] = 'Y';
                    int j = y-1;
                    while (j >= 0 && isEmptyCell(x,j, charArray)) {
                        charArray[x][j] = 'Y';
                        --j;
                    }
                }
                if (charArray[x][y] == '^' && x > 0) {
                    charArray[x][y] = 'Y';
                    int i = x-1;
                    while (i >= 0 && isEmptyCell(i,y, charArray)) {
                        charArray[i][y] = 'Y';
                        --i;
                    }
                }
            }
        }
    }
    boolean isEmptyCell(int x,int y, char [][]charArray){
        return charArray[x][y] == '.' || charArray[x][y] == 'Y';
    }


    boolean solveMazeUtil(char[][] maze, int x, int y, char[][] sol) {
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == '.') {
            sol[x][y] = '.';
            return true;
        }

        if (isSafe(maze, x, y)) {
            if (sol[x][y] == '.')
                return false;
            sol[x][y] = '.';

            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            if (solveMazeUtil(maze, x - 1, y, sol))
                return true;

            if (solveMazeUtil(maze, x, y - 1, sol))
                return true;

            sol[x][y] = 'X';
            return false;
        }

        return false;
    }

    boolean isSafe(char[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && (maze[x][y] == '.' || maze[x][y] == 'A'));
    }


}
