package com.company;

public class Student {
    public String  Name;
    public String Gender;
    public String StudentID;
    public String DegreeName;

    public Student(String name, String gender, String studentID, String degreeName) {
        Name = name;
        Gender = gender;
        StudentID = studentID;
        DegreeName = degreeName;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getDegreeName() {
        return DegreeName;
    }

//    public String toString(String name, String gender, String studentID, String degreeName){
//        String s = "";
//        return s = "["+name+", "+gender+", ID:"+studentID+", "+degreeName+"]";
//    }


    @Override
    public String toString() {
        return "Student[" +
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", StudentID='" + StudentID + '\'' +
                ", DegreeName='" + DegreeName + '\'' +
                ']';
    }
}
