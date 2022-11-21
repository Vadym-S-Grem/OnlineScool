package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.*;

import java.util.Scanner;

public class HomeWork {

    Scanner scannerHomeWork = new Scanner(System.in);
    private static int homeWork_ID;
    private String homeWork_Name;

    public void menuHomeWork() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|          Selected category...—> HomeWork          |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| HomeWork...........—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberHomeWork = scannerHomeWork.nextByte();
        switch (categoryNumberHomeWork) {
            case 1:
                HomeWorkRepo homeWorkRepo = new HomeWorkRepo();
                //homeWorkRepo.addHomeWork();
                scannerHomeWork.close();
                break;
            case 2:
                menuHomeWork();
                scannerHomeWork.close();
                break;
            case 3:
                menuHomeWork();
                scannerHomeWork.close();
                break;
            case 4:
                menuHomeWork();
                scannerHomeWork.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerHomeWork.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerHomeWork.close();
                break;
            default:
                if ((categoryNumberHomeWork >= -128 & categoryNumberHomeWork <= 127) & (categoryNumberHomeWork < 0 ^ categoryNumberHomeWork > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuHomeWork();
                } else if (categoryNumberHomeWork != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuHomeWork();
                } else {
                    break;
                }
        }
    }

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
