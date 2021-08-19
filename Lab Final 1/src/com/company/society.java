package com.company;

interface learn {
    public void academicKnowledge();
    public void manners();
    public void goodBehaviour();
    public void dicipline();
    public void puntuality();
}
class student implements learn {
    private int ID;
    private String name;

    public student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public void academicKnowledge() {

    }

    @Override
    public void manners() {

    }

    @Override
    public void goodBehaviour() {

    }

    @Override
    public void dicipline() {

    }

    @Override
    public void puntuality() {

    }
}

class parents {
    public String name;

    public parents(String name) {
        this.name = name;
    }
    public void guidStudent(){

    }
}
class teachers {
    public String name;

    public teachers(String name) {
        this.name = name;
    }
    public void guidStudent(){

    }
}
public class society {
    public static void main(String[] args) {
        student s = new student(14210,"anik");
        s.academicKnowledge();
    }
}