package Rough;

import org.apache.logging.log4j.core.util.JsonUtils;

public class Forloops {
    public static void main(String[] args) {
        //int i = 0;
        /*for (System.out.println("hello"); i < 3; i++) {
            System.out.println("hi");
        }*/

        /*for (System.out.println("conditional check is optional"); ; i++) {
            System.out.println("complier puts the true value in conditional check");
            // this loops goes infinitive times
        }*/

        /*for (System.out.println("hello"); i < 3;System.out.println("hello ka cha")) {
            i++;
        }*/
       // for(;;);//nothing output but running infinitive times.

        /*for(;;)
        {
            System.out.println("hello");//output is hello in infinitive times.
        }*/
***************************************************************************************************************
        // print only up to 5
        for(int i=0;i<10;i++)
        /*{
            if(i<=5)
            {
                System.out.println(i);
            }
            else
            {
                break;
            }
        }*/
        //print except 5
        if(i!=5)
        {
            System.out.println(i);
        }
    }
}
