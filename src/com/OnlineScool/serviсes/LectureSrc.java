package com.OnlineScool.serviсes;

import com.OnlineScool.models.Lecture;

import java.util.Scanner;

public class LectureSrc {
    LectureSrc lectureSrc = new LectureSrc();
    public Lecture lectureCreation(String string) {
        return new Lecture(string);
    }
}
