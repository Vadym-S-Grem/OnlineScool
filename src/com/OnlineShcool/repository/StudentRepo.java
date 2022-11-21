package com.OnlineShcool.repository;

import com.OnlineShcool.models.Teacher;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRepo {
    Scanner scannerTeacherRepo = new Scanner(System.in);
    private int CAPACITY = 3;
    public Teacher[] teacherArray = new Teacher[CAPACITY];


    //public void addTeacher() {
//        for (int i = 0; i < teacherArray.length; i++) {
//            if (teacherArray[i] == null) {
//                System.out.println("|----------------------------------|");
//                System.out.println("|  Enter the Name of the Teacher   |");
//                System.out.println("|----------------------------------|");
//                Teacher teacher = new Teacher(scannerTeacherRepo.next());
//                //                System.out.println("|----------------------------------|");
//                //                System.out.println("|   Enter the ID of the Teacher    |");
//                //                System.out.println("|----------------------------------|");
//                teacherArray[i] = teacher;
//                System.out.println("|----------------------------------|");
//                System.out.println("           " + teacherArray[i].getTeacherName());
//                System.out.println("|----------------------------------|");
//                while ( i == CAPACITY - 1) {
//                    System.out.println("CAPACITY " + CAPACITY);
//                    int tmpCapacity = CAPACITY;
//                    CAPACITY = (CAPACITY * 3) / 2 + 1;
//                    Teacher[] tmpArrayTeacher = new Teacher[CAPACITY];
//                    System.arraycopy(teacherArray, 0, tmpArrayTeacher, 0, tmpCapacity);
//                    teacherArray = tmpArrayTeacher;
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                    System.out.println("CAPACITY " + CAPACITY);
//                }
//                System.out.println("|        Create new Teacher?       |");
//                System.out.println("|   Yes ---> 1    |    No ---> 2   |");
//                System.out.println("|----------------------------------|");
//                byte yes = scannerTeacherRepo.nextByte();
//                if (yes == 1) {
//                    addTeacher();
//                    break;
//                } else if (yes == 2 ) {
//                    teacher.menuTeacher();
//                    break;
//                } else {
//                    System.out.println("|----------------------------------|");
//                    System.out.println("|   !!!   Incorrect number   !!!   |");
//                    System.out.println("|----------------------------------|");
//                    teacher.menuTeacher();
//                }
//            } else {
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                System.out.println("           " + teacherArray[i].getTeacherName());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "TeacherRepo{" +
                "teacherArray=" + Arrays.toString(teacherArray) +
                '}';
    }

    public void showID() {

        System.out.println(Arrays.toString(getTeacherArray()));

//        for (int i = 0; i < teacherArray.length; i++) {
//
//            System.out.println(teacherArray[i]);
//        }

    }

    private Teacher[] getTeacherArray() {
        return teacherArray;
    }

}
