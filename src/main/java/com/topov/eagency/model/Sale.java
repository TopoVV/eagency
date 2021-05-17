package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sale {
    private Long saleId;
    private SaleType saleType;
    private Integer price;
    private Long estateId;
    private Long owner;
}
