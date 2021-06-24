package com.company;

import java.util.Scanner;

public class Main {
   static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int cases = scn.nextInt();
        for(int caseno=1; caseno<=cases; caseno++ ){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println("Case " + caseno + ": " + (a+b));
        }
    }
}
