package com.OnlineShcool;

import com.OnlineShcool.models.*;

import java.util.Scanner;

public class MethodMain {


    public static void startMenu() {

        System.out.println("—————————————————————————————————————————————————————");
        System.out.println("|         Please enter the Category number          |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Course.............—> 1 | Student............—> 4 |");
        System.out.println("| Lecture............—> 2 | HomeWork...........—> 5 |");
        System.out.println("| Teacher............—> 3 | AdditionalMaterial.—> 6 |");
        System.out.println("| Exit the Program.............................—> 0 |");
        System.out.println("|---------------------------------------------------|");

        Scanner categorySelection = new Scanner(System.in);

        byte categoryNumber = categorySelection.nextByte();

        switch (categoryNumber) {
            case 1:
                Course course = new Course();
                course.menuCourse();
                categorySelection.close();
                break;
            case 2:
                Lecture lecture = new Lecture();
                lecture.menuLecture();
                categorySelection.close();
                break;
            case 3:
                Teacher teacher = new Teacher();
                teacher.menuTeacher();
                categorySelection.close();
                break;
            case 4:
                Student student = new Student();
                student.menuStudent();
                categorySelection.close();
                break;
            case 5:
                //HomeWork homeWork = new HomeWork();
                //homeWork.menuHomeWork();
                categorySelection.close();
                break;
            case 6:
                AdditionalMaterial additionalMaterial = new AdditionalMaterial();
                additionalMaterial.menuAdditionalMaterial();
                categorySelection.close();
                break;
            case 0:
                stopProgram();
                categorySelection.close();
                break;
            default:
                if ((categoryNumber >= -128 & categoryNumber <= 127) & (categoryNumber < 0 ^ categoryNumber > 6)) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    startMenu();
                    break;
                } else {
                }
        }
    }

    public static void stopProgram() {
        System.out.println("|---------------------------------------------------|");
        System.out.println("|            Exit the Program. Goodbye!             |");
        System.out.println("—————————————————————————————————————————————————————");
    }
}