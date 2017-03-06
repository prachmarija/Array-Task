package com.company;

public class Main {

    public static void main(String[] args) {
        FactorialClass c = new FactorialClass();
        int twoD[][]= new int[3][3];
    int i,j=0;
    int k = c.fact(1);
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
            {
                twoD[i][j] = k;
                k++;
            }
        for (i=0; i<3; i++)
        {
           for (j=0; j<3;j++)
               System.out.print( "|" + twoD[i][j]);
           System.out.println("|");
        }
    }
}
