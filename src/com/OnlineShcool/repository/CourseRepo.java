package com.OnlineShcool.repository;

import com.OnlineShcool.models.Course;

import java.util.Arrays;
import java.util.Scanner;

public class CourseRepo {
    Scanner scannerCourseRepo = new Scanner(System.in);
    private int CAPACITY = 3;
    public Course[] courseArray = new Course[CAPACITY];


    //public void addCourse() {
//        for (int i = 0; i < courseArray.length; i++) {
//            if (courseArray[i] == null) {
//                System.out.println("|----------------------------------|");
//                System.out.println("|   Enter the Name of the Course   |");
//                System.out.println("|----------------------------------|");
//                Course course = new Course(scannerCourseRepo.next());
//                //                System.out.println("|----------------------------------|");
//                //                System.out.println("|    Enter the ID of the Course    |");
//                //                System.out.println("|----------------------------------|");
//                courseArray[i] = course;
//                System.out.println("|----------------------------------|");
//                System.out.println("           " + courseArray[i].getCourseName());
//                System.out.println("|----------------------------------|");
//                while ( i == CAPACITY - 1) {
//                    System.out.println("CAPACITY " + CAPACITY);
//                    int tmpCapacity = CAPACITY;
//                    CAPACITY = (CAPACITY * 3) / 2 + 1;
//                    Course[] tmpArrayCourse = new Course[CAPACITY];
//                    System.arraycopy(courseArray, 0, tmpArrayCourse, 0, tmpCapacity);
//                    courseArray = tmpArrayCourse;
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                    System.out.println("CAPACITY " + CAPACITY);
//                }
//                System.out.println("|        Create new Teacher?       |");
//                System.out.println("|   Yes ---> 1    |    No ---> 2   |");
//                System.out.println("|----------------------------------|");
//                byte yes = scannerCourseRepo.nextByte();
//                if (yes == 1) {
//                    addCourse();
//                    break;
//                } else if (yes == 2 ) {
//                    course.menuCourse();
//                    break;
//                } else {
//                    System.out.println("|----------------------------------|");
//                    System.out.println("|   !!!   Incorrect number   !!!   |");
//                    System.out.println("|----------------------------------|");
//                    course.menuCourse();
//                }
//            } else {
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                System.out.println("           " + courseArray[i].getCourseName());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "CourseRepo{" +
                "courseArray=" + Arrays.toString(courseArray) +
                '}';
    }

    public void showID() {

        System.out.println(Arrays.toString(getCourseArray()));

//        for (int i = 0; i < courseArray.length; i++) {
//
//            System.out.println(courseArray[i]);
//        }

    }

    private Course[] getCourseArray() {
        return courseArray;
    }

}
