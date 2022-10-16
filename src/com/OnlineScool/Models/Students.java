package com.OnlineScool.Models;

public class Students {
    private static int students_ID;
    private String students_Name;

    public void newStudent() {
        students_ID++;
        System.out.println("Student ID   — " + students_ID);
        System.out.println("Student Name — " + students_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Students(String students_Name) {
        this.students_Name = students_Name;
    }
}
