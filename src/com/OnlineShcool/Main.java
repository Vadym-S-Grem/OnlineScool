package com.OnlineScool;

import com.OnlineScool.models.Course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("————————————————————————————————————");
        System.out.println("| Please enter the Category number |");
        System.out.println("|----------------------------------|");
        System.out.println("|  Course ----> 1 |  Teacher --> 2 |");
        System.out.println("|  Student ---> 3 |  Lecture --> 4 |");
        System.out.println("|----------------------------------|");
        System.out.println("|     Exit the Program ----> 0     |");
        System.out.println("|----------------------------------|");

        Scanner categorySelection = new Scanner(System.in);

        byte categoryNumber = categorySelection.nextByte();

        switch (categoryNumber) {
            case 1:
                Course course = new Course();
                course.menuCourse();
                break;
            case 2:
                System.out.println("|----------------------------------|");
                System.out.println("| Selected category -----> Teacher |");
                System.out.println("|----------------------------------|");
                main(args);
                break;
            case 3:
                System.out.println("|----------------------------------|");
                System.out.println("| Selected category -----> Student |");
                System.out.println("|----------------------------------|");
                main(args);
                break;
            case 4:
                System.out.println("|----------------------------------|");
                System.out.println("| Selected category -----> Lecture |");
                System.out.println("|----------------------------------|");
                main(args);
                break;
            case 0:
                categorySelection.close();
                System.out.println("|----------------------------------|");
                System.out.println("|    Exit the Program. Goodbye!    |");
                System.out.println("————————————————————————————————————");
                break;
            default:
                if ((categoryNumber >= -128 & categoryNumber <= 127) & (categoryNumber < 0 ^ categoryNumber > 4)) {

                    System.out.println("|----------------------------------|");
                    System.out.println("|   !!!   Incorrect number   !!!   |");
                    System.out.println("|----------------------------------|");
                    main(args);
                } else {
                    System.out.println("|----------------------------------|");
                    System.out.println("|   !!!   Incorrect symbol   !!!   |");
                    System.out.println("|----------------------------------|");
                    main(args);
                }
                break;
        }
    }
}