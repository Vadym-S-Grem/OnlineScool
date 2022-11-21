package com.OnlineShcool.models;

import com.OnlineShcool.MethodMain;
import com.OnlineShcool.repository.*;
import java.util.Scanner;

public class AdditionalMaterial {
    Scanner scannerAdditionalMaterial = new Scanner(System.in);
    private static int additionalMaterial_ID;
    private String additionalMaterial_Name;

    public void menuAdditionalMaterial() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Selected category...—> AdditionalMaterial     |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|     Create a new ...    |        Function         |");
        System.out.println("| AdditionalMaterial.—> 1 | Show IDs...........—> 2 |");
        System.out.println("| Main menu..........—> 9 | Search.............—> 3 |");
        System.out.println("| Exit the Program...—> 0 | Delete.............—> 4 |");
        System.out.println("|---------------------------------------------------|");

        byte categoryNumberAdditionalMaterial = scannerAdditionalMaterial.nextByte();
        switch (categoryNumberAdditionalMaterial) {
            case 1:
                AdditionalMaterialRepo аdditionalMaterialRepo = new AdditionalMaterialRepo();
                //аdditionalMaterialRepo.addAdditionalMaterial();
                scannerAdditionalMaterial.close();
                break;
            case 2:
                menuAdditionalMaterial();
                scannerAdditionalMaterial.close();
                break;
            case 3:
                menuAdditionalMaterial();
                scannerAdditionalMaterial.close();
                break;
            case 4:
                menuAdditionalMaterial();
                scannerAdditionalMaterial.close();
                break;
            case 9:
                MethodMain.startMenu();
                scannerAdditionalMaterial.close();
                break;
            case 0:
                MethodMain.stopProgram();
                scannerAdditionalMaterial.close();
                break;
            default:
                if ((categoryNumberAdditionalMaterial >= -128 & categoryNumberAdditionalMaterial <= 127) & (categoryNumberAdditionalMaterial < 0 ^ categoryNumberAdditionalMaterial > 4)) {

                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuAdditionalMaterial();
                } else if (categoryNumberAdditionalMaterial != 9) {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|           !!!   Incorrect number   !!!            |");
                    System.out.println("|---------------------------------------------------|");
                    menuAdditionalMaterial();
                } else {
                    break;
                }
        }
    }
}

//    public void newAdditionalMaterial() {
//        additionalMaterial_ID++;
//        System.out.println("AdditionalMaterial ID   — " + additionalMaterial_ID);
//        System.out.println("AdditionalMaterial Name — " + additionalMaterial_Name);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//    }
//
//    public AdditionalMaterial(String additionalMaterial_Name) {
//        this.additionalMaterial_Name = additionalMaterial_Name;
//    }

