package com.OnlineScool.serviсes;

import com.OnlineScool.models.Lecture;

public class LectureSrc {
    LectureSrc lectureSrc = new LectureSrc();
    public Lecture lectureCreation(String lecture_Name) {
        return new Lecture("First Lecture", 1);
    }
}
