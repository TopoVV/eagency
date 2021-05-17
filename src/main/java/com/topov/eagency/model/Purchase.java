package com.topov.eagency.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Purchase {
    private Long purchaseId;
    private Long customerId;
    private Long saleId;
    private Long eAgentId;
}
