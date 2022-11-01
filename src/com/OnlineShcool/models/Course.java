package com.OnlineShcool.models;

import java.util.Scanner;

public class Course {
    Scanner scannerCourse = new Scanner(System.in);

    public int course_ID;
    public static int counter;

    public String course_Name;
    private String teacher_Name;
    private String student_Name;
    private String lecture_Name;

    public Course(String course_Name) {
        this.course_Name = course_Name;
    }

    public Course() {

    }

    Teacher teacher = new Teacher();
    Student student = new Student();
    Lecture lecture = new Lecture();

    public Course newCourse(String course_Name) {
        course_ID++;
        return new Course(course_Name);
    }

    public void menuCourse() {
        System.out.println("|----------------------------------|");
        System.out.println("| Selected category ------> Course |");
        System.out.println("|----------------------------------|");
        System.out.println("|          Create a new ...        |");
        System.out.println("|  Course ----> 1 |  Teacher --> 2 |");
        System.out.println("|  Student ---> 3 |  Lecture --> 4 |");
        System.out.println("|----------------------------------|");

        byte categoryNumberCourse = scannerCourse.nextByte();
        if (categoryNumberCourse == 4) {
            lecture.createLecture();
        } else {
            System.out.println("|----------------------------------|");
            System.out.println("|       Not yet implemented,       |");
            System.out.println("|      please come back later      |");
            menuCourse();
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_ID=" + course_ID +
                ", course_Name='" + course_Name + '\'' +
                '}';
    }
}