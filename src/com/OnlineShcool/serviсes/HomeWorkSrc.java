package com.OnlineShcool.serviсes;

import com.OnlineShcool.models.HomeWork;

public class HomeWorkSrc {
    HomeWorkSrc homeWorkSrc = new HomeWorkSrc();
    public HomeWork homeWorkCreation(String homeWork_Name) {
        return new HomeWork("First HomeWork");
    }
}
