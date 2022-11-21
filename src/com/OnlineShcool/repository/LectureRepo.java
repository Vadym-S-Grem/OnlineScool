package com.OnlineShcool.repository;

import com.OnlineShcool.models.Lecture;
import com.OnlineShcool.models.Teacher;

import java.util.Arrays;
import java.util.Scanner;

public class LectureRepo {
    Scanner scannerLectureRepo = new Scanner(System.in);
    private int CAPACITY = 3;
    public Lecture[] lectureArray = new Lecture[CAPACITY];


    //public void addLecture() {
//        for (int i = 0; i < lectureArray.length; i++) {
//            if (lectureArray[i] == null) {
//                System.out.println("|----------------------------------|");
//                System.out.println("|  Enter the Name of the Lecture   |");
//                System.out.println("|----------------------------------|");
//                Lecture lecture = new Lecture(scannerLectureRepo.next());
//                //                System.out.println("|----------------------------------|");
//                //                System.out.println("|   Enter the ID of the Lecture    |");
//                //                System.out.println("|----------------------------------|");
//                lectureArray[i] = lecture;
//                System.out.println("|----------------------------------|");
//                System.out.println("           " + lectureArray[i].getLectureName());
//                System.out.println("|----------------------------------|");
//                while ( i == CAPACITY - 1) {
//                    System.out.println("CAPACITY " + CAPACITY);
//                    int tmpCapacity = CAPACITY;
//                    CAPACITY = (CAPACITY * 3) / 2 + 1;
//                    Lecture[] tmpArrayLecture = new Lecture[CAPACITY];
//                    System.arraycopy(lectureArray, 0, tmpArrayLecture, 0, tmpCapacity);
//                    lectureArray = tmpArrayLecture;
//                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                    System.out.println("CAPACITY " + CAPACITY);
//                }
//                System.out.println("|        Create new Teacher?       |");
//                System.out.println("|   Yes ---> 1    |    No ---> 2   |");
//                System.out.println("|----------------------------------|");
//                byte yes = scannerLectureRepo.nextByte();
//                if (yes == 1) {
//                    addLecture();
//                    break;
//                } else if (yes == 2 ) {
//                    lecture.menuLecture();
//                    break;
//                } else {
//                    System.out.println("|----------------------------------|");
//                    System.out.println("|   !!!   Incorrect number   !!!   |");
//                    System.out.println("|----------------------------------|");
//                    lecture.menuLecture();
//                }
//            } else {
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//                System.out.println("           " + lectureArray[i].getLectureName());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "LectureRepo{" +
                "lectureArray=" + Arrays.toString(lectureArray) +
                '}';
    }

    public void showID() {

        System.out.println(Arrays.toString(getLectureArray()));

//        for (int i = 0; i < teacherArray.length; i++) {
//
//            System.out.println(teacherArray[i]);
//        }

    }

    private Lecture[] getLectureArray() {
        return lectureArray;
    }

}
