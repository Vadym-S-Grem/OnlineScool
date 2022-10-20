package com.OnlineScool.models;

public class Lecture {
    private static int lecture_ID;
    private String lecture_Name;
    private String teacher_Name;

    public void newLecture() {
        lecture_ID++;
        System.out.println("Lecture ID   — " + lecture_ID);
        System.out.println("Lecture Name — " + lecture_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public Lecture(String lecture_Name) {
        this.lecture_Name = lecture_Name;
    }

}