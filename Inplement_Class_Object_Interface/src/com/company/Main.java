package com.company;

import java.util.Scanner;

public class Main {
    static public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Create Food Menu;
        FoodClass F1 = new FoodClass("Burger", "Chilox", "burgir", 5, 150.55f, 50);
        FoodClass F2 = new FoodClass("Pizza", "Chilox", "pizz", 2, 400.01f, 2);
        FoodClass F3 = new FoodClass("biryani", "Sultan Dines", "kacchi", 1, 250.00f, 5);
        DrinkClass Drink = new DrinkClass("Seven Up", "Chilox", "7up", 5, 18.50f, 2, 7.5f);

        F1.PrintAllInfo();
        F2.PrintAllInfo();
        F3.PrintAllInfo();
        Drink.PrintAllInfo();
        
    }
}
