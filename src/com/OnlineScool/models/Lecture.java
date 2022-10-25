package com.OnlineScool.models;

import com.OnlineScool.serviсes.CourseSrc;

public class Lecture {
    private static int lecture_ID;
    private String lecture_Name;
    private String teacher_Name;
    public int course_ID;

    public void newLecture() {
        lecture_ID++;
        System.out.println("Course ID    — " + course_ID);
        System.out.println("Lecture ID   — " + lecture_ID);
        System.out.println("Lecture Name — " + lecture_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public Lecture(String lecture_Name, int course_ID) {
        this.lecture_Name = lecture_Name;
        this.course_ID = course_ID;
    }

    public void amount() {
        System.out.println("Last Course ID     — " + course_ID);
        System.out.println("Amount Lectures    — " + lecture_ID);
    }
}