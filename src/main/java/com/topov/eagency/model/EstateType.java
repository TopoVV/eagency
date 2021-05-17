package com.topov.eagency.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EstateType {
    private Long estateTypeId;
    private EstateTypes estateType;

    public enum EstateTypes {
        HOUSE,
        APARTMENT,
        LAND
    }
}
