package com.OnlineScool.serviсes;

import com.OnlineScool.models.Teacher;

public class TeacherSrc {
    TeacherSrc teacherSrc = new TeacherSrc();
    public Teacher teacherCreation(String teacher_Name) {
        return new Teacher("First Teacher");
    }
}
