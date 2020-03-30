package Rough;

public class ConstuctorOverloading
{
    ConstuctorOverloading(double d)
    {
        this(10);//this called followed constructor and current constructor
        System.out.println("Double-arg-constructor");
    }

    ConstuctorOverloading(int d)

        {
            this();//this called followed constructor and current constructor
            System.out.println("int arg constructor");
        }

    ConstuctorOverloading()
            {

                System.out.println("no arg constructor");
            }

    public static void main(String[] args) {
       // ConstuctorOverloading cd = new ConstuctorOverloading(10.5);//all three constructor called
        //ConstuctorOverloading cd1 = new ConstuctorOverloading(10);//last tow constructor called
        ConstuctorOverloading cd2 = new ConstuctorOverloading();//last constructor called
    }
}
