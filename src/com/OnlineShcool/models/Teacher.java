package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.TeacherRepo;

import java.util.Scanner;

public class Teacher {
    Scanner scannerTeacher = new Scanner(System.in);

    private int teacher_ID;
    private String teacher_Name;

    public String getTeacherName() {
        return teacher_Name;
    }

    public void setTeacherName(String teacher_Name) {
        this.teacher_Name = teacher_Name;
    }

    public int getTeacher_ID() {
        return teacher_ID;
    }

    public void setTeacher_ID(int teacher_ID) {
        this.teacher_ID = teacher_ID;
    }

    public Teacher() {
    }

    public Teacher(String teacher_Name, int teacher_ID) {
        this.teacher_Name = teacher_Name;
        this.teacher_ID = teacher_ID;
    }

    public Teacher newTeacher(String teacher_Name, int teacher_ID) {
        this.teacher_Name = teacher_Name;
        this.teacher_ID = teacher_ID;
        return new Teacher();
    }

    public void menuTeacher() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|           Selected category...—> Teacher          |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| Teacher............—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberTeacher = scannerTeacher.nextByte();
        switch (categoryNumberTeacher) {
            case 1:
                TeacherRepo teacherRepo = new TeacherRepo();
                teacherRepo.addTeacher(new Teacher(getTeacherName(), getTeacher_ID()));
                scannerTeacher.close();
                break;
            case 2:
                menuTeacher();
                scannerTeacher.close();
                break;
            case 3:
                menuTeacher();
                scannerTeacher.close();
                break;
            case 4:
                menuTeacher();
                scannerTeacher.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerTeacher.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerTeacher.close();
                break;
            default:
                if ((categoryNumberTeacher >= -128 & categoryNumberTeacher <= 127) & (categoryNumberTeacher < 0 ^ categoryNumberTeacher > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuTeacher();
                } else if (categoryNumberTeacher != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuTeacher();
                } else {
                    break;
                }
        }
    }
}