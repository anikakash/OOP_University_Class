package com.company;

public class ABC{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}
class Demo extends ABC{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String[] args) {
        ABC obj1 = new ABC();
        ABC obj2 = new Demo();

        obj1.myMethod();
        obj2.myMethod();
    }
}