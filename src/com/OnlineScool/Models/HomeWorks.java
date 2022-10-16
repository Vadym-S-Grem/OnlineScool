package com.OnlineScool.Models;

public class HomeWorks {
    private static int homeWorks_ID;
    private String homeWorks_Name;

    public void newHomeWork() {
        homeWorks_ID++;
        System.out.println("HomeWorks ID   — " + homeWorks_ID);
        System.out.println("HomeWorks Name — " + homeWorks_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public HomeWorks (String homeWorks_Name) {
        this.homeWorks_Name = homeWorks_Name;
    }
}
