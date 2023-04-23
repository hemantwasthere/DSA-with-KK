package com.hemant;

public class contains {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int[][] list = new int[m][n];
        int noOfoddValuedCells = 0;

        for(int i = 0; i < indices.length; i++){
            int rowIdx = indices[i][0];
            int colIdx = indices[i][1];

            for(int j = 0; j < n; j++){
                list[rowIdx][j]++;
            }

            for(int j = 0; j < m; j++){
                list[j][colIdx]++;
            }
        }


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(list[i][j] % 2 != 0) noOfoddValuedCells++;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println(noOfoddValuedCells);
    }
}
