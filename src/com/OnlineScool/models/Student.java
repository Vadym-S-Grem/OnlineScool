package com.OnlineScool.models;

public class Student {
    private static int student_ID;
    private String student_Name;

    public void newStudent() {
        student_ID++;
        System.out.println("Student ID   — " + student_ID);
        System.out.println("Student Name — " + student_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Student(String student_Name) {
        this.student_Name = student_Name;
    }
}
