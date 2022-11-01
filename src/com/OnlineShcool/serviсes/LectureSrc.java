package com.OnlineShcool.serviсes;

import com.OnlineShcool.models.Lecture;

public class LectureSrc {
    LectureSrc lectureSrc = new LectureSrc();
    public Lecture lectureCreation(String string) {
        return new Lecture(string);
    }
}
