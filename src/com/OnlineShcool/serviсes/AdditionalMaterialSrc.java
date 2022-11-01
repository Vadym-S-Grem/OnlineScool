package com.OnlineShcool.serviсes;

import com.OnlineShcool.models.AdditionalMaterial;

public class AdditionalMaterialSrc {
    AdditionalMaterialSrc additionalMaterialSrc = new AdditionalMaterialSrc();
    public AdditionalMaterial additionalMaterialCreation(String additionalMaterial_Name) {
        return new AdditionalMaterial("First AdditionalMaterial");
    }
}
