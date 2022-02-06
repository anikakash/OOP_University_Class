package STUDENT;
 class Student {
    private String name;
    private String dept;
    private int id;

    Student(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("ID: "+id);
    }
}
public class Test {
    public static void main(String[] args) {
        Student ob = new Student("Karim", "CSE", 232);
       ob.print();
    }
}
