package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        prln("Please Enter The Pascal Triangle Length : ");
        prln("For Exit The Program Enter -1");
        int userInput = sc.nextInt();
        while (userInput!=-1){
            if(userInput<-1 || userInput > 20){
                prln("Please Input a Number Between -1 to 20");
                userInput = sc.nextInt();
                //continue;
            }
            pascalTriangle(userInput);
            prln("\n");
            userInput = sc.nextInt();
        }
    }
    //Triangle Functions :
    static void pascalTriangle(int length){
        int [][] pascal = new int[length][length];
        for (int i=0; i<length; i++){
            pascal[0][i] = 1;
            pascal[i][0] = 1;
        }
        for(int row=1; row<length; row++){
            for(int col = 1; col<length-row; col++){
                pascal[row][col] = pascal[row][col-1] + pascal[row-1][col];
            }
        }

        for(int row=0; row<length; row++){
            for(int col = 0; col<length-row; col++){
                pr(pascal[row][col] + "\t\t");
            }
            prln("\n\n");
        }
    }
    //for print making method
    static void prln(Object anyObject){ //print with new line
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){ //print with out new line
        System.out.print(anyObject);
    }
}
