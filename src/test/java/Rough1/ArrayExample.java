package Rough1;

public class ArrayExample
{
    public static void main(String[] args) {
       ArrayExample AE= new ArrayExample();
       AE.addArrays();
    }
// sum of two arrays elements in another array.
    public void addArrays()
    {
        int[] array1 ={1,2,3,4,5};
        int[] array2 = {11,12,13,14,15};
        int[] array3 = new int[5];

        for(int i =0;i<array3.length;i++)
        {
            array3[i] = array1[i]+array2[i];
            System.out.println("Sum of "+array1[i]+"  and  "+array2[i]+ " is " +array3[i] );
        }
    }
}
