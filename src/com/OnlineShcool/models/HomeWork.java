package com.OnlineScool.models;

public class HomeWork {
    private static int homeWork_ID;
    private String homeWork_Name;

    public void newHomeWork() {
        homeWork_ID++;
        System.out.println("HomeWork ID   — " + homeWork_ID);
        System.out.println("HomeWork Name — " + homeWork_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public HomeWork(String homeWork_Name) {
        this.homeWork_Name = homeWork_Name;
    }
}
