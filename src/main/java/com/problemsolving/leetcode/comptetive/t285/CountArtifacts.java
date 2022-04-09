package com.problemsolving.leetcode.comptetive.t285;

public class CountArtifacts {
    public static void main(String []args){

//        int[][] artifacts = {{0, 0, 0, 0}, {0, 1, 1, 1}};
//        int[][] dig = {{0, 0}, {0, 1}};

//        int[][] artifacts = {{0, 0, 0, 0}, {0, 1, 1, 1}};
//        int[][] dig = {{0, 0}, {0, 1}, {1, 1}};
        int[][] artifacts = {{2, 1, 3, 3}, {0, 1, 1, 1}};
        int[][] dig = {{2, 2}};
        CountArtifacts countArtifacts = new CountArtifacts();
        System.out.println(countArtifacts.digArtifacts(4, artifacts, dig));

    }
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] matrix=new int [n][n];
        int count=0;
        for(int i=0;i<dig.length;i++){
            int j=dig[i][0];
            int k=dig[i][1];
            matrix[j][k]=1;
        }
        for (int i=0;i<artifacts.length;i++){
            int size=0;
            int unCovered=0;
            for(int j=artifacts[i][0];j<=artifacts[i][2];j++){
                for(int k=artifacts[i][1];k<=artifacts[i][3];k++){
                    size++;
                    if(matrix[j][k]==1){
                        unCovered++;
                    }
                }
            }
            if(size==unCovered){
                count++;
            }
        }
       return count;
    }

    public int digArtifacts_2(int n, int[][] artifacts, int[][] dig) {
        boolean[][] dug = new boolean[n][n];
        for(int[] u: dig){
            dug[u[0]][u[1]] = true;
        }
        int ans = 0;
        outer:
        for(int[] a : artifacts){
            for(int i = a[0];i <= a[2];i++){
                for(int j = a[1];j <= a[3];j++){
                    if(!dug[i][j]){
                        continue outer;
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}
