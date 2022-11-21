package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.StudentRepo;

import java.util.Scanner;

public class Student {

    Scanner scannerStudent = new Scanner(System.in);
    Lecture lecture = new Lecture();
    private static int student_ID;
    private String student_Name;

    public Student() {
    }

    public Student(String student_Name, int student_ID) {
        this.student_Name = student_Name;
        this.student_ID = student_ID;
    }

    public Student newStudent(String student_Name, int student_ID) {
        return new Student(student_Name, student_ID);
    }

    public Student(String student_Name) {
        this.student_Name = student_Name;
    }

    public void menuStudent() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|           Selected category...—> Student          |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| Student............—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberStudent = scannerStudent.nextByte();
        switch (categoryNumberStudent) {
            case 1:
                StudentRepo studentRepo = new StudentRepo();
                //studentRepo.addStudent();
                scannerStudent.close();
                break;
            case 2:
                menuStudent();
                scannerStudent.close();
                break;
            case 3:
                menuStudent();
                scannerStudent.close();
                break;
            case 4:
                menuStudent();
                scannerStudent.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerStudent.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerStudent.close();
                break;
            default:
                if ((categoryNumberStudent >= -128 & categoryNumberStudent <= 127) & (categoryNumberStudent < 0 ^ categoryNumberStudent > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuStudent();
                } else if (categoryNumberStudent != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuStudent();
                } else {
                    break;
                }
        }
    }

    public void createNewStudent() {
        //       System.out.println("  All lectures ---> " + teacher_ID);
        System.out.println("|        Create new Student?       |");
        System.out.println("|   Yes ---> 1    |    No ---> 2   |");
        System.out.println("|----------------------------------|");
        byte yes = scannerStudent.nextByte();
        if (yes == 1) {
            createStudent();
        } else {
            MethodMain.startMenu();
        }
    }

    public void createStudent() {
        System.out.println("|----------------------------------|");
        System.out.println("|  Enter the Name of the Student  |");
        System.out.println("|----------------------------------|");
        student_Name = scannerStudent.next();
        System.out.println("|----------------------------------|");
        System.out.println("|   Enter the ID of the Student    |");
        System.out.println("|----------------------------------|");
        student_ID = scannerStudent.nextInt();
        Student student = newStudent(student_Name, student_ID);
        System.out.println("|----------------------------------|");
        System.out.println(student);
        System.out.println("|----------------------------------|");
        createNewStudent();
    }


    @Override
    public String toString() {
        return "Student{" +
                "student_Name='" + student_Name + '\'' +
                '}';
    }
}