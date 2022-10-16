package com.OnlineScool.Models;

public class Courses {
    private static int courses_ID;
    private String courses_Name;
    private String teachers_Name;
    private String students_Name;

    public void newCourse() {
        courses_ID++;
        System.out.println("Course ID   — " + courses_ID);
        System.out.println("Course Name — " + courses_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Courses(String courses_Name) {
        this.courses_Name = courses_Name;
    }
}