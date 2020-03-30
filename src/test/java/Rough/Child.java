package Rough;

public class Child extends Parent {
    public void add() {
        System.out.println("I am the child class");
    }

    public void show()
    {
        super.add();//calling the parent class
    }

    public static void main(String[] args) {

        Child c = new Child();
        c.show();

    }
}
