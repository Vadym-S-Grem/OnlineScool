package com.OnlineShcool.models;

public class Teacher {
    private static int teacher_ID;
    private String teacher_Name;

    public Teacher() {
    }

    public Teacher(String teacher_Name, int teacher_ID) {
        this.teacher_Name = teacher_Name;
        this.teacher_ID = teacher_ID;
    }

    public Teacher newTeacher(String teacher_Name, int teacher_ID) {
        return new Teacher(teacher_Name, teacher_ID);
    }

    public Teacher(String teacher_Name) {
        this.teacher_Name = teacher_Name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_Name='" + teacher_Name + '\'' +
                '}';
    }
}
