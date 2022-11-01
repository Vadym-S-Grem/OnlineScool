package com.OnlineScool.models;

public class AdditionalMaterial {
    private static int additionalMaterial_ID;
    private String additionalMaterial_Name;

    public void newAdditionalMaterial() {
        additionalMaterial_ID++;
        System.out.println("AdditionalMaterial ID   — " + additionalMaterial_ID);
        System.out.println("AdditionalMaterial Name — " + additionalMaterial_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public AdditionalMaterial(String additionalMaterial_Name) {
        this.additionalMaterial_Name = additionalMaterial_Name;
    }
}
