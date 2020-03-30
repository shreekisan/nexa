package Rough;

public class Student_constructor {

    String name;
    int rollNo;

    Student_constructor(String name, int rollNo)
    {
        this.name= name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args)
    {
        Student_constructor s1 = new Student_constructor("Shree", 101);
        System.out.println(s1.name + "   "+s1.rollNo);


    }
}
