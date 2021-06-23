package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Please Enter Your Name");
        String in = scanner.nextLine();
        System.out.println("Nice To Meet You " + in);
    }
}
