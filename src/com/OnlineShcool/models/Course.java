package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.CourseRepo;
import com.OnlineShcool.repository.TeacherRepo;

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
    public Course newCourse(String course_Name) {
        course_ID++;
        return new Course(course_Name);
    }

    public void menuCourse() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|           Selected category...—> Course           |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| Course.............—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberCourse = scannerCourse.nextByte();
        switch (categoryNumberCourse) {
            case 1:
                CourseRepo courseRepo = new CourseRepo();
                //courseRepo.addCourse();
                scannerCourse.close();
                break;
            case 2:
                menuCourse();
                scannerCourse.close();
                break;
            case 3:
                menuCourse();
                scannerCourse.close();
                break;
            case 4:
                menuCourse();
                scannerCourse.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerCourse.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerCourse.close();
                break;
            default:
                if ((categoryNumberCourse >= -128 & categoryNumberCourse <= 127) & (categoryNumberCourse < 0 ^ categoryNumberCourse > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuCourse();
                } else if (categoryNumberCourse != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuCourse();
                } else {
                    break;
                }
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
//        System.out.println("|----------------------------------|");
//        System.out.println("|       Not yet implemented,       |");
//        System.out.println("|      please come back later      |");