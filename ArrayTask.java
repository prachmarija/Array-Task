package com.company;

/**
 * Created by Mariia_Dobberstein on 3/6/2017.
 */
public class ArrayTask {
    public static void arraySet () {
        FactorialClass c = new FactorialClass();
        int[][] twoD = new int[3][3];
        int m, a;
        int i, j = 0;
        int k = c.fact(1);
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print("|" + twoD[i][j]);
            System.out.println("|");
        }
    }
}
