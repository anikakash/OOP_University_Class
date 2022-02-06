package com.company;
import java.util.Scanner;
public class Main extends Exception{
    public Main(String s){
        super(s);
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        int x = sc.nextInt();
       try{
            if(x>10){
                throw new Main("Your Range is Out of Bound");
            }else{
                for(int i=1; i<=x; i++){
                    System.out.println(i + " * "+x+" = "+i*x);
                }
           }
        } catch (Exception e){
           System.out.println(e);
       }finally {
           System.out.println("Done!!");
       }

    }
}
