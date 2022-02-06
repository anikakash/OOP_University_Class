package com.company;

public class FoodClass {
    //Public
    public String FoodName;
    //default
    String ShopName;
    //private
    private int ExpireDate; // Only Admin Can Know this using LastDate() Method
    private float FoodPrice; //Getter and setter
    private int FoodAmount; //Getter and setter
    private int TotalOrder; //OrderAmount()
    private String PassWord; //for admin

    //protected
    protected int ShopYear;

     public FoodClass(){ //Create a Object Contracture with null values and set a primary password;
         FoodName = "";
         ShopName = "";
         PassWord = "admin";
         ExpireDate = 0;
         FoodPrice = 0;
         FoodAmount = 0;
         TotalOrder = 0;
         ShopYear = 0;
     }
    //Create a Object Contracture with All values;
    public FoodClass(String FoodName, String ShopName, String PassWord, int ExpireDate, float FoodPrice,  int TotalOrder ){
        this.FoodName = FoodName;
        this.ShopName = ShopName;
        this.PassWord = PassWord;
        this.ExpireDate = ExpireDate;
        this.FoodPrice = FoodPrice;
        this.TotalOrder = TotalOrder;
        ShopYear = 0;
    }
    //polioMorphism;
    public FoodClass(String FoodName, String ShopName, String PassWord, int ExpireDate, float FoodPrice,  int TotalOrder, int Year){
        this(FoodName, ShopName, PassWord, ExpireDate, FoodPrice, TotalOrder);
         ShopYear = Year;

    }
    public void PrintAllInfo(){

        //New Class Object Using Inheritance
        System.out.println("\nDrink Shop  : ");
        System.out.println("PassWord Status -> "+Checker("burgir"));
        System.out.println("Food Name -> " + FoodName + "\nShop Name -> " + ShopName + "\nExpire Date -> " + LastDate());
        System.out.println("Food Price -> " + getFoodPrice() + "\nFood Amount -> " + TotalFood() + "\nTotal Order -> " + OrderAmount());

    }

    public int OrderAmount(){ //for access private variable;
        return TotalOrder;
    }
    public int LastDate(){
         return ExpireDate;
    }
    public int TotalFood(){
         return FoodAmount;
    }
    public boolean Checker(String UserInput){
         return UserInput.equals(PassWord);
    }

    //Getter and Setter
    public float getFoodPrice() {
        return FoodPrice;
    }

    public int getShopYear(){
         return ShopYear;
    }

    public void setFoodPrice(float foodPrice) {
        FoodPrice = foodPrice;
    }

    public int getFoodAmount() {
        return FoodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        FoodAmount = foodAmount;
    }
}
