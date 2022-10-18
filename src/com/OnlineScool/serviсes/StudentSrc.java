package com.OnlineScool.serviсes;

import com.OnlineScool.models.Student;

public class StudentSrc {
    StudentSrc studentSrc = new StudentSrc();
    public Student studentCreation(String student_Name) {
        return new Student("First Student");
    }
}
