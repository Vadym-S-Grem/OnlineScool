package com.OnlineShcool.serviсes;

import com.OnlineShcool.models.Teacher;
import com.OnlineShcool.repository.TeacherRepo;

import java.util.Arrays;

public class TeacherSrc {
    public void showID () {
        TeacherRepo teacherRepo = new TeacherRepo();
        //System.out.println(Arrays.toString(teacherRepo.teacherArray();
    }
    public Teacher teacherCreation( ) {
        return new Teacher();
    }
}
