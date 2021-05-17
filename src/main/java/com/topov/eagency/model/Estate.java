package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Estate {
    private Long estateId;
    private Integer houseNumber;
    private Long landArea;
    private Long livingArea;
    private Integer amountOfRooms;
    private Integer amountOfFloors;
    private Long estateTypeId;
    private Long regionId;
    private Long streetId;

}
