package com.company;

public class Main {

    public static void main(String[] args) {
        // Byte can store -128 To 127 -> 1 bytes;
        // Short Can Save -32,768 To 32,767 -> 2 bytes;
        // int can Save -2,147,483,648 To 2,147,483,648 -> 4 bytes;
        // long can save -9,223,372,036,854,775,808 TO 9,223,372,036,854,775,807 -> 8 bytes;

        //Now Comes To precision;
        // Float can save 6 To 7 precision Number -> 4 bytes;
        //Double can save 15 decimal digits -> 8 bytes;

        //char take 2 bytes and store ASCII;

        Byte bit = 127;
        System.out.println(bit);
        int num = 12345;
        long res = bit + num;
         System.out.println(res);

        char ch = 'c';
        String str = "C";


    }
}
