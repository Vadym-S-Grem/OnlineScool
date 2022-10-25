package com.OnlineScool;

import com.OnlineScool.models.Course;
import com.OnlineScool.models.Lecture;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        Lecture lecture1 = new Lecture("First Lecture",1);
//        course1.course_ID = lecture1.course_ID; !!!!!!!! Не працює. Не можу зрозуміти чому.!!!!!!!
        lecture1.newLecture();

        Course course2 = new Course();
        Lecture lecture2 = new Lecture("Second Lecture", 2);
//        course2.course_ID = lecture2.course_ID;
        lecture2.newLecture();

        Course course3 = new Course();
        Lecture lecture3 = new Lecture("Third Lecture", 3);
//        course3.course_ID = lecture3.course_ID;
        lecture3.newLecture();

        Course course4 = new Course();
        Lecture lecture4 = new Lecture("Fourth Lecture", 4);
//        course4.course_ID = lecture4.course_ID;
        lecture4.newLecture();

        Course course5 = new Course();
        Lecture lecture5 = new Lecture("Fifth Lecture", 5);
//        course5.course_ID = lecture5.course_ID;
        lecture5.newLecture();

        Course course6 = new Course();
        Lecture lecture6 = new Lecture("Sixth Lecture", 6);
//        course6.course_ID = lecture6.course_ID;
        lecture6.newLecture();

        lecture6.amount();
    }
}