package com.problemsolving.company.zalando;

import java.util.Arrays;

public class Assassins {
    public static void main(String []args){
        Assassins as=new Assassins();

//        String [] strAray1={"X.....>","..v..X.",".>..X..","A......"};
//        System.out.println(as.Solution(strAray1));
//        String [] strAray2={"...Xv", "AX..^", ".XX.."};
//        System.out.println(as.Solution(strAray2));
//        String [] strAray3={"A.v","..."};
//        System.out.println(as.Solution(strAray3));
//
//        String [] strAray5={"...",">.A"};
//        System.out.println(as.Solution(strAray5));


    }
    public boolean Solution(String [] B){
        char[][] charArray=new char[B.length][B[0].length()];
        char[][] sol=new char[B.length][B[0].length()];
        int i=0,j=0;
        for(String str: B){
            charArray[i++]= str.toCharArray();
        }
        printArray(charArray);
        System.out.println("======");
        fillArray(charArray);
        printArray(charArray);
        i=0;j=0;
        while(i<B.length){
            while(j<B[0].length()){
                if(charArray[i][j]=='A'){
                    break;
                }
                ++j;
            }
            ++i;
        }
        return solveMazeUtil(charArray, i, j, sol);
    }

    private void printArray(char[][] charArray) {
        for (char []ch:charArray){
            System.out.println(Arrays.toString(ch));
        }
    }

    private void fillArray(char[][] charArray) {
        int M=charArray.length;
        int N=charArray[0].length;
        for(int x=0;x<M;x++){
            for(int y=0;y<N;y++){
                if(charArray[x][y] == '>'){
                    int j=y;
                    while(j < N && charArray[x][j] != '.' ){
                        charArray[x][j]='Y';
                        ++j;
                    }
                }

                if(x<M-1 && charArray[x][y]=='v' ){
                    int i=x;
                    while(i<M && charArray[i][y]!='.' ){
                        charArray[i][y]='Y';
                        ++i;
                    }
                }
                if(charArray[x][y]=='<' && y>0){
                    int j=y;
                    while(j>=0&& charArray[x][j]!='.' ){
                        charArray[x][j]='Y';
                        --j;
                    }
                }
                if(charArray[x][y]=='^' && x>0){
                    int i=x;
                    while(i>=0 && charArray[i][y]=='.' ){
                        charArray[i][y]='Y';
                        --i;
                    }
                }
            }
        }
    }


    boolean solveMazeUtil(char[][] maze, int x, int y,  char[][] sol)
    {
        if (x == maze.length-1 && y == maze[0].length-1  && maze[x][y] == '.') {
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

    boolean isSafe( char maze[][], int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0  && y < maze[0].length && maze[x][y] == '.');
    }


}
