package com.OnlineScool.Models;

public class Teachers {
    private static int teachers_ID;
    private String teachers_Name;

    public void newTeacher() {
        teachers_ID++;
        System.out.println("Teacher ID   — " + teachers_ID);
        System.out.println("Teacher Name — " + teachers_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Teachers (String teachers_Name) {
        this.teachers_Name = teachers_Name;
    }
}
