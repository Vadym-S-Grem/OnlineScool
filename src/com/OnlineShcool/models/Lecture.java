package com.OnlineShcool.models;

import java.util.Scanner;

public class Lecture {
    Scanner scannerLecture = new Scanner(System.in);
    private static int lecture_ID;
    private String lecture_Name;
    private String teacher_Name;
    public int course_ID;

    public Lecture() {

    }

    public void counter() {
        lecture_ID++;
    }

    public Lecture(String lecture_name, int course_ID) {
        this.lecture_Name = lecture_name;
        this.course_ID = course_ID;
    }

    public Lecture newLecture(String lecture_Name, int course_ID) {
        counter();
        return new Lecture(lecture_Name, course_ID);
    }

    public void createLecture() {
        System.out.println("|----------------------------------|");
        System.out.println("|  Enter the Title of the Lecture  |");
        System.out.println("|----------------------------------|");
        String lecture_Name = scannerLecture.next();
        System.out.println("|----------------------------------|");
        System.out.println("|    Enter the ID of the Course    |");
        System.out.println("|----------------------------------|");
        int course_ID = scannerLecture.nextInt();
        Lecture lecture = newLecture(lecture_Name, course_ID);
        System.out.println("|----------------------------------|");
        System.out.println(lecture);
        System.out.println("|----------------------------------|");
        isNewLecture();
    }

    public void isNewLecture() {
        System.out.println("  All lectures ---> " + lecture_ID);
        System.out.println("|        Create new lecture?       |");
        System.out.println("|   Yes ---> 1    |    No ---> 2   |");
        System.out.println("|----------------------------------|");
        int yes = scannerLecture.nextInt();
        if (yes == 1) {
            createLecture();
        } else {
            stopProgram();
        }
    }

    public void stopProgram() {
        scannerLecture.close();
        System.out.println("|----------------------------------|");
        System.out.println("|    Exit the Program. Goodbye!    |");
        System.out.println("————————————————————————————————————");
    }

    @Override
    public String toString() {
        return "  Lecture{" +
                "Name='" + lecture_Name + '\'' +
                ", ID=" + course_ID +
                '}';
    }

    public Lecture(String lecture_Name) {
        this.lecture_Name = lecture_Name;
        //this.course_ID = course_ID;
    }

    public void amount() {
        System.out.println("Last Course ID     — " + course_ID);
        System.out.println("Amount Lectures    — " + lecture_ID);
    }
}