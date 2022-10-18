package com.OnlineScool.models;

public class Lectur {
    private static int lectur_ID;
    private String lectur_Name;
    private String teacher_Name;

    public void newLectur() {
        lectur_ID++;
        System.out.println("Lectur ID   — " + lectur_ID);
        System.out.println("Lectur Name — " + lectur_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public Lectur(String lectur_Name) {
        this.lectur_Name = lectur_Name;
    }

}