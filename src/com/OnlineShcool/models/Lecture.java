package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.*;
import java.util.Scanner;

public class Lecture {
    public static Scanner scannerLecture = new Scanner(System.in);

    private static int lecture_ID;
    private String lecture_Name;
    private String teacher_Name;
    public int course_ID;
    public int lectureLimit = 8;

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

    public void menuLecture() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|          Selected category...—> Lecture           |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| Lecture............—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberLecture = scannerLecture.nextByte();
        switch (categoryNumberLecture) {
            case 1:
//                LectureRepo lectureRepo = new LectureRepo();
//                lectureRepo.addLecture();
                scannerLecture.close();
                break;
            case 2:
                menuLecture();
                scannerLecture.close();
                break;
            case 3:
                menuLecture();
                scannerLecture.close();
                break;
            case 4:
                menuLecture();
                scannerLecture.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerLecture.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerLecture.close();
                break;
            default:
                if ((categoryNumberLecture >= -128 & categoryNumberLecture <= 127) & (categoryNumberLecture < 0 ^ categoryNumberLecture > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuLecture();
                } else if (categoryNumberLecture != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuLecture();
                } else {
                    break;
                }
        }
    }

//    public void createLecture() {
//            System.out.println("|----------------------------------|");
//            System.out.println("|  Enter the Title of the Lecture  |");
//            System.out.println("|----------------------------------|");
//            lecture_Name = scannerLecture.next();
//            System.out.println("|----------------------------------|");
//            System.out.println("|    Enter the ID of the Course    |");
//            System.out.println("|----------------------------------|");
//            course_ID = scannerLecture.nextInt();
//            Lecture lecture = newLecture(lecture_Name, course_ID);
//            System.out.println("|----------------------------------|");
//            System.out.println(lecture);
//            System.out.println("|----------------------------------|");
//            if (lecture_ID != lectureLimit) {
//                createNewLecture();
//            } else {
//                System.out.println("  Lecture limit reached ---> " + lectureLimit);
//                stopProgramLecture();
//            }
//    }

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