package com.data.structure.test;

import java.util.Arrays;

public class Assassins {
    public static void main(String []args){
        Assassins as=new Assassins();
        String [] strAray1={"X.....>","..v..X.",".>..X..","A......"};
        String [] strAray2={"...Xv", "AX..^", ".XX.."};
        System.out.println(as.Solution(strAray1));
        System.out.println(as.Solution(strAray2));

    }
    public boolean Solution(String [] B){
        char[][] charArray=new char[B.length][B[0].length()];
        char[][] sol=new char[B.length][B[0].length()];
        int i=0;
        for(String str: B){
            charArray[i++]= str.toCharArray();
        }
        printArray(charArray);
        System.out.println("======");
        charArray=fillArray(charArray);
        printArray(charArray);
        if (!solveMazeUtil(charArray, 0, 0, sol)) {
            return false;
        }

        return true;
    }

    private void printArray(char[][] charArray) {
        for (char []ch:charArray){
            System.out.println(Arrays.toString(ch));
        }
    }

    private char[][] fillArray(char[][] charArray) {
        int M=charArray.length;
        int N=charArray[0].length;
        for(int x=0;x<M;x++){
            for(int y=0;y<N;y++){
                if(charArray[x][y]=='>' && y < N-1){
                    int j=y;
                    while(j < N&& charArray[x][j] != 'X' ){
                        charArray[x][j]='Y';
                        ++j;
                    }
                }
                if(x<M-1 && charArray[x][y]=='v' ){
                    int i=x;
                    while(i<M && charArray[i][y]!='X' ){
                        charArray[i][y]='Y';
                        ++i;
                    }
                }
                if(charArray[x][y]=='<' && y>0){
                    int j=y;
                    while(j>=0&& charArray[x][j]!='X' ){
                        charArray[x][j]='Y';
                        --j;
                    }
                }
                if(charArray[x][y]=='^' && x>0){
                    int i=x;
                    while(i>=0 && charArray[i][y]!='X' ){
                        charArray[i][y]='Y';
                        --i;
                    }
                }
            }
        }
        return charArray;
    }

    /* A recursive utility function to solve Maze
       problem */
    boolean solveMazeUtil(char[][] maze, int x, int y,
                          char[][] sol)
    {
        // if (x, y is goal) return true
        if (x == maze[0].length && y == maze.length) {
            sol[x][y] = '.';
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y)) {
            // mark x, y as part of solution path
            sol[x][y] = '.';

            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            /* If moving in x direction doesn't give
               solution then  Move down in y direction */
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            /* If none of the above movements works then
               BACKTRACK: unmark x, y as part of solution
               path */
            sol[x][y] = 0;
            return false;
        }

        return false;
    }
    boolean isSafe(char[][] maze, int x, int y)
    {
        // if (x, y outside maze) return false
        return (x >= 0 && x < maze[0].length && y >= 0 && y < maze.length && maze[x][y] == '.');
    }


}
