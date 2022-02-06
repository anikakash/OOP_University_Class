package com.company;

public class ClassTest extends Exception{
    public ClassTest(String s){
        super(s);
    }
    public static void main(String[] args) {
        int x, y, result;
        x = 1000;
        y = 0;
        try {
            if (y < 1) throw new ClassTest("Undefine Enter a Valid value of y");
            else {
                result = x / y;
                System.out.println("The result is : " + result);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Done!!!");
        }
    }
}
