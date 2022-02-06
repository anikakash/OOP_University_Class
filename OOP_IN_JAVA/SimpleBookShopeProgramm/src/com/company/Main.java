package com.company;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in); //making a scanner;
    static String [] books = {"C","Java", "Python"}; //storing book
    static int [] bookPrice = {200, 300, 250}; //book price list
    static final  double StudentDiscount = 0.3; //Discount Amount Set;
    static final  double TeacherDiscount = 0.4;
    static final  double AlineDiscount = 0.05;

    public static void main(String[] args) {
        prln("--------Welcome To Our Book Store----"); //welcome massage;
        pr("Which Book Do you Want?\nAns: "); // Ask for book;

        String userChoice = sc.nextLine(); // taking input of books;

        if(books[0].toLowerCase().equals(userChoice.toLowerCase())){
                prln("You Choice C Programming Books. And The Price is : "+bookPrice[0]);
                identity(0);
        }else if(books[1].toLowerCase().equals(userChoice.toLowerCase())){
            prln("You Choice Java Programming Books. And The Price is : "+bookPrice[1]);
            identity(1);
        } else if(books[2].toLowerCase().equals(userChoice.toLowerCase())) {
            prln("You Choice Python Programming Books .And The Price is : "+bookPrice[2]);
            identity(2);
        } else {
            pr("We are sorry, Your searching book is not available to us.\n");
            prln("See The Book list ?\n1.Yes? \n2.No?");
            int ch = sc.nextByte();
            if(ch == 1){
                for(int i=0; i<books.length; i++){
                    pr(books[i]+" "+bookPrice[i] + " Tk.\n");
                }
            }
            else pr("Thank You!");
        }
    }
    static void identity(int i){
        prln("Choice Your Profession : ");
        prln("Student ? Teacher ? Aline ? Normal People?");
        pr("Ans : ");
        String buyer = sc.nextLine();
        if(buyer.toLowerCase().equals("student")){
            double price = bookPrice[i]-(bookPrice[i]*StudentDiscount);
            pr("Your Total Price After getting 0.3% Discount : "+price);
        }else if(buyer.toLowerCase().equals("teacher")) {
            double price = bookPrice[i] - (bookPrice[i] * TeacherDiscount);
            pr("Your Total Price After getting 0.4% Discount : " + price);
        }else if(buyer.toLowerCase().equals("aline")){
            double price = bookPrice[i]-(bookPrice[i]*AlineDiscount);
            pr("Your Total Price After getting 0.05% Discount : "+price);
        }else{
            double price = bookPrice[i];
            pr("Sorry There is no Discount for you. Total Price : "+price);
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
