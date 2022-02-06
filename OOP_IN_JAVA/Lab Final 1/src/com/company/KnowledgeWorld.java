package com.company;

class library {
    public int racks;
    public String BookName;

    public library(int racks, String bookName) {
        this.racks = racks;
        BookName = bookName;
    }
    public void getKnowledge(){

    }
    public void getInformation(){

    }
    public void setCulture(){

    }
    public void setRecord(){

    }
}
class children extends library{

    public children(int racks, String bookName) {
        super(racks, bookName);
    }
}
class Professionals extends library{

    public Professionals(int racks, String bookName) {
        super(racks, bookName);
    }
}
class researcher extends library{

    public researcher(int racks, String bookName) {
        super(racks, bookName);
    }
}

public class KnowledgeWorld {
    public static void main(String[] args) {
        children ch = new children(1,"Poem Book");
        Professionals pp = new Professionals(2,"Current Affair");
        researcher rr = new researcher(3,"science book");
    }
}
