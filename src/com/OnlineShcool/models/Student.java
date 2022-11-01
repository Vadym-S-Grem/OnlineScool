package com.OnlineScool.models;

public class Student {
    private static int student_ID;
    private String student_Name;

    public Student() {
    }

    public Student(String student_Name, int student_ID) {
        this.student_Name = student_Name;
        this.student_ID = student_ID;
    }

    public Student newStudent(String student_Name, int student_ID) {
        return new Student(student_Name, student_ID);
    }

    public Student(String student_Name) {
        this.student_Name = student_Name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Name='" + student_Name + '\'' +
                '}';
    }
}