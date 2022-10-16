package com.OnlineScool.Models;

public class AdditionalMaterials {
    private static int additionalMaterials_ID;
    private String additionalMaterials_Name;

    public void newAdditionalMaterial() {
        additionalMaterials_ID++;
        System.out.println("AdditionalMaterial ID   — " + additionalMaterials_ID);
        System.out.println("AdditionalMaterial Name — " + additionalMaterials_Name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public AdditionalMaterials(String additionalMaterials_Name) {
        this.additionalMaterials_Name = additionalMaterials_Name;
    }
}
