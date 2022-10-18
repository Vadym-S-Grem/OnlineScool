package com.OnlineScool.models;

public class Teacher {
    private static int teacher_ID;
    private String teacher_Name;

    public void newTeacher() {
        teacher_ID++;
        System.out.println("Teacher ID   — " + teacher_ID);
        System.out.println("Teacher Name — " + teacher_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Teacher(String teacher_Name) {
        this.teacher_Name = teacher_Name;
    }
}
