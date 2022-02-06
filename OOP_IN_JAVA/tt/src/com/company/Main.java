package com.company;

class Player {
    public String name;
    public int JerseyNumber;
    public int age;
    public int matchplay;

    public Player(String name, int jerseyNumber, int age, int matchplay) {
        this.name = name;
        this.JerseyNumber = jerseyNumber;
        this.age = age;
        this.matchplay = matchplay;
    }
}

class Goalkeeper extends Player{
    public Goalkeeper(String name, int jerseyNumber, int age, int matchplay) {
        super(name, jerseyNumber, age, matchplay);
    }
}
class Defender extends Player{
    public Defender(String name, int jerseyNumber, int age, int matchplay) {
        super(name, jerseyNumber, age, matchplay);
    }
}
class Midfielder extends Player{
    public Midfielder(String name, int jerseyNumber, int age, int matchplay) {
        super(name, jerseyNumber, age, matchplay);
    }
}
class Striker extends Player{
    public Striker(String name, int jerseyNumber, int age, int matchplay) {
        super(name, jerseyNumber, age, matchplay);
    }
}

class Team{
     Player P;

    public Team(Player p) {
        P = p;
    }
}
class Football {
    Team t;

    public Football(Team t) {
        this.t = t;
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Goalkeeper p1 = new Goalkeeper("anik", 13, 21, 8);
        Defender p2 = new Defender("akash", 1,34,7);
        Midfielder p3 = new Midfielder("bbb", 3,28,8);
        Striker p4 = new Striker("acc", 6, 30, 7);
        System.out.print(p1.name + " ");
        System.out.print(p1.JerseyNumber+ " ");
        System.out.print(p1.age+ " ");
        System.out.println(p1.matchplay+ " ");

    }
}

