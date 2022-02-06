package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code her
        long n, ans=1;
        n = sc.nextLong();
        for(long i=1; i<=n; i++){
            ans*=i;
        }
        System.out.println("The Factorial of "+n+" is "+ans);
    }
}
