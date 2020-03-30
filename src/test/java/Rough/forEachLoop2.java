package Rough;

public class forEachLoop2 {
    public static void main(String[] args) {
        int[]x={10,20,30,40,50};//print reverse order
        for(int i=x.length-1;i>=0;i--)
        {
            System.out.println("Array of x value is   " +x[i]);
        }
        //for each
        System.out.println("*************************");
        for(int c:x)
        {
            System.out.println("Array of x value is   "+c);
        }
        System.out.println("*************************");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);//print 0,2,4,6,8,10
            i++;
        }
        System.out.println("*************************");
        int[][] a={{10,20,30},{40,50}};
        //for loop
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println("Array of a value is   " +a[i][j]);
            }
        }
        System.out.println("*************************");
        // for each loop
        for(int[] p:a)
        {
            for (int y:p)
            {
                System.out.println("Array of a value is   "+y);
            }
        }
    }
}
