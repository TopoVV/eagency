package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccessRole {
    private Long roleId;
    private Roles role;


    public enum Roles {
        CUSTOMER,
        SELLER,
        EAGENT,
        GOD
    }
}
