package Rough;

public class WhileLoop {

    public static void main(String[] args)
    {
        /*int a=10; int b=20;
        while (a<b)
        {
            System.out.println("hello");//it goes infinitive times
        }
        System.out.println("hi"); // this is not executed because hello world is not complete it goes infinitive times*/
        /*int i=1;
        while (i<=10)
        {
            System.out.println(i);//out put is 1,2,3,4,5,6,7,8,9,,10
            i++;
        }*/

        //multiplication table
        int num = 11;
        int i = 1; // loop variable initialization
        while ( i <= 10 ) { // condition
            int value = num * i;
            System.out.println(num + " * " + i + " = " + value);
            i++;
        }
    }

}