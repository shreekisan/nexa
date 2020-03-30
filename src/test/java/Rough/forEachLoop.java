package Rough;

public class forEachLoop {
    public static void main(String[] args) {
        /*int[]x={10,20,30,40};
       *//* for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }*//*

        for (int x1:x)
        {
            System.out.println(x1);
        }*/

       //int[][]x={{10,20,30},{40,50}};
        /*for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.println(x[i][j]);
            }
        }*/
        /*for(int[] x1:x)//each dimensional array x1 in x
        {
            for(int x2:x1)//for each int value x2 in x1
            {
                System.out.println(x2);
            }
        }*/
        int[][][]x={{{10,20,30},{40,50},{60,70,80}}};// x is 3 dimensional array
        for(int[][]x1:x)//x1 contains two dimensional array
        {
            for(int[]x2:x1)//x2 contains one dimensional array
            {
                for(int x3:x2)//x3 contains all integer value
                {
                    System.out.println(x3);
                }
            }

        }
    }
}
