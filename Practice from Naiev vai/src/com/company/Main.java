package com.company;
import java.util.Scanner;

class Student{
    public  String name;
    public  String Id;
    public  String P_n;
    public  int age;
    public  char sec;
    public  Student(String name, String Id, String P_n, int age, char sec){
        name = name;
        Id = Id;
        P_n = P_n;
        age = age;
        sec = sec;
    }
    public  void  s_i()
    {
        System.out.println((name+' '+age+' '+Id+' '+P_n+' '+age+' '+sec));
    }
}

public class Main {
    public static void main(String[] args) {

        Student S1 = new Student("abc", "123", "anik", 12, 'd');
        S1.s_i();
    }
}
