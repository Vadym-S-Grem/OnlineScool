package com.OnlineScool.serviсes;

import com.OnlineScool.models.AdditionalMaterial;

public class AdditionalMaterialSrc {
    AdditionalMaterialSrc additionalMaterialSrc = new AdditionalMaterialSrc();
    public AdditionalMaterial additionalMaterialCreation(String additionalMaterial_Name) {
        return new AdditionalMaterial("First AdditionalMaterial");
    }
}
