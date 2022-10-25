package com.OnlineScool.models;

public class Course {
    public int course_ID;
    private String course_Name;
    private String teacher_Name;
    private String student_Name;

    public void newCourse() {
        course_ID++;
        System.out.println("Course ID   — " + course_ID);
        System.out.println("Course Name — " + course_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Course(String course_Name) {
        this.course_Name = course_Name;
    }
    public Course(){

    }
}