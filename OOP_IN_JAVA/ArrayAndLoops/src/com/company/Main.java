package com.company;

public class Main {

    public static void main(String[] args) {

        //While loops;
        int i = 1;
        System.out.println("Print All Even Number : ");
        while (i <= 100){
            if(i%2==0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println("\nPrint All ODD Number : ");
        //for loops ;
        for(int x = 1; x<=100; x++){
            if(x%2!=0)
                System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Now Array Printing: ");
        int [] arr = {1,2,3,4,5};

        //for loops like c++ stl auto;
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }
}
