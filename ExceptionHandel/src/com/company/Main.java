package com.company;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        String s = scanner.nextLine();
//        try{
//            System.out.println("String is : " + s.charAt(0));
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println("Done");
//        }
        try{
            System.out.println("String is : " + s.charAt(100));
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Done");
        }
    }
}
