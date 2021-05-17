package com.topov.eagency.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Deal {
    private Long dealId;
    private Long purchaseId;
    private Long eAgentId;
}
