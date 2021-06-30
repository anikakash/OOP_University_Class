package com.company;

import com.company.FoodClass;

public class DrinkClass extends FoodClass {
    public float getFoodRating() {
        return FoodRating;
    }

    private float FoodRating;
    public DrinkClass(){
        super();
    }

    public DrinkClass(String FoodName, String ShopName, String PassWord, int ExpireDate, float FoodPrice,  int TotalOrder, float rating){
        super(FoodName, ShopName, PassWord, ExpireDate, FoodPrice, TotalOrder);
        FoodRating = rating;
    }
    //shop year
    public DrinkClass(String FoodName, String ShopName, String PassWord, int ExpireDate, float FoodPrice,  int TotalOrder,int ShopYear, float rating){
        super(FoodName, ShopName, PassWord, ExpireDate, FoodPrice, TotalOrder, ShopYear);
        FoodRating = rating;
    }
    @Override
    public void PrintAllInfo(){
        super.PrintAllInfo();
        System.out.println("\n\nOverride");
        System.out.println("Rating : "+getFoodRating());

    }
}

