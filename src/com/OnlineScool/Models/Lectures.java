package com.OnlineScool.Models;

public class Lectures {
    private static int lectures_ID;
    private String lectures_Name;
    private String teachers_Name;

    public void newLectur() {
        lectures_ID++;
        System.out.println("Lectur ID   — " + lectures_ID);
        System.out.println("Lectur Name — " + lectures_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public Lectures(String lectures_Name) {
        this.lectures_Name = lectures_Name;
    }

}