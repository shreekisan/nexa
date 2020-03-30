package Rough;

public class ThisAndSuper
{
    String s = "parent variable";
}
class C extends ThisAndSuper
{
    String s ="child variable";
    public void m1()// this and super is not applicable in static method if m1 is static this ans super key word show error.
    {
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
class Test
{
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}

